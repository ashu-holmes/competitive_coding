import java.util.*;
class bal {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt(),i,j,k;
      long a[]=new long[n],p=1000000007,s=1;
      for(i=0;i<n;i++)
      { a[i]=in.nextLong();s=(s%p*a[i]%p)%p;}
      long hcf=findGCD(a,n);
      for(i=0;i<n;i++)
          a[i]=a[i]/hcf;
      long prod=1;
      for(i=0;i<n;i++)
      prod=(prod%p*a[i]%p)%p;
      long res=(power(prod,n+1,p)*(hcf%p))%p;
      if(hcf==1) System.out.println("justdoit");
      else
      System.out.println(res/s);
    }
    static long findGCD(long arr[], int n)
{
    long result = arr[0];
    for (int i=1; i<n; i++)
        result = gcd(arr[i], result);
 
    return result;
}
    static long gcd(long a, long b)
{
    if (a == 0)
        return b;
    return gcd(b%a, a);
}
 static long power(long x, long y, long p)
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
