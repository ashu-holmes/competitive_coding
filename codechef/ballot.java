import java.io.*;
import java.util.*;
public class ballot {
    public static void main(String[] args)throws IOException
    {
     Scanner in=new Scanner(System.in);
     int i,j,k,p,n=in.nextInt(),b=in.nextInt();
     while(n!=-1&&b!=-1)
     {
       int a[]=new int[n];
       for(i=0;i<n;i++)
           a[i]=in.nextInt();
       Arrays.sort(a);
       System.out.println(bs(a,n,b));
       String w=in.nextLine();
       w=in.nextLine();
       n=in.nextInt();b=in.nextInt();
     }
    }
    static int bs(int a[],int n,int b)
    {
      int k,low=1,high=a[n-1],mid,min=Integer.MAX_VALUE;
      while(low<high)
      {
        mid=low+(high-low)/2;
        k=check(mid,a,n);
        if(k<=b)
        {
          min=Math.min(min,mid);  
          high=mid;  
        }
        else
          low=mid+1;  
      }
      return min;
    }
    static int check(int p,int a[],int n)
    {
     int count=0,i,j;
     for(i=0;i<n;i++)
     {
       count+=(a[i]/p);
       if(a[i]%p!=0) count++;
     }
     return count;
    }
}
