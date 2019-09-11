import java.util.*;
class dbfp {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int p,t=in.nextInt(),n,m,i,j,k;
     long c=1000000000+7,f1,f2,f3;
     for(p=0;p<t;p++)
     {
      f1=0L;f2=0L;f3=0L;   
      m=in.nextInt();
      n=in.nextInt();
      for(i=0;i<m;i++)
          f1=(f1+in.nextLong())%c;
      for(i=0;i<m;i++)
          f2=(f2+in.nextLong())%c;
      for(i=3;i<=n;i++)
      {  f3=(f1+f2)%c;
          f1=f2;
          f2=f3;
      }
      if(n==1) System.out.println((f1*m)%c);
      else if(n==2) System.out.println((f2*m)%c);
      else System.out.println((f3*m)%c);
     }
    }
}
