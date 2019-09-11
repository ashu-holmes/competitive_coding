import java.io.*;
import java.util.*;
class books1 {
    public static void main(String[] args)throws IOException
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt(),m,p,i,j,k;
     for(p=0;p<n;p++)
     {
      m=in.nextInt();
      k=in.nextInt();
      long a[]=new long[m],sum=0;
      for(i=0;i<m;i++)
      {a[i]=in.nextLong();sum=sum+a[i];}
      long ans=bs(a,m,k,sum);
     sum=0;
     int count=1;
     String s="";
     for(i=m-1;i>=0;i--)
     {
      
      if(sum+a[i]>ans||i==k-count-1)
      {
        sum=0;
        s="/ "+s;
        count++;
      }
      sum+=a[i];s=" "+s;
      s=Long.toString(a[i])+s;
     }
     System.out.println(s);
     }
    }
    static long bs(long[] a,int m,int k,long sum)
    {
      int temp;
      long min=Long.MAX_VALUE,low=1,high=sum,mid;
      while(low<high)
      {
        mid=low+(high-low)/2;   
        temp=check(a,m,mid);  
        if(temp<=k)
        {
          min=Math.min(min,mid);
          high=mid;
        }
        else
            low=mid+1;
      }
      return min;
    }
    static int check(long[] a,int m,long mid)
    {
     int count=1,i;
     long sum=0;
     for(i=0;i<m;i++)
     {
      if(a[i]>mid)
      {count=Integer.MAX_VALUE;break;}
      if(sum+a[i]>mid)
      {
        sum=0;
        count++;
      }
      sum+=a[i];
     }
     return count;
    }
}
