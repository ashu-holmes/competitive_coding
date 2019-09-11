import java.io.*;
import java.util.*;
class bigsale {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int i,j,k,n,t=in.nextInt(),p,q;
      double loss,price,disc,inc;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       loss=0;
       for(i=0;i<n;i++)
       {
        price=in.nextDouble();
        q=in.nextInt();
        disc=in.nextDouble();
        inc=price+price*disc/100.0;
        loss=loss+(price-(inc-inc*disc/100.0))*q;
       }
       System.out.println(loss);
      }
    }
}
