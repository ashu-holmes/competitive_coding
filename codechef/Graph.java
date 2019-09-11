import java.io.*;
import java.util.*;
 
// This class represents a directed graph using adjacency list
// representation
class Graph
{
    private int V;   // No. of vertices
 
    // Array  of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];
    int curmax;
    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
        
        curmax=Integer.MIN_VALUE;
        
    }
 
    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w);
        // Add w to v's list.
        adj[w].add(v);
    }
 
    // A function used by DFS
    void DFSUtil(int v,boolean visited[],int a[])
    {
        // Mark the current node as visited and print it
        visited[v] = true;
        //System.out.print(v+" ");
        if(a[v]>curmax) curmax=a[v];
        
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited,a);
        }
    }
 
 
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,k,p,u,v,n,m;
      Graph g[]=new Graph[t];
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       m=in.nextInt();
       g[p]=new Graph(n);
       int a[]=new int[n];
       for(i=0;i<m;i++)
       {
         u=in.nextInt();
         v=in.nextInt();
         g[p].addEdge(u-1,v-1);
         a[u-1]++;
        a[v-1]++;
       }
       int d[]=new int[n];
       for(i=0;i<n;i++)
       {
         d[a[i]]++;  
       }
       for(i=1;i<n;i++)
       {
         d[i]=d[i]+d[i-1];  
       }
       int max[]=new int[n],count=0;
       boolean visited[]=new boolean[n];
       for(i=0;i<n;i++)
       {
        if(!visited[i]) 
        {count++;g[p].curmax=Integer.MIN_VALUE;g[p].DFSUtil(i,visited,a);max[g[p].curmax]++;}   
       }
       for(i=0;i<n;i++)
       {
         if(max[i]>0) {count=count-max[i];}
         System.out.print(d[i]+count-1+" ");
       }
       System.out.println();
      }
    }
}