import java.io.*;
import java.util.*;
class coco {
     public static void main(String[] args)throws IOException
     {
       Scanner in=new Scanner(System.in);     
       int n=in.nextInt(),k=in.nextInt(),m=in.nextInt(),i,j;
       int a[]=new int[m];
       for(i=0;i<m;i++) a[i]=in.nextInt();
       long dp[][]=new long[m+1][7000000];
       for(i=0;i<=m;i++) Arrays.fill(dp[i],Integer.MIN_VALUE);
       dp[0][k]=1;
       for(i=0;i<=m;i++) dp[i][0]=1;
       for(i=1;i<=m;i++)
       {
         for(j=0;j<=3000000;j++)
         {
           if(j>n-1&&j-a[i-1]<n)
               dp[i][j]=Math.max(dp[i][j],1+dp[i-1][Math.max(0,j-a[i-1])]);
           else
               dp[i][j]=Math.max(dp[i][j],dp[i-1][Math.max(0,j-a[i-1])]);
           if(j<n&&j+a[i-1]>n-1)
               dp[i][j]=Math.max(dp[i][j],dp[i-1][j+a[i-1]]);
           else
               dp[i][j]=Math.max(dp[i][j], dp[i-1][j+a[i-1]]);
         }
       }
       long max=0L;
       for(j=0;j<7000000;j++)
       max=Math.max(max,dp[m][j]);    
       System.out.println(max);
     }
}
