import java.util.*;
import java.io.*;
public class micemaze {
    public static void main(String[] args)throws IOException
    {
      Scanner in=new Scanner(System.in);
      int a,b,n=in.nextInt(),s=in.nextInt(),t=in.nextInt(),m=in.nextInt(),i,j,k;
      int mat[][]=new int[n][n];
      int dis[]=new int[n];
      Arrays.fill(dis,Integer.MAX_VALUE);
      boolean visited[]=new boolean[n];
      for(i=0;i<m;i++)
      {
       a=in.nextInt();b=in.nextInt();
       mat[b-1][a-1]=in.nextInt();
      }
      dis[s-1]=0;
      int u;
      for(i=0;i<n-1;i++)
      {
        u=find(dis,visited,n);
        visited[u]=true;
        for(j=0;j<n;j++)
        {
         if(!visited[j]&&dis[u]!=Integer.MAX_VALUE&&mat[u][j]!=0&&mat[u][j]+dis[u]<dis[j])
             dis[j]=dis[u]+mat[u][j];
        }
      }
      int ans=0;
      for(i=0;i<n;i++)
          if(dis[i]<=t)
              ans++;
      System.out.println(ans);
    }
    public static int find(int[] dis,boolean[] visited,int n)
    {
      int i,min=Integer.MAX_VALUE,index=-1;
      for(i=0;i<n;i++)
      {
        if(!visited[i]&&dis[i]<=min)
        {
         min=dis[i];
         index=i;
        }
      }
      return index;
    }
}
