import java.util.*;
class plusmul2 {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
      int t=in.nextInt(),i,j,p;
      long c=1000000000+7;
      for(p=0;p<t;p++)
      {
       int n=in.nextInt();
       long a[]=new long[n];
       for(i=0;i<n;i++)
       {
        a[i]=in.nextLong();   
       }
       long total=1L<<n,s=0L,pro=1L,sum=0L,e=0L,count=0L;
       //Set<Long> set=new HashSet<>();
       for(long mask=0L;mask<total;mask++)
       {
          s=0;pro=1L;e=0L;count=0L; 
          for (j=0; j<n; j++)
          {
              if ((mask & (1<<j))!=0)
              {
                pro=((pro%c)*(a[j]%c))%c;
                e=pro;
                count++;
                if(j==n-1)
                {
                   if(count==1) break;  
                  //s=(s%c+a[j]%c)%c;
                  s=((s%c)+(e%c))%c;
                  pro=1L;
                  e=0L;
                }
              }
              else
              {
                  System.out.println("count="+count);
                  if(count==1) break;
                  s=(s%c+a[j]%c)%c;
                  s=((s%c)+(e%c))%c;
                  pro=1L;
                  e=0L;
                  count=0L;
              }
          }
          if(count!=1)
          {sum=((sum%c)+(s%c))%c;}
          System.out.println(sum);
       }
       System.out.println(sum);
      }
    }
}
