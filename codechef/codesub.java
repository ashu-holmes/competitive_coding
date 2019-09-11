import java.util.*;
class codesub {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int n,k,p,i,j;
     n=in.nextInt();
     k=in.nextInt();
     p=in.nextInt();
     int a[]=new int[n];
     int b[]=new int[n];
     int count=0;
     for(i=0;i<n;i++)
     {
         a[i]=in.nextInt();
         if(a[i]==1) count++;
         b[i]=count;
     }
     String h=in.nextLine();
     String s=in.nextLine();
     int c[]=new int[n];Integer c1;
     TreeMap<Integer,Integer> tmap=new TreeMap<Integer,Integer>();
     if(k>=n)
     {
        for(i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='?')
              System.out.println(count);
        }
     }
     else
     {   
     for(i=0;i<n;i++)
     {
      if(i==k-1) c[i]=b[i];
      else if(i>k-1) c[i]=b[i]-b[i-k];
      else
          c[i]=b[i]+b[n-1]-b[n-k+i];
      if(i>=k-1)
      {
        c1=tmap.get(c[i]);
        if(c1==null)
         tmap.put(c[i],1);
        else
         tmap.put(c[i],++c1);   
      }
     }
     int start=k-1,end=n-1;
     //for(i=0;i<n;i++) System.out.print(c[i]+" ");
     
     char ch=' ';
     int len=s.length();
     for(i=0;i<len;i++)
     {
       ch=s.charAt(i);
       if(ch=='?')
           System.out.println(tmap.lastKey());
       else
       {
        c1=tmap.get(c[end]);
        if(c1==1) tmap.remove(c[end]);
        else
            tmap.put(c[end],--c1);
        if(end==0) end=n-1;
        else end=end-1;
        if(start==0) start=n-1;
        else start=start-1;
        c1=tmap.get(c[start]);
        if(c1==null) tmap.put(c[start],1);
        else
            tmap.put(c[start],++c1);
       }
     }
    }
    }
}
