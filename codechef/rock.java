import java.util.*;
import java.io.*;
public class rock {
    static class pair
    {
     int x,y;
     pair(int a,int b)
     {
       x=a;y=b;  
     }
    }
    static int front,rear,mat[][],res;
    static pair q[];
    static boolean  visited[][];
    static void push(pair i)
    {
      q[rear++]=i;  
    }
    static pair pop()
    {
      return q[front++];  
    }
    static boolean isEmpty()
    {
      return front==rear;  
    }
    static void init(int m,int n)
    {
     front=0;
     rear=0;
     int i,j;
     for(i=0;i<m;i++)
         for(j=0;j<n;j++)
             visited[i][j]=false;
    }
    static void bfs(int x,int y,int m,int n,int height)
    {
      visited[x][y]=true;
      push(new pair(x,y));
      pair temp=null;
      int a,b,i,j;
      while(!isEmpty())
      {
        temp=pop();
        //System.out.println(temp.x+" "+temp.y+" "+height);
        if(mat[temp.x][temp.y]==3) {res=height;return;}
        a=temp.x;
        b=temp.y+1;
        if(a>=0&&a<m&&b>=0&&b<n&&!visited[a][b]&&mat[a][b]!=0)
        {push(new pair(a,b));visited[a][b]=true;}
         a=temp.x;
        b=temp.y-1;
        if(a>=0&&a<m&&b>=0&&b<n&&!visited[a][b]&&mat[a][b]!=0)
        {push(new pair(a,b));visited[a][b]=true;}
        for(i=1;i<=height;i++)
        {
           a=temp.x+i;
        b=temp.y;
        if(a>=0&&a<m&&b>=0&&b<n&&!visited[a][b]&&mat[a][b]!=0)
        {push(new pair(a,b));visited[a][b]=true;}
         a=temp.x-i;
        b=temp.y;
        if(a>=0&&a<m&&b>=0&&b<n&&!visited[a][b]&&mat[a][b]!=0)
        {push(new pair(a,b));visited[a][b]=true;}
        }//height
      }//empty
    }//bfs
     public static void main(String[] args)throws IOException
     {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),p,i,j,k,m,n;
      for(p=0;p<t;p++)
      {
        m=in.nextInt();
        n=in.nextInt();
        q=new pair[(m+1)*(n+1)];
        mat=new int[m][n];
        visited=new boolean[m][n];
        for(i=0;i<m;i++)
            for(j=0;j<n;j++)
                mat[i][j]=in.nextInt();
        int h,ans=0;
        for(h=1;h<n;h++)
        {
          init(m,n);
          res=0;
          bfs(m-1,0,m,n,h);
          if(res>0) {ans=res;break;}
        }
        System.out.println(ans);
      }
     }
}
