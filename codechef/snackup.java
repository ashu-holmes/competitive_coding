import java.util.*;
class snackup {
public static void main(String args[])
{
  Scanner in=new Scanner(System.in);
  int test=in.nextInt(),p,i,j,n,x,y;
  for(p=0;p<test;p++)
  {
   n=in.nextInt();
   System.out.println(n);
   int t;
   for(i=1;i<=n;i++)
   {
    System.out.println(n);
    t=i;
    for(j=1;j<=n;j++)
    {
     x=t;
     y=++t;
     if(y==n+1) {x=1;y=n;t=1;}        
     System.out.println(j+" "+x+" "+y);
    }
   }
  }
}
}
