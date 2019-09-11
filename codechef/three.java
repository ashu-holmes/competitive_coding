import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.StringTokenizer;
class three {
    public static void main(String args[])
    {
      FastReader in=new FastReader();
      int t=in.nextInt(),n,m,i,j,k,p,r,beg,fin;
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       m=in.nextInt();
       int a[][]=new int[3][n+1];
       for(i=0;i<m;i++)
       {
        r=in.nextInt();
        beg=in.nextInt();
        fin=in.nextInt();
        a[r-1][beg-1]++;
        a[r-1][fin]--;
       }
       
       
         for(j=1;j<=n;j++)
         {
          a[0][j]=a[0][j-1]+a[0][j];
         }
       for(j=1;j<=n;j++)
         {
          a[1][j]=a[1][j-1]+a[1][j];
         }
       for(j=1;j<=n;j++)
         {
          a[2][j]=a[2][j-1]+a[2][j];
         }
       int res=getMaxArea(a[0],n+1);
         for(j=1;j<=n;j++)
         {
          if(a[1][j]>0)   
          a[1][j]=a[1-1][j]+a[1][j];
         }
        res=(int)Math.max(res,getMaxArea(a[1],n+1));
         for(j=1;j<=n;j++)
         {
          if(a[2][j]>0)   
          a[2][j]=a[2-1][j]+a[2][j];
         }
        res=(int)Math.max(res,getMaxArea(a[2],n+1));
       System.out.println(res);
      }
    }
    
    static int getMaxArea(int hist[], int n) 
    {
        
        Stack<Integer> s = new Stack<>();
         
        int max_area = 0; // Initialize max area
        int tp;  // To store top of stack
        int area_with_top; // To store area with top bar as the smallest bar
      
        // Run through all bars of given histogram
        int i = 0;
        while (i < n)
        {
            
            if (s.empty() || hist[s.peek()] <= hist[i])
                s.push(i++);
      
           
            else
            {
                tp = s.peek();  // store the top index
                s.pop();  // pop the top
      
                // Calculate the area with hist[tp] stack as smallest bar
                area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
      
                // update max area, if needed
                if (max_area < area_with_top)
                    max_area = area_with_top;
            }
        }
      
        
        while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);
      
            if (max_area < area_with_top)
                max_area = area_with_top;
        }
      
        return max_area;
 
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
