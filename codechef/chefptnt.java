import java.io.*;
import java.util.*;
class chefptnt {
    public static void main(String args[])
    {
     FastReader in =new FastReader();
     int t=in.nextInt();
     int n,m,x,k,i,j,p,ev,od,count;
     char ch=' ';
     //int months[]=new int[12];
     for(p=0;p<t;p++)
     {
       ev=0;od=0;count=0;
       //int suc=0;
       n=in.nextInt();
       m=in.nextInt();
       x=in.nextInt();
       k=in.nextInt();
       //String h=in.nextLine();
       String s=in.nextLine();
       //Arrays.fill(months,0);
       for(i=0;i<k;i++)
       {
         ch=s.charAt(i);
         if(ch=='E') {ev++;}
         if(ch=='O') {od++;}
       }
       for(i=0;i<m;i++)
       {        
         if(i%2!=0)  
         {count+=(int)Math.min(x,ev);ev=ev-(int)Math.min(x,ev);}
         else
         {count+=(int)Math.min(x,od);od=od-(int)Math.min(x,od);}    
         //count+=months[i];        
       }
       if(count>=n) System.out.println("yes");
       else System.out.println("no");
     }
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
