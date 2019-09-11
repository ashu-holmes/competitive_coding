import java.util.*;
import java.io.*;
public class barca1 {
    public static void main(String args[]) throws IOException
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt(),p,i,j,q=in.nextInt(),l,r;
     int a[]=new int[n];
     for(i=0;i<n;i++) a[i]=in.nextInt();
     int res[]=new int[n+1];
     for(i=31;i>=1;i--)
     {
       for(j=0;j<n;j++)
       {
       if(res[j+1]!=1&&(a[j] & (1 << i)) >= 1 && (a[j] & (1 << (i-1))) >= 1)
           res[j+1]=1;
       }   
     }
     for(i=1;i<=n;i++)
         res[i]=res[i]+res[i-1];
     for(p=0;p<q;p++)
     {
       l=in.nextInt();
       r=in.nextInt();
       System.out.println(res[r]-res[l-1]);
     }
    }
}
