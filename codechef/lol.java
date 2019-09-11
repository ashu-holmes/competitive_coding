import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    static int INT_SIZE = 64;
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long local=0,ans=0,arr[]=new long[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextLong();
        long pow=0,cur=0;
         for (long i = 0; i < 64; i++)     
         {
             local=0;cur=0;
             for (int j = 0; j < n; j++)     
             {
                 if ((arr[j] & (1L << i)) == 0)
                 {
                  cur++ ;  
                 }
                 else
                 {
                    
                  local=local+(cur*(cur+1))/2;
                     cur=0;
                     
                 }
                 //System.out.println(local);
                 }
             if(cur!=0) local=local+(cur*(cur+1))/2;
             System.out.println(local + "      " + cur);
             //if(pow=)
             ans=ans+((n*(n+1))/2-local)*(long)(1L<<i);
             System.out.println((long)(1L<<i) + "");
             System.out.println(ans+"Ans"+i);
            
             }
        System.out.println(ans);
    }
    
}