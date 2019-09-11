import java.util.*;
public class book {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int c=in.nextInt();
      int v0=in.nextInt();
      int v1=in.nextInt();
      int a=in.nextInt();
      int l=in.nextInt();
      int cur=v0+1,d=1;
      int ans=1;
      while(cur<=c)
      {
       if(v0+d*a<=v1)   
       {
           if(cur-l>0)
           cur=cur-l+v0+d*a;
           else
               cur=1+v0+d*a;
       }
       else
       cur=cur-l+v1;    
       ans++;
       d++;       
      }
      System.out.println(ans);
    }
}
