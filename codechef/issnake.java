import java.util.*;
class issnake {
    int count=0;
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,p,i,j;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        String h=in.nextLine();
        String s1=in.nextLine();
        char a[][]=new char[2][n];
        String s2=in.nextLine();
        for(i=0;i<n;i++)
        {
          a[0][i]=s1.charAt(i);
          a[1][i]=s2.charAt(i);
        }
        int flag=0,count=0,c=1,k=0,chk=0;
        int vertical=0;
        for(i=0;i<n;i++)
        {  
          if(count>1) {chk=1;break;}  
          if(a[k][i]=='#'&&a[c][i]=='#')
          {
            if(flag==0) {flag=1;vertical=-1;count++;k=1;c=0;continue;}  
            if(vertical==1) {k=1;c=0;}
            else {k=0;c=1;}
            vertical=-vertical;
          }
          else if(a[k][i]=='#')
          {
            if(flag==0) {flag=1;vertical=1;k=0;c=1;count++;}  
              
          }
          else if(a[c][i]=='#')
          {
            if(flag==0) {flag=1;vertical=-1;k=1;c=0;count++;continue;}  
            chk=1;break;  
          }
          else
          {
            flag=0;k=0;c=1;  
          }
          
        }//end of first for loop
        
        if(count>1) chk=1;
        flag=0;count=0;c=1;k=0;vertical=0;
        int chk2=0;
        
        for(i=0;i<n;i++)
        {  
          if(count>1) {chk2=1;break;}  
          if(a[k][i]=='#'&&a[c][i]=='#')
          {
            if(flag==0) {flag=1;vertical=1;count++;k=0;c=1;continue;}  
            if(vertical==1) {k=1;c=0;}
            else {k=0;c=1;}
            vertical=-vertical;
          }
          else if(a[k][i]=='#')
          {
            if(flag==0) {flag=1;vertical=1;k=0;c=1;count++;}  
              
          }
          else if(a[c][i]=='#')
          {
            if(flag==0) {flag=1;vertical=-1;k=1;c=0;count++;continue;}  
            chk2=1;break;  
          }
          else
          {
            flag=0;k=0;c=1;  
          }
          
        }//end of 2nf for loop
        if(count>1) chk2=1;
       //System.out.println("chk1:"+chk+" chk2:"+chk2);
      if(chk==0||chk2==0) System.out.println("yes");
      else
        System.out.println("no");
    }//end of cases
    
}//end of main
}//end of class
