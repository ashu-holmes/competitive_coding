import java.io.*;
import java.util.*;
class mixcolor {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,i,j,k,p;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       int a[]=new int[n];
       for(i=0;i<n;i++)
           a[i]=in.nextInt();
       int count=0,ans=0;
       Arrays.sort(a);
       for(i=0;i<n-1;i++)
       {
         if(a[i]==a[i+1])
             count++;
         else
         {ans+=count;count=0;}
       }
       ans+=count;
       System.out.println(ans);
      }
    }
}
