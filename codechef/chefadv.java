import java.util.*;
import java.io.*;
class chefadv {
  public static void main(String args[]) throws IOException
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,p;
      long n,m,x,y;
      for(p=0;p<t;p++)
      {
       n=in.nextLong();
       m=in.nextLong();
       x=in.nextLong();
       y=in.nextLong();
       if(n==1&&m==1) 
           System.out.println("Chefirnemo");
       else if(n==2&&m==2)
           System.out.println("Chefirnemo");
       else if(n==1&&(m-1)%y==0&&(m-1)>=y)
           System.out.println("Chefirnemo");
       else if(m==1&&(n-1)%x==0&&(n-1)>=x)
           System.out.println("Chefirnemo");
       else if(m==2&&(n-2)%x==0&&(n-2)>=x)
           System.out.println("Chefirnemo");
       else if(n==2&&(m-2)%y==0&&(m-2)>=y)
           System.out.println("Chefirnemo");
       else if((n-1)%x==0&&(m-1)%y==0&&(n-1)>=x&&(m-1)>=y)
       {
         System.out.println("Chefirnemo");  
       }
       else if((n-2)%x==0&&(m-2)%y==0&&(n-2)>=x&&(m-2)>=y)
         System.out.println("Chefirnemo");
       else
         System.out.println("Pofik");  
      }
    }  
}
