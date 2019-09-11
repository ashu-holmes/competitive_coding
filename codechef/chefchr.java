import java.io.*;
import java.util.*;
class chefchr {
 public static void main(String args[])
 {
     FastReader in =new FastReader();
     int i,j,p,n,t=in.nextInt(),len,c,h,e,f;
     //String he=in.nextLine();
     //char a[]=new char[4];
     char ch=' ',pr=' ';
     for(p=0;p<t;p++)
     {
       String s=in.nextLine();  
       len=s.length();
       n=0;c=0;h=0;e=0;f=0;
       for(i=0;i<len;i++)
       {
         ch=s.charAt(i);
         if(ch=='c') c++;
         if(ch=='h') h++;
         if(ch=='e') e++;
         if(ch=='f') f++;
         if((i-4)>=0)
         {
          pr=s.charAt(i-4);
          if(pr=='c') c--;
          if(pr=='h') h--;
          if(pr=='e') e--;
          if(pr=='f') f--;
         }
         if(c==1&&h==1&&e==1&&f==1)
             n++;
         //System.out.println(p+" "+i+" "+n+" "+c+" "+h+" "+e+" "+f);
       }
       if(n>0)
           System.out.println("lovely "+n);
       else
           System.out.println("normal");
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
