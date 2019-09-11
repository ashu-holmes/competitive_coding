import java.util.*;
import java.io.*;
public class comm {
    static final int MAX = 26; 
    static int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    public static void main(String args[]) throws IOException
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),n,p,i,j;
      for(p=0;p<t;p++)
      {
        n=in.nextInt();
        String w=in.nextLine();
        String a=in.nextLine();
        String b=in.nextLine();
        int ans=0;
        HashSet<String> set=new HashSet<>();
        for(i=0;i<n;i++)
        {
          for(j=i+1;j<=n;j++)
          {
           String pat=a.substring(i,j);
           if(find(b,pat))
           {ans++;}
          }
        }
        System.out.println(ans);
      }
    }//main
    
  public static boolean find(String txt,String pat) {
    int M = pat.length(); 
        int N = txt.length(); 
  
        // countP[]:  Store count of all  
        // characters of pattern 
        // countTW[]: Store count of current 
        // window of text 
        char[] countP = new char[MAX]; 
        char[] countTW = new char[MAX]; 
        for (int i = 0; i < M; i++) 
        { 
            (countP[pat.charAt(i)-'A'])++; 
            (countTW[txt.charAt(i)-'A'])++; 
        } 
  
        // Traverse through remaining characters 
        // of pattern 
        for (int i = M; i < N; i++) 
        { 
            // Compare counts of current window 
            // of text with counts of pattern[] 
            if (compare(countP, countTW)) 
                return true;
              
            // Add current character to current  
            // window 
            (countTW[txt.charAt(i)-'A'])++; 
  
            // Remove the first character of previous 
            // window 
            countTW[txt.charAt(i-M)-'A']--; 
        } 
  
        // Check for the last window in text 
        if (compare(countP, countTW)) 
            return true;
       return false; 
}//end of find

static boolean compare(char arr1[], char arr2[]) 
    { 
        for (int i = 0; i < MAX; i++) 
            if (arr1[i] != arr2[i]) 
                return false; 
        return true; 
    } 

  
}
