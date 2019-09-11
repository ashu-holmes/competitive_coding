import java.io.*;
import java.util.*;
class chefgp {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt(),i,j,k1,k2,p,n;
     String h,s,out;
     int freq[]=new int[2];
     int dist[]=new int[2];
     for(p=0;p<t;p++)
     {
      h=in.nextLine();
      s=in.nextLine();
      k1=in.nextInt();
      k2=in.nextInt();
      n=s.length();
      out="";
      freq[0]=0;freq[1]=0;
      dist[0]=k1;dist[1]=k2;
      int count=0,ka=0,kb=0;
      for(i=0;i<n;i++)
      {
       freq[s.charAt(i)-'a']++;   
      }
      for ( i = 0;count<n;i++ )
    {
        // find next eligible character
        j = nextChar(freq,dist,i,out,ka,kb);
        if(i-dist[0]>=0&&out.charAt(i-dist[0])=='a') ka--;
        if(i-dist[1]>=0&&out.charAt(i-dist[1])=='b') kb--;
        // return 0 if string cannot be rearranged
        if (j == Integer.MIN_VALUE)
        {out=out+'*';}
        else 
        { // Put character j at next position
        if(j==0)    
        {out=out+'a';ka++;}
        else
        {out=out+'b';kb++;}    
        // decrease its frequency
        freq[j]--;
        count++;
       
        }
        
    }
      System.out.println(out);
     }
    }
    static int nextChar(int freq[],int dist[],int x,String out,int ka,int kb)
{
    int max = Integer.MIN_VALUE,c=0,i,j;
    if(freq[0]==0&&freq[1]==0) return max;
    if(freq[0]>=freq[1])
    {
       if(x-dist[0]<0) return 0;
       c=ka;
      /* for(i=x-1;i>=x-dist[0];i--)
       {
         if(out.charAt(i)=='a') c++;  
       }*/
       if(c<dist[0]) return 0;
       c=kb;
       if(freq[1]==0) return max;
       if(x-dist[1]<0) return 1;
       /*for(i=x-1;i>=x-dist[1];i--)
       {
         if(out.charAt(i)=='b') c++;  
       }*/
       if(c<dist[1]&&freq[1]!=0) return 1;
       return max;
    }
    else
    {
      c=kb;  
      if(x-dist[1]<0) return 1;
       /*for(i=x-1;i>=x-dist[1];i--)
       {
         if(out.charAt(i)=='b') c++;  
       }*/
       if(c<dist[1]) return 1;
       c=ka;
       if(freq[0]==0) return max;
       if(x-dist[0]<0) return 0;
       /*for(i=x-1;i>=x-dist[0];i--)
       {
         if(out.charAt(i)=='a') c++;  
       }*/
       if(c<dist[0]&&freq[0]!=0) return 0;
       return max;  
    }
}
 
}
