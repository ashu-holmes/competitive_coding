import java.util.*;
class sngraph {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,k,p,u,v;
      int n,m;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       m=in.nextInt();
       int a[]=new int[n];
       for(i=0;i<m;i++)
       {
        u=in.nextInt();
        v=in.nextInt();
        a[u-1]++;
        a[v-1]++;
       }
       int d[]=new int[n];
       for(i=0;i<n;i++)
       {
         d[a[i]]++;  
       }
       for(i=1;i<n;i++)
       {
         d[i]=d[i]+d[i-1];  
       }
       for(i=0;i<n;i++)
       {
         if(d[i]==n)
             System.out.print((n-1)+" ");
         else System.out.print(d[i]+" ");
       }
       System.out.println();
      }
    }
}
