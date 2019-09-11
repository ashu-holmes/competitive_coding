import java.io.*;
import java.util.*;
class mex {
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int t=in.nextInt(),n,k,p,i,j;
   int a[]=new int[1000000];
   for(p=0;p<t;p++)
   {
    n=in.nextInt();
    k=in.nextInt();
    Arrays.fill(a,0);
    for(i=0;i<n;i++)
        a[in.nextInt()]++;
    for(i=0;i<1000000;i++)
    {
      if(k==0&&a[i]==0) {break;}
      if(a[i]==0) k--;
    }
    System.out.println(i);
   }
  }
}
