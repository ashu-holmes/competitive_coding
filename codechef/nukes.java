import java.util.*;
class nukes {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int a=in.nextInt(),n=in.nextInt(),k=in.nextInt();
     int i,j,p;
     int ans[]=new int[k],d=a;
     for(i=0;i<k;i++)
     {
       ans[i]=d%(n+1);
       d=d/(n+1);
       System.out.print(ans[i]+" ");
     }
    }
}
