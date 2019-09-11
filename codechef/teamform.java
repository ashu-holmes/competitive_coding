import java.util.*;
class teamform {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),u,v,n,m,p,i,j,k;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       m=in.nextInt();
       int ans=n-2*m;
       for(i=0;i<m;i++)
       {
        u=in.nextInt();
        v=in.nextInt();
       }
       if(ans%2==0)
           System.out.println("yes");
       else
           System.out.println("no");
      }
    }
}
