import java.io.*;
import java.util.*;
class subnew {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);   
     int p,i,j,k,t=in.nextInt(),x;
     for(p=0;p<t;p++)
     {
       x=in.nextInt();
       for(i=0; ;i++)
       {
        j=i*(i+1)/2;
        if(j>=x) break;
       }
       if(j==x) System.out.println(i);
       else
       {
         if((i-1+x-((i-1)*i/2))>(i+(j-x)))
             System.out.println(i+j-x);
         else
             System.out.println((i-1+x-((i-1)*i/2)));
       }
     }
    }
}
