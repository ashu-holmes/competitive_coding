import java.io.*;
import java.util.*;
public class aggrcow {
    public static void main(String[] args)throws IOException
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,c,i,j,k,p;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();c=in.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++) a[i]=in.nextInt();
        Arrays.sort(a);
        System.out.println(bs(a,n,c));
      }
    }
    public static int bs(int a[],int n,int c)
    {
      int k,low=0,mid,high=a[n-1],max=Integer.MIN_VALUE;
      while(low<high)
      {
        mid=low+(high-low)/2;  
        k=check(mid,a,n);
        if(k>=c)
        {max=(int)Math.max(max,mid);low=mid+1;}
        else
            high=mid;
      }
      return max;  
    }
    public static int check(int dis,int a[],int n)
    {
      int cows=1,pos=a[0],i;
      for(i=1;i<n;i++)
      {
        if(a[i]-pos>=dis)
        {
          cows++;
          pos=a[i];
        }
      }
      return cows;
    }
}
