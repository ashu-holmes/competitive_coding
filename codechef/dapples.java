import java.util.*;
public class dapples {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt(),p,i,j;
     long n,k;
     for(p=0;p<t;p++)
     { 
      n=in.nextLong();
      k=in.nextLong();
      if(n%(k*k)==0)
          System.out.println("NO");
      else
          System.out.println("YES");
     }
    }
    
}
