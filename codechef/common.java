import java.util.*;
import java.io.*;
public class common {
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
    
  public static boolean find(String text,String pattern) {
    int count = 0;
	int n = text.length();
	int m = pattern.length();
	
	if(n < m | m == 0 | m == 0){
		return false;
	}
		
		
	int textHist[] = new int[26];
	int patHist[] = new int[26];
	
	//initial histogram window of size m 
	int i = 0;
	for(i = 0; i < m; i++){
		patHist[pattern.charAt(i)-'A']++;
		textHist[text.charAt(i)-'A']++;
	}

	//search the pattern histogram in a sliding window of text histogram
	do{
		//O(1) time check as array size is constant
                
		if(equalHistogram(textHist, patHist)){
			//System.out.println("anagram found : "+text.substring(i-m, i));
			//count++;
                        return true;
		}
		
		//slide the text histogram window by 1 position to the right and check for anagram
                if(i>=n) break;
		textHist[text.charAt(i)-'A']++;
		textHist[text.charAt(i-m)-'A']--;
	} while(++i < n);
	
	//return count;
        return false;
}//end of find

static boolean equalHistogram(int[] hist1, int[] hist2){
	for(int i = 0; i < hist1.length; i++){
		if(hist1[i] != hist2[i]){
			return false;
		}
	}
	
	return true;
}

  
}
