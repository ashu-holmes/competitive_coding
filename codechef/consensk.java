import java.util.*;
class consensk {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt(),n,len,a,b,i,j,k,p;
     for(p=0;p<t;p++)
     {
      n=in.nextInt();
      len=in.nextInt();
      a=in.nextInt();
      b=in.nextInt();
      int s[]=new int[(b-a)/len];
      int x[]=new int[n];
      for(i=0;i<n;i++)
      {
       x[i]=in.nextInt();
      }
      Arrays.sort(x);
      int dist=0;
      for(i=1;i<n;i++)
      {
       if(x[i]<x[i-1]+len)   
       x[i]=x[i]+(int)Math.abs(x[i]-x[i-1]-len);
       dist=dist+(int)Math.abs(x[i]-x[i-1]-len);;
      }
      if(x[0]<a) dist=dist+(a-x[0])*n;
      if(x[n-1]+len>b) dist=dist+(x[n-1]+len-b)*n;
      System.out.println(dist);
     }
    }
}
