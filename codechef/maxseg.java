import java.util.*;
import java.io.*;
class maxseg {
     public static void main(String args[])
    {
      FastReader in=new FastReader();
      int t=in.nextInt(),p,i,j,k;
      int n;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        int map[]=new int[n];
        int c[]=new int[n];
        long w[]=new long[n];
        //TreeMap<Integer,Integer> map=new TreeMap<>();
        
        long max=Long.MIN_VALUE,sum=0L;
        for(i=0;i<n;i++)
        {c[i]=in.nextInt();map[i]=-1;}
            w[0]=in.nextLong();
        for(i=1;i<n;i++)
            w[i]=w[i-1]+in.nextLong();
        j=0;
        int x;
        for(i=0;i<n;i++)
        {
          x=map[c[i]];
          if(x==-1)
          {map[c[i]]=i;}
          else
          {
            if(j<x+1) j=x+1;
            map[c[i]]=i;
          }
          if(j==0)
              max=find(max,w[i]);
          else
              max=find(max,w[i]-w[j-1]);
        }
        System.out.println(max);
      }
    }
     public static long find(long a,long b)
     {
       if(a>b) return a;
       else return b;
     }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    } 
     
}
