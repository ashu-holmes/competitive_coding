import java.util.*;
class snakeproc {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int r=in.nextInt();
     int i,j,k,len;
     for(int p=0;p<r;p++)
     {
      len=in.nextInt();
      String b=in.nextLine();
      String s=in.nextLine();
      char c=' ';
      int h=0,t=0,ans=0;
      for(i=0;i<len;i++)
      {
       c=s.charAt(i);
       if(c=='H') h++;
       if(c=='T') t++;
       if(h-t!=1&&h-t!=0)
       {ans=1;break;}
      }
      if(h!=t) ans=1;
      if(ans==0) System.out.println("Valid");
      else System.out.println("Invalid");
     }
    }
}
