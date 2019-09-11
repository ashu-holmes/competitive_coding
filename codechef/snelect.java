import java.util.*;
class snelect {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     String h=in.nextLine();
     int i,j,k,p;
     for(p=0;p<t;p++)
     {
       String rev=in.nextLine();
       int len=rev.length();
       char c1=' ',c2=' ';
       int m=0,s=0;
       for(i=0;i<len;i++)
       {
         if(rev.charAt(i)!='s')
             m++;
         else
             s++;
       }
       for(i=0;i<len-1;i++)
       {
         if(i+1<len)
         {
           c1=rev.charAt(i);
           c2=rev.charAt(i+1);
           if((c1=='m'&&c2=='s')||(c1=='s'&&c2=='m'))
           {
             s--;
             i++;
           }   
         }
       }
       if(s==m) System.out.println("tie");
       else if(s>m) System.out.println("snakes");
       else System.out.println("mongooses");
     }
    }
}
