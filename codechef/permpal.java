import java.io.*;
import java.util.*;
class permpal {
    public static void main(String args[])
    {
      FastReader in =new FastReader();
      int t=in.nextInt(),p,i,j,k,len;
      int freq[]=new int[26];
      char c=' ';
      int visited[]=new int[26];
      int pos[]=new int[26];
      for(p=0;p<t;p++)
      {
       Arrays.fill(pos,-1);
       Arrays.fill(freq,0);
       Arrays.fill(visited,0);
       String s=in.nextLine();
       len=s.length();
       for(i=0;i<len;i++)
       {
        freq[s.charAt(i)-'a']++;
       }
       int odd=0;
       char mid='#';
       for(i=0;i<26;i++)
       {
        if(freq[i]%2!=0) {odd++;mid=(char)('a'+i);}   
       }
       if(odd==0||odd==1) 
       {}
       else 
       {System.out.println("-1");continue;}
       j=1;
       for(i=0;i<len;i++)
       {
        c=s.charAt(i);
        if(c==mid) {System.out.print((len+1)/2);mid='#';}
        else if(visited[c-'a']==0) 
        {
            if(len%2!=0&&j==(len+1)/2)
            j++;    
            System.out.print(j);
            pos[c-'a']=j;
            j++;
            visited[c-'a']=1;
        }
        else
        {System.out.print((len-pos[c-'a']+1));visited[c-'a']=0;}
        if(i!=len-1)
            System.out.print(" ");
       }
       System.out.println();
       //System.out.println(len);
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
