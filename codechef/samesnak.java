import java.util.*;
class samesnak {
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
       int t=in.nextInt(),x1,x2,y1,y2;
       int i,j,k,p;
       for(p=0;p<t;p++)
       {
        x1=in.nextInt();
        y1=in.nextInt();
        x2=in.nextInt();
        y2=in.nextInt();
        int x11=(int)Math.min(x1, x2);
        int x12=(int)Math.max(x1,x2);
        int y11=(int)Math.max(y1, y2);
        int y12=(int)Math.min(y1,y2);
        x1=in.nextInt();
        y1=in.nextInt();
        x2=in.nextInt();
        y2=in.nextInt();
        int x21=(int)Math.min(x1, x2);
        int x22=(int)Math.max(x1,x2);
        int y21=(int)Math.max(y1, y2);
        int y22=(int)Math.min(y1,y2);
        int ans=0,max,a,b;
        if(x11==x12&&x21==x22&&x11==x21)
        {
          a=(int)Math.abs(y11-y22);
          b=(int)Math.abs(y21-y12);
          max=(int)Math.max(a,b);
          if(y21<=y11&&y22<=y11&&y21>=y12&&y22>=y12) ans=1;
          else if(y11<=y21&&y12<=y21&&y11>=y22&&y12>=y22) ans=1;
          else
          if(max+1<(int)Math.abs(y11-y12)+1+(int)Math.abs(y21-y22)+1)
                ans=1; 
          //System.out.println("1");
        }
        else if(y11==y12&&y21==y22&&y11==y22)
        {
           a=(int)Math.abs(x22-x11);
           b=(int)Math.abs(x12-x21);
           max=(int)Math.max(a,b);
           if(x21>=x11&&x22>=x11&&x21<=x12&&x22<=x12) ans=1;
           else if(x11>=x21&&x12>=x21&&x11<=x22&&x12<=x22) ans=1;
           else
           if(max+1<(int)Math.abs(x12-x11)+1+(int)Math.abs(x22-x21)+1)
                ans=1;
           
            //System.out.println("2");
        }
        else if((x11==x21&&y11==y21)||(x11==x22&&y11==y22)||(x12==x21&&y12==y21)||(x12==x22&&y12==y22))
        {
            ans=1;
             //System.out.println("3");
        }
        else ans=0;
        if(ans==1) System.out.println("yes");
        else System.out.println("no");
       }
    }
}
