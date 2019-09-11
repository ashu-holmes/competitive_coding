import java.io.*;
import java.util.*;
class sumtrian {
    public static void main(String[] args)throws IOException
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,k,p,n;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        long a[][]=new long[n][n];
        for(i=0;i<n;i++)
        {
          for(j=0;j<=i;j++)
              a[i][j]=in.nextLong();
        }
       long dp[][]=new long[n][n];
       dp[0][0]=a[0][0];
       for(i=1;i<n;i++)
           dp[i][0]=dp[i-1][0]+a[i][0];
       for(i=1;i<n;i++)
       {
         for(j=1;j<n;j++)
         {
          dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-1])+a[i][j];   
         }
       }
       long ans=0L;
       for(i=0;i<n;i++)
           ans=Math.max(ans,dp[n-1][i]);
       System.out.println(ans);
      }
    }
}
