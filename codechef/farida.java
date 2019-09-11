import java.util.*;
import java.io.*;
public class farida {
    public static void main(String[] args)throws IOException
    {
      Scanner in=new Scanner(System.in);  
      int t=in.nextInt(),n,i,j,p;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       long a[]=new long[n],dp[]=new long[n+1];
       //long ans=0L;
       for(i=0;i<n;i++) a[i]=in.nextLong();
       dp[1]=a[0];
       for(i=2;i<=n;i++)
           dp[i]=(long)Math.max(dp[i-1],dp[i-2]+a[i-1]);
       System.out.println("Case "+p+": "+dp[n]);
      }
    }
}
