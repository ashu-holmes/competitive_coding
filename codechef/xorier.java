import java.util.*;
import java.io.*;
class xorier {
    public static void main(String args[]) throws IOException
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,p,i,j,k;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        int a[]=new int[n];
        long odd=0,even=0;
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            if(a[i]%2==0) even++;
            else odd++;
        }
        long res=0L;
        HashMap<Integer,Long> map=new HashMap<>();
        //Set<Integer> set=new HashSet<>();
        for(i=0;i<n;i++)
        {
          if(map.get(0^a[i])!=null)
              res=res+map.get(0^a[i]);
          if(map.get(2^a[i])!=null)
             res=res+map.get(2^a[i]);
          map.put(a[i],map.getOrDefault(a[i], 0L)+1);
         
        }
        long ans=(even*(even-1))/2L+(odd*(odd-1))/2L-res;
        System.out.println(ans);
      }
    }
}
