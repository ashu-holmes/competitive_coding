import java.util.*;
class twonums {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),p,i,j,k;
      long a,b,n;
      for(p=0;p<t;p++)
      {
       a=in.nextLong();
       b=in.nextLong();
       n=in.nextLong();
       if(n%2!=0)
           a=2L*a;
       if(a>b) 
           System.out.println(a/b);
       else
           System.out.println(b/a);
      }
    }
}
