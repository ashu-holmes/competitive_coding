import java.util.*;
class plusmul {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,k,p;
      long c=1000000000+7;
      for(p=0;p<t;p++)
      {
         int n=in.nextInt();
         long sum=0L,pro=1L;
         long a[]=new long[n];
         for(i=0;i<n;i++)
         {
             a[i]=in.nextLong();
             sum=((sum%c)+(a[i]%c))%c;
             pro=((pro%c)*(a[i]%c))%c;
         }
         long res=power(2,n-2,c);
         long s=((sum%c)+(pro%c))%c;
         long ans=(res*(s%c))%c;
         if(n==1) 
             System.out.println(a[0]);
         else if(n==2)
             System.out.println(a[0]+a[1]+a[0]*a[1]);
         else
         System.out.println(ans);
      }
    }
    static long power(long x,long y, long p)
{
    long res = 1L;      // Initialize result
 
    x = x % p;  // Update x if it is more than or 
                // equal to p
 
    while (y > 0)
    {
        // If y is odd, multiply x with result
        if ((y & 1)!=0)
            res = (res*x) % p;
 
        // y must be even now
        y = y>>1; // y = y/2
        x = (x*x) % p;  
    }
    return res;
}
}
