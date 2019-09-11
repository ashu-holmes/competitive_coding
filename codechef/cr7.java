import java.io.*;
import java.util.*;
class cr7 {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     int n,m,x,k,i,j,p,ev,od,count;
     char ch=' ';
     for(p=0;p<t;p++)
     {
       ev=0;od=0;count=0;
       int suc=0;
       n=in.nextInt();
       m=in.nextInt();
       x=in.nextInt();
       k=in.nextInt();
       String h=in.nextLine();
       String s=in.nextLine();
       Arrays.fill(months, 0);
       for(i=0;i<k;i++)
       {
         ch=s.charAt(i);
         if(ch=='E') ev++;
         if(ch=='O') od++;
       }
       ev=ev
       if(suc==1) System.out.println("yes");
       else System.out.println("no");
     }
    }
}
