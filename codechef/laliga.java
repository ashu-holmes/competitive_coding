import java.util.*;
public class laliga {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),p,i,j,m,b,r,e,index;
      String h=in.nextLine();
      for(p=0;p<t;p++)
      {
       m=0;r=0;b=0;e=0;   
        for(i=0;i<4;i++)
        {
         String s=in.nextLine();
         index=s.indexOf(' ');
         String s1=s.substring(0,index);
         int x=Integer.parseInt(s.substring(index+1,s.length()));
         if(s1.equals("Barcelona")) b=x;
         else if(s1.equals("Malaga")) m=x;
         else if(s1.equals("Eibar")) e=x;
         else r=x;
        }
        if(r<m&&b>e) System.out.println("Barcelona");
        else System.out.println("RealMadrid");
      }
    }
}
