import java.io.*;
import java.util.*;
class ordteams {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);  
      int t=in.nextInt(),i,j,k,p,n;
      double s;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       s=in.nextDouble();
       if(s == 0)
		{	
			for(i = 0; i < n; i++)
				System.out.print("0 ");
		}
		else if(n%2!=0)
		{
			System.out.print("0 ");
			for(i = 0; i < n/2; i++)
				System.out.print(s+" ");
			for(i = 0; i < n/2; i++)
				System.out.print((-s)+" ");
		}
		else
		{
			for(i = 0; i < n/2; i++)
				System.out.print(s*(n/(n-1))+" ");
			for(i = 0; i < n/2; i++)
				System.out.print((-s*(n/(n-1)))+" ");
		}
		System.out.println();
      }
    }
}
