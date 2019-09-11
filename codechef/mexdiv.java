import java.util.*;
class mexdiv {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);  
      int n=in.nextInt();
      int k=in.nextInt();
      int a[]=new int[n],p=1000000000+7;
      int pres=0,i;
      for(i=0;i<n;i++)
      {
        a[i]=in.nextInt();
        if(a[i]==k) pres=1;
      }
      if(pres==0)
      System.out.println(power(2,n-1,p));
      else
      {
        //Arrays.sort(a);
        for(i=0;i<n;i++)
        {
          if(i!=a[i])
              break;
        }
        if(i<=k)
        {System.out.println(power(2,n-1,p));}
        else
        {
          int b=power(2,n-1,p)-1;
          int c=power(2,n-1-k,p)-1;
          System.out.println((b-c)%p);
        }
      }
    }
    static int power(int x,int y, int p)
{
    int res = 1;      // Initialize result
 
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
