import java.util.*;
import java.io.*;
class magichef {
  public static void main(String args[]) throws IOException
    {
     Scanner in=new Scanner(System.in);
     int i,j,k,n,p,a,b,x,s;
     int t=in.nextInt();
     for(p=0;p<t;p++)
     {
      n=in.nextInt();
      int flip[]=new int[n+1];
      Arrays.fill(flip,0);
      x=in.nextInt();
      flip[x]=1;
      s=in.nextInt();
      int curr=x;
      for(i=0;i<s;i++)
      {
       a=in.nextInt();
       b=in.nextInt();
       if(flip[a]==1)
       {
         flip[a]=0;
         flip[b]=1;
         curr=b;
       }
       else if(flip[b]==1)
       {
          flip[a]=1;
          flip[b]=0;
          curr=a;
       }
      }
      System.out.println(curr);
     }
    }
      
}
