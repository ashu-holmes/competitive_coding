import java.io.*;
import java.util.*;
class eko {
  public static void main(String[] args)throws IOException
  {
   FastReader in=new FastReader();
   int n=in.nextInt(),i;
   long m=in.nextLong(),t=-1;
   long a[]=new long[n];
   for(i=0;i<n;i++)
   {a[i]=in.nextLong();if(a[i]>t)t=a[i];}
   //Arrays.sort(a);
   System.out.println(bs(a,n,m,t));   
  }
  public static long bs(long[] a,int n,long m,long t)
  {
    long low=1,high=t,mid;
    long k,max=0;
    while(low<high)
    {
      mid=low+(high-low)/2;
      k=check(mid,a,n);
      if(k>=m)
      {
       max=Math.max(mid,max);
       low=mid+1;
      }
      else
          high=mid;
    }
    return max;
  }
  public static long check(long num,long[] a,int n)
  {
    long count=0L;
    for(int i=0;i<n;i++)
    {
     if(a[i]>num)   
     count=count+a[i]-num;
    }
    return count;
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
