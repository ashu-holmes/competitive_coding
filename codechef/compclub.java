import java.util.*;
class compclub {
    private int V;
    private LinkedList<Integer> adj[];
    compclub(int v)
    {
     V=v;
     adj=new LinkedList[v];
     for(int i=0;i<v;i++)
      adj[i]=new LinkedList();
    }
    void addEdge(int v,int w)
    {
     adj[v].add(w);
     //adj[w].add(v);
    }
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n,t=in.nextInt(),z,i,j,x;
      compclub g[]=new compclub[t];
      for(z=0;z<t;z++)
      {
          
        n=in.nextInt();
        g[z]=new compclub(n);
        x=in.nextInt();
        long level[]=new long[x];
        int p[]=new int[n];
        p[0]=0;//0 is the director
        int c[]=new int[n];
        int k[]=new int[n];
        //int a[][]=new int[n][x];
        for(i=1;i<n;i++)
        {p[i]=in.nextInt();g[z].addEdge(p[i], i);}
        for(i=0;i<n;i++)
            c[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
            k[i]=in.nextInt();
            //a[c[i]][k[i]]++;
        }
        boolean visited[]=new boolean[n];
        //int ans[]=new int[n];
        //Arrays.fill(visited, false);
        long q=1000000000+7;
        for(j=0;j<n;j++)
        {
          Arrays.fill(visited, false);
          Arrays.fill(level,0L);
          g[z].DFSUtil(j,c,k,level,visited,j);
          long ans=1L;
          for(int y=0;y<x;y++)
        {
            if(level[y]!=0)
              ans=((ans%q)*((level[y])%q))%q;  
        }
          System.out.println(ans);
        }
      }
    }
     /* void DFS(int v)
    {
        // Mark all the vertices as not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[V];
 
        // Call the recursive helper function to print DFS traversal
        DFSUtil(v, visited);
    }*/
      void DFSUtil(int v,int c[],int k[],long level[],boolean visited[],int r)
    {
        // Mark the current node as visited and print it
        
        //System.out.print(v+" ");
        visited[v]=true;
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            //System.out.println(v+"  "+n);
            if(!visited[n])
            {DFSUtil(n,c,k,level,visited,r);
            if(c[n]==c[r]&&k[n]<k[r])
            {
              level[k[n]]++;  
            }
            }
        }
    }
}
