import java.util.*;
import java.io.*;
class chefcoun {
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  int t=in.nextInt(),n,i,j,p;
  
  for(p=0;p<t;p++)
  {
    n=in.nextInt();
   long a[]=new long[n];
   int v=100000;
   long sum=4294967296L;
   for(i=0;i<n;i++)
   {
     if(i!=n-1&&(sum-v)>n-i-1)   
     {
      a[i]=v;
      sum=sum-v;
      v--;
     }
     else if(i!=n)
     {
       a[i]=1;  
       sum--;
     }
     else
         a[i]=sum;
   }
   for(i=0;i<n;i++)
       System.out.print(a[i]+" ");
   System.out.println();
  }
 }
}
