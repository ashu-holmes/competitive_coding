import java.util.*;
class chefvote {
   public static void main(String args[])
   {
    Scanner in =new Scanner(System.in);
    int t=in.nextInt();
    int n,i,j,k,p;
    for(p=0;p<t;p++)
    {
     n=in.nextInt();
     int m=n,c=0;
     int a[]=new int[n];
     int b[]=new int[n];
     int sum=0;
     for(i=0;i<n;i++)
     {
      a[i]=in.nextInt();
      sum=sum+a[i];
      m=m-a[i];
      if(m<0||a[i]>=n)
          c=1; 
     }
     if(sum!=n) c=1;
     if(c==1)
         System.out.println("-1");
     else
     {
        j=0; 
        for(i=0;i<n;i++)
        {
          j=i;  
          while(a[i]>0)
          {
            if(i!=j&&b[j]==0)
            {b[j]=i+1;a[i]--;}
            j++;
            if(j==n) j=0;
          }
        }
        for(i=0;i<n;i++)
            System.out.print(b[i]+" ");
        System.out.println();
     }
    }
   }
}
