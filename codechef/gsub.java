import java.io.*;
import java.util.*;
class gsub {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt(),i,j,k,p;
     String h=in.nextLine(),s;
     for(p=0;p<t;p++)
     {
      s=in.nextLine();
      int n=s.length(),local=0,ans=0,check=0;
      char prev=' ';
      for(i=1;i<n;i++)
      {
        if(s.charAt(i)==s.charAt(i-1))
        {
         local++;
         ans=ans+local;
        }
        else
        {
         if(check!=0&&prev==s.charAt(i)) ans+=1;   
         prev=s.charAt(i-1);
         check=1;
         ans+=local;
         local=0;
        }
      }
      System.out.println(ans);
     }
    }
}
