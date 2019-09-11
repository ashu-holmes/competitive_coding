import java.util.*;
import java.util.Collections;

class chefcod {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int n,i,j,p;
      long k;
      n=in.nextInt();
      k=in.nextLong();
      long a[]=new long[n];
      for(p=0;p<n;p++)
      {
       a[p]=in.nextLong();
      }
      Arrays.sort(a);
      long prod,count=0L;
      for (i = 1; i < (1<<n); i++)
        {
            prod=1L;
            for (j = n-1; j >= 0; j--)
            {
                if ((i & (1 << j)) > 0)
                {
                  prod=prod*a[j];  
                }
                if(prod>k) break;
            }
            if(prod<=k) count++;
        }
      System.out.println(count);
    }
}
