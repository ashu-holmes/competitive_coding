import java.util.*;
import java.io.*;
class matpan {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt(),p,i,j,k;
     int cost[]=new int[26];
     int hash[]=new int[26];
     for(p=0;p<t;p++)
     {
       Arrays.fill(hash,0);
       for(i=0;i<26;i++)
           cost[i]=in.nextInt();
       String h=in.nextLine();
       String s=in.nextLine();
       for(i=0;i<s.length();i++)
           hash[s.charAt(i)-'a']++;
       int ans=0;
       for(i=0;i<26;i++)
       {
         if(hash[i]==0)
             ans+=cost[i];
       }
       System.out.println(ans);
     }
    }    
}
