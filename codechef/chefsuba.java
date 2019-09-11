
import java.util.*;
class chefsuba {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int k=in.nextInt();
     int p=in.nextInt();
     int i,j;
     int a[]=new int[n];
     int b[]=new int[n];
     int count=0;
    for(i=0;i<n;i++)
    {
     a[i]=in.nextInt();
     if(a[i]==0)
         count=0;
     else
     { count++;
     b[i]=count;}
    }
    String h=in.nextLine();
    String s=in.nextLine();
    int first=0,last=0,start=0,end=n-1;
    for(i=0;i<n;i++)
    {
        if(b[i]==0)
            break;
        else
        {first=b[i];start=i+1;}
    }
    for(i=n-1;i>=0;i--)
    {
       if(b[i]==0) break;
       else {last=b[n-1];end=i-1;}
    }
    if(count==n)
    {
      for(j=0;j<p;j++)
      {
        if(s.charAt(j)=='?') System.out.println(k);
      }
    }
    else
    {
      if(last==0) {start=0;end=n-1;first=0;}  
      int max1=0,max1lastindex=-1;  
      for(i=start;i<=end;i++)
      {
        if(a[i]==0) count=0;
        else
        {count++;if(count>=max1) {max1=count;max1lastindex=i;}}
      }
      int max2=0;
      for(i=start;i<=end;i++)
      {
       if(b[i]>max2&&i!=max1lastindex&&i!=n-1&&b[i+1]==0)
       {max2=b[i];}
       if(i==n-1&&b[i]>max2) 
       {max2=b[i];}    
      }
      int lastindex,firstcount,lastcount,maxlen,maxlen2;
      char c=' ';
      int ans=0;
      if(first+last>max1)
      {if(last!=0)   
       lastindex=n-1;
      else lastindex=first-1;
       firstcount=first;
       //if(last!=0)
       lastcount=last;
       //else lastcount=first+last;
       maxlen=first+last;
       maxlen2=max1;
      }
      else if(first+last>max2)
      {
       maxlen=max1;
       maxlen2=first+last;
       lastindex=max1lastindex;
       firstcount=0;
       lastcount=maxlen;
      }
      else
      {
        maxlen=max1;
        maxlen2=(int)Math.max(first+last,max2);
       lastindex=max1lastindex;
       firstcount=0;
       lastcount=maxlen;
      }
       for(j=0;j<p;j++)
       {
        c=s.charAt(j);
        if(c=='!')
        {
          if(lastindex==n-1) {firstcount++;lastcount--;if(lastcount==0){lastindex=firstcount-1;lastcount=maxlen;firstcount=0;}}  
          else lastindex++;
        }
        if(c=='?')
        {
         if(lastindex!=n-1)
         {System.out.println((int)Math.min(k,maxlen));}
         else if(lastindex==n-1&&firstcount==0)
         {System.out.println((int)Math.min(k,maxlen));}
         else
         {
         
           ans=(int)Math.max(maxlen2, Math.max(firstcount, lastcount));
           System.out.println((int)Math.min(k,ans));
         }
        }
       }  
      
    }
    }
}
