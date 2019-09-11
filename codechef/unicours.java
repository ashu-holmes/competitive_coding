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
public class unicours {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int i,k;
    int t=in.nextInt(),N;
    int p;
    for(p=0;p<t;p++)
    {
     N=in.nextInt();
     int max=0;
     for(i=0;i<N;i++)
     {
      k=in.nextInt();
      if(k>max) max=k;
     }
     System.out.println(N-max);
    }
    }
}
