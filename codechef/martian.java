import java.io.*;
import java.util.*;
public class martian {
    public static void main(String[] args)throws IOException
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),m=in.nextInt(),i,j,p,k;
      while(n!=0&&m!=0)
      {
       long y[][]=new long[n+1][m+1],b[][]=new long[n+1][m+1];
       for(i=1;i<=n;i++)
       {
         for(j=1;j<=m;j++)
             y[i][j]=in.nextLong();
       }
       for(i=1;i<=n;i++)
       {
         for(j=1;j<=m;j++)
             b[i][j]=in.nextLong();
       }
       long cy[][]=new long[n+1][m+1],cb[][]=new long[n+1][m+1];
       long dp[][]=new long[n+1][m+1];
       for(i=1;i<=n;i++)
       {
         for(j=1;j<=m;j++)
         {
           cy[i][j]=cy[i][j-1]+y[i][j];
           cb[i][j]=cb[i-1][j]+b[i][j];
           dp[i][j]=Math.max(dp[i-1][j]+cy[i][j],dp[i][j-1]+cb[i][j]);
         }
       }
       System.out.println(dp[n][m]);
       n=in.nextInt();m=in.nextInt();
      }
    }
}
