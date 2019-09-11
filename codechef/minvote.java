import java.io.*;
import java.util.*;
class minvote {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,i,j,k,p;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       int s[]=new int[n+1];
       for(i=1;i<=n;i++)
           s[i]=in.nextInt();
       int cum[]=new int[n+1];
       for(i=1;i<=n;i++)
       {
         cum[i]=cum[i-1]+s[i];   
       }
       int pos1=-1,pos2=-1;
       int vote[]=new int[n+2];
      for(i=1;i<=n;i++)
      {
       pos2=search2(1,i-1,cum,s,i);
       vote[pos2]++; 
       vote[i]--;
       pos1=search1(i,n,cum,s,i);
       vote[i+1]++;
       vote[pos1+1]--;
      }
      int tot=0;
     for(i=1;i<=n;i++)
     {tot=tot+vote[i];System.out.print(tot+" ");}
     System.out.println();
      }
    }
    static int search1(int lo,int hi,int cum[],int s[],int p)
    {
        int res=p+1; 
	while (lo <= hi) {
				int mid = lo + (hi-lo) / 2;
				if (s[p] >= cum[mid - 1] - cum[p]) {
					res = mid;
					lo = mid + 1;
				} else {
					hi = mid - 1;
				}
			}
        return res;
    }
    static int search2(int lo,int hi,int cum[],int s[],int p)
    {
      int res=p;
      while (lo <= hi) {
				int mid = lo + (hi-lo) / 2;
				if (s[p] >= cum[p - 1] - cum[mid]) {
					res = mid;
					hi = mid - 1;
				} else {
					lo = mid + 1;
				}
			}
      return res;
    }
}
