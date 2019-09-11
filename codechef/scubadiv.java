import java.io.*;
import java.util.*;
public class scubadiv {
    public static void main(String[] args)throws IOException
    {
     Scanner in=new Scanner(System.in);
     int c=in.nextInt(),w,p,i,j,k,t,a,n;
     for(p=0;p<c;p++)
     {
      t=in.nextInt();a=in.nextInt();
      n=in.nextInt();      
      int mat[][]=new int[n][3];
      //int max=0,ox=0,ni=0;
      for(i=0;i<n;i++)
      {
       mat[i][0]=in.nextInt();
       mat[i][1]=in.nextInt();
       mat[i][2]=in.nextInt();
       //max=max+mat[i][2];
       //ox=ox+mat[i][0];
       //ni=ni+mat[i][1];
       //System.out.println(mat[i][0]+" "+mat[i][1]+" "+mat[i][2]);
      }
      int dp[][][]=new int[n+1][t+1][a+1];
      for(i=0;i<=t;i++)
      {
       for(j=0;j<=a;j++)
           dp[0][i][j]=Integer.MAX_VALUE;
      }
      dp[0][0][0]=0;
      
      //int ans=Integer.MAX_VALUE;
      for(i=1;i<=n;i++)
      {
       for(j=0;j<=t;j++)
       {
         for(k=0;k<=a;k++)
         {
           dp[i][j][k]=dp[i-1][j][k];
           int temp=dp[i-1][Math.max(j-mat[i-1][0],0)][Math.max(k-mat[i-1][1],0)];
           if(temp!=Integer.MAX_VALUE)
           {
              
            dp[i][j][k]=Math.min(dp[i][j][k],temp+mat[i-1][2]);
           }
           //System.out.println(i+" "+j+" "+k+" "+dp[i][j][k]); 
         }
       }
      }
      System.out.println(dp[n][t][a]);
      if(p==c-1) break;
      String str=in.nextLine();
      str=in.nextLine();
     }
    }//main
}
