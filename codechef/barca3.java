import java.util.*;
import java.io.*; 
public class barca3 {
  public static void main(String args[]) throws IOException
    {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine(),w="";
     int i,j,n=s.length();
     char c;
     Set<String> set = new TreeSet<String>();
     for(i=0;i<n;i++)
     {
       w="";
       c=s.charAt(i);
        for(j=0;j<n;j++)
        {
          if(s.charAt(j)!=c)
              w=w+s.charAt(j);
        }
        set.add(w);
     }
     System.out.println(set.iterator().next());
     
    }
}
