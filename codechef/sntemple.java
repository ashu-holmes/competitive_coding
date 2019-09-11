import java.util.*;
class sntemple {
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int t=in.nextInt(),n,i,j,k,p;
  for(p=0;p<t;p++)
  {
   n=in.nextInt();
   long a[]=new long[n];
   for(i=0;i<n;i++)
       a[i]=in.nextLong();
   int low=0,high=n-1,count=1;
   for(i=0,j=n-1;i<n&&j>=0;i++,j--);
   {
     if(a[i]<count)
     {
       low=i;
       count=1;
       j=j+1;
       i=i-1;
       continue;
     }
     if(a[j]<count)
     {
       high=  
     }
   }
  }
}
}
