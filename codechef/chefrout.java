/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilip
 */
import java.util.*;
class chefrout {
public static void main(String args[])
 {
  System.out.println("Enter");
  Scanner in=new Scanner(System.in);
  int t=in.nextInt();
  int i,j,p,n;
  String h=in.nextLine();
  for(p=0;p<t;p++)
  {
   char ch=' ';   
   String s=in.nextLine();
   int c=0,e=0,se=0,k=0;
   n=s.length();
   for(i=0;i<n;i++)
   {
    ch=s.charAt(i);
    if(ch=='C')
    {c++;if(e!=0||se!=0) k=1;}
    if(ch=='E')
    {e++;if(se!=0) k=1;}
    if(ch=='S')
    {se++;}
   }
   if(k==1) System.out.println("no");
   else System.out.println("yes");
  }
 }    
}
