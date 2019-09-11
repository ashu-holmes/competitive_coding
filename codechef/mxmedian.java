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
class mxmedian {
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
   int t=in.nextInt(),n,i,j,k,p;
   for(p=0;p<t;p++)
   {
    n=in.nextInt();
    int a[]=new int[2*n];
    int b[]=new int[2*n];
    for(i=0;i<2*n;i++)
    {
     a[i]=in.nextInt();   
    }
    Arrays.sort(a);
    int pos=(int)Math.ceil(n/2.0);
    int ans=a[2*n-pos];
    System.out.println(ans);
    int left=0,right=2*n-1;
    for(i=0;i<2*n;i++)
    {
     if(i%2==0) 
     {b[i]=a[left];left++;}
     else
     {b[i]=a[right];right--;}    
    }
    for(i=0;i<2*n;i++)
    {
     System.out.print(b[i]+" ");
    }
    System.out.println();
   }
  }
}
