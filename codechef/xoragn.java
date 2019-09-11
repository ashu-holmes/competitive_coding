import java.util.*;
class xoragn {
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
   int t=in.nextInt(),p,i,j,k,n;
   for(p=0;p<t;p++)
   {
     n=in.nextInt();
     int res=0;
     for(i=0;i<n;i++)
         res=res^in.nextInt();
     System.out.println((2*res));  
   }
 }
}
