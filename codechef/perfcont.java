import java.util.*;
import java.io.*;
class perfcont {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,p,cake,hard,c,h,y;
      int i,j,k,x;
      for(x=0;x<t;x++)
      {
       n=in.nextInt();
       p=in.nextInt();
       cake=0;
       hard=0;
        for(i=0;i<n;i++)
        {
          y=in.nextInt();
          if(y>=p/2) cake++;
          if(y<=p/10) hard++;
        }
        if(cake==1&&hard==2) System.out.println("yes");
        else System.out.println("no");
      }
    }
}
