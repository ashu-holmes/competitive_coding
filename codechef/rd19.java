import java.util.*;
class rd19 {
 public static void main(String args[])
 {
  Scanner in=new Scanner(System.in);
  int p,t=in.nextInt(),n,i,j,k;
  for(p=0;p<t;p++)
  {
   n=in.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++)
       a[i]=in.nextInt();
   Arrays.sort(a);
   int result = a[0];
        for (i = 1; i < n; i++)
            result = gcd(a[i], result);
    if(result==1) System.out.println("0");
    else if(a[0]==1) System.out.println((n-1));
    else System.out.println("-1");
  }
 }
 static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
}
