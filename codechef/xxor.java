import java.io.*;
import java.util.*;
class xxor {
    public static void main(String args[])
    {
     //Scanner in=new Scanner(System.in);
     FastReader in=new FastReader();
     int p,n=in.nextInt(),q=in.nextInt(),i,j,k;
     long a[]=new long[n+1];
     for(i=1;i<=n;i++)
         a[i]=in.nextLong();
     int bits[][]=new int[n+1][31];
     Arrays.fill(bits[0], 0);
     for(i=1;i<=n;i++)
     {
       for(j=0;j<31;j++)
       {
         if((a[i]&(1<<j))!=0) bits[i][j]=bits[i-1][j]+1;
         else bits[i][j]=bits[i-1][j];
       }   
     }
     int l,r,set,unset;
     for(p=0;p<q;p++)
     {
        l=in.nextInt();
        r=in.nextInt();
        long x=0L;
        for(j=0;j<31;j++)
        {
         set=bits[r][j]-bits[l-1][j];
         unset=r-l+1-set;
         if(unset>set)
             x=x+power(2L,j);
        }
        System.out.println(x);
     }
    }
    static long power(long x, int y)
{
    long res = 1;     // Initialize result
  
    while (y > 0)
    {
        // If y is odd, multiply x with result
        if ((y & 1)!=0)
            res = res*x;
  
        // n must be even now
        y = y>>1; // y = y/2
        x = x*x;  // Change x to x^2
    }
    return res;
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
