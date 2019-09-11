import java.io.*;
import java.util.*;
class codeshare {
    static class pair
    {
       String s;int start;
       pair(String a,int b)
       {
         s=a;start=b;  
       }
    }
    public static void main(String[] args)throws IOException
     {
       Scanner in=new Scanner(System.in);
       int n=in.nextInt(),k=in.nextInt(),i,j;
       int a[]=new int[n];
       for(i=0;i<n;i++) a[i]=in.nextInt();
       ArrayList<pair> list=new ArrayList<>();
       i=0;String temp="";
       int count,st;
       while(i<n)
       {
         st=i;  
         count=0;
         temp="";
         while(count<k&&i<n)
         {
           temp=temp+Integer.toString(a[i]);
           count++;i++;
         }
         list.add(new pair(temp,st));
       }
       Collections.sort(list,(x,y)->x.s.length()==y.s.length()?x.s.compareTo(y.s):x.s.length()-y.s.length());
       j=0;
       int b[]=new int[n];
       Iterator<pair> itr=list.iterator();
       pair d;
       int pk;
       while(itr.hasNext())
       {
         d=itr.next();
         pk=d.start;count=0;
         while(pk<n&&count<k)
         {
          b[j]=a[pk];
          pk++;
          count++;
          j++;
         }
       }
       for(i=0;i<n;i++)
           System.out.print(b[i]+" ");
       System.out.println();
     }
}
