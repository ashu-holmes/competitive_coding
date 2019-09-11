import java.util.*;
class dilemma {
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    int t=in.nextInt(),p,i,j;
    String k=in.nextLine();
    for(p=0;p<t;p++)
    {   
     String s=in.nextLine();
     int ans=0;
     for(i=0;i<s.length();i++)
     {
      if(s.charAt(i)=='0')
          ans=ans^0;
      else
          ans=ans^1;
     }
     if(ans==0)
         System.out.println( "LOSE");
     else
         System.out.println( "WIN");
    }
    }
}

