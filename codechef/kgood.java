import java.util.*;
class kgood {
public static void main(String args[])
{
 Scanner in=new Scanner(System.in);
 int t=in.nextInt();
 int k,i,j,p,len=0;
 String h=in.nextLine();
 for(p=0;p<t;p++)
 {
  String s=in.nextLine();
  k=0;
  int a[]=new int[26];
  for(i=0;i<s.length();i++)
  {
   if(s.charAt(i)!=' ')   
   {a[s.charAt(i)-'a']++;len++;}
   else
   {k=Integer.parseInt(s.substring(i+1,s.length()));break;}
  }
  Arrays.sort(a);
  int minindex=-1;i=0;
  while(true)
  {
   if(a[i]!=0) {minindex=i;break;}
   else i++;   
  }
  int first=0;
  for(i=25;i>=minindex;i--)
  {
    if(a[i]-a[minindex]<=k) break;
    else
    {
     first=first+a[i]-a[minindex]-k;   
    }
  }
  int last=0;
  for(i=minindex;i<25;i++)
  {
      if(a[25]-a[i]<=k) break;
      else
      last=last+a[i];    
  }
  if(len==a[25])
  {
   if(k>=len) System.out.println("0");
   else
       System.out.println(len-k);
  }
  else
  System.out.println((int)Math.min(first, last));
 }
}
}
