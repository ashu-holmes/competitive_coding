import java.io.IOException;
import java.util.*;
public class football {
     public static void main(String[] args)throws IOException
     {
      Scanner in=new Scanner(System.in);
      int t,p,i,j,k,n,max;
      t=in.nextInt();
      for(p=0;p<t;p++)
      {
        max=0;  
        n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(i=0;i<n;i++)
            a[i]=in.nextInt();
        for(i=0;i<n;i++)
            b[i]=in.nextInt();
        for(i=0;i<n;i++)
        {
          k=a[i]*20-b[i]*10;
          max=(int)Math.max(k,max);
        }
        System.out.println((int)Math.max(0,max));
      }
     }
}
