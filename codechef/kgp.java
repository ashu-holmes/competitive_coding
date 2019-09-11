import java.io.*;
import java.util.*;
class kgp {
    static int count;
    public static void main(String[] args)throws IOException
     {
       Scanner in=new Scanner(System.in);
       int m=2,n=6,i,j;
       char mat[][]={{'h','p','m','o','l','l'},{'e','l','l','k','h','e'}};
       boolean visited[][]=new boolean[m][n];
       String s="hello";
       count=0;
       for(i=0;i<m;i++)
       {
         for(j=0;j<n;j++)
         {
           if(mat[i][j]==s.charAt(0))
               find(i,j,m,n,mat,visited,0,s);
         }
       }
       System.out.println(count);
     }
    static void find(int i,int j,int m,int n,char[][] mat,boolean[][] visited,int k,String s)
    {
       if(k==s.length()-1&&s.charAt(k)==mat[i][j]) {count++;return;}
       if(k==s.length()-1) return;
       visited[i][j]=true;
       int dirx[]={1,1,1,-1,-1,-1,0,0};
       int diry[]={1,0,-1,1,0,-1,1,-1};
       int p;
       for(p=0;p<8;p++)
       {
         int x=i+dirx[p],y=j+diry[p];  
        if(x<0||x>=m||y<0||y>=n||visited[x][y]||s.charAt(k+1)!=mat[x][y]) continue;
        find(x,y,m,n,mat,visited,k+1,s);        
       }
       visited[i][j]=false;
    }
}
