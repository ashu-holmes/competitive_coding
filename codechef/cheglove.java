import java.io.*;
import java.util.*;
class cheglove {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt();
      int p,n,i,j,k,ch1,ch2;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        ch1=0;ch2=0;
        int h[]=new int[n+1];
        int g[]=new int[n+1];
        for(i=1;i<=n;i++)
            h[i]=in.nextInt();
        for(i=1;i<=n;i++)
        {
         g[i]=in.nextInt();
         if(h[i]>g[i]) ch1=1;
        }
        for(i=1;i<=n;i++)
        {
          if(h[i]>g[n+1-i]) ch2=1;  
        }
        if(ch1==1&&ch2==1)
            System.out.println("none");
        else if(ch1==1)
            System.out.println("back");
        else if(ch2==1)
            System.out.println("front");
        else
            System.out.println("both");
      }
    }
}