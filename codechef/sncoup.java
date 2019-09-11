import java.util.*;
class sncoup {
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n;
      int i,j,k,p;
     
      for(p=0;p<t;p++)
      {
       n=in.nextInt();
       String h=in.nextLine();
       String s1=in.nextLine();
       String s2=in.nextLine();
       char a[][]=new char[2][n];
       for(i=0;i<n;i++)
       {a[0][i]=s1.charAt(i);a[1][i]=s2.charAt(i);}
       int hor=0,ans=0,track=-1,vertical=1;
       for(i=0;i<n;i++)
       {
         if(track==2)
         {
           if(a[0][i]=='*'&&a[1][i]=='*')
           {
             track=2;
             ans++;
             vertical=1;
           }
           else if(a[0][i]=='*'||a[1][i]=='*')
           {
              if(a[0][i]=='*') track=0;else track=1; 
              ans++;
              vertical=1;
           }
           else
           continue;
         }
         else if(track==0)
         {
           if(a[0][i]=='*'&&a[1][i]=='*')
           {
             track=2;
             ans++;
             vertical=1;
           }
           else if(a[0][i]=='*'||a[1][i]=='*')
           {
              if(a[0][i]=='*') {track=0;ans++;vertical=1;}
              else 
              {
                  track=1;
              if(vertical==0){vertical=1;ans++;}
              else
              if(hor==0) {hor=1;ans++;vertical=0;}
              else vertical=0;
              } 
           }
           else
           continue;  
         }
         else if(track==1)
         {
           if(a[0][i]=='*'&&a[1][i]=='*')
           {
             track=2;
             ans++;
           }
           else if(a[0][i]=='*'||a[1][i]=='*')
           {
              if(a[1][i]=='*') {track=1;ans++;vertical=1;}
              else 
              {
                  track=0;
                  if(vertical==0){vertical=1;ans++;}
                  else
                  if(hor==0) {hor=1;ans++;vertical=0;}
                  else
                      vertical=0;
              } 
           }
           else
           continue;  
         }
         else
         {
          if(a[0][i]=='*'&&a[1][i]=='*') track=2;
          else if(a[0][i]=='*') track=0;
          else if(a[1][i]=='*') track=1;
          else
              track=-1;
         }
         if(a[0][i]=='*'&&a[1][i]=='*')
         {
           if(hor==0) {hor=1;ans++;} track=2; 
         }
       }
       System.out.println(ans);
      }
    }
}
