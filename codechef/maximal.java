import java.util.*;
class maximal {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      int n,i,j,k,p;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       long a[]=new long[n];
       for(i=0;i<n;i++)
           a[i]=in.nextLong();
       long f[]=new long[n];
       long b[]=new long[n];
       long max_so_far = 0, max_ending_here = 0,local=a[0];
       int ch=0;
   for (i = 0; i < n; i++)
   {
       local=(long)Math.max(local, a[i]);
       max_ending_here = max_ending_here + a[i];
       if(a[i]>=0) ch=1;
       if (max_ending_here < 0)
           max_ending_here = 0;
       else if (max_so_far < max_ending_here)
           max_so_far = max_ending_here;
        f[i]=max_ending_here;
   }
   max_ending_here = 0;
   for (i = n-1; i >= 0; i--)
   {
       max_ending_here = max_ending_here + a[i];
       if (max_ending_here < 0)
           max_ending_here = 0;
        b[i]=max_ending_here;
   }
   long ans=(long)Math.max(b[1],f[n-2]);
   for(i=1;i<n-1;i++)
   {
    ans=(long)Math.max(ans,f[i-1]+b[i+1]);
   }
   ans=(long)Math.max(ans,max_so_far);
   if(ch==1)
   System.out.println(ans);
   else
       System.out.println(local);
      }
    }
}
