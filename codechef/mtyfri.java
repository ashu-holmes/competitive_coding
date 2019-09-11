import java.util.*;
class mtyfri {
   public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);   
    int t=in.nextInt(),temp,n,i,j,k,p,m;
    for(p=0;p<t;p++)
    {
     n=in.nextInt();
     k=in.nextInt();
     int s=(int)Math.ceil(n/2.0);
     int motu[]=new int[s];
     int tomu[]=new int[n/2];
     j=0;m=0;
     for(i=0;i<n;i++)
     {
      if(i%2==0) {motu[j]=in.nextInt();j++;}
      else {tomu[m]=in.nextInt();m++;}
     }
     Arrays.sort(motu);
     Arrays.sort(tomu);
     for(i=0;i<(int)Math.min(k,n/2);i++)
     {
       if(tomu[i]>motu[s-i-1])
           break;
       temp=tomu[i];
       tomu[i]=motu[s-i-1];
       motu[s-i-1]=temp;
     }
     int ms=0,ts=0;
     for(i=0;i<motu.length;i++)
         ms+=motu[i];
     for(i=0;i<tomu.length;i++)
         ts+=tomu[i];
     if(ts>ms) System.out.println("YES");
     else System.out.println("NO");
    }
   }
}
