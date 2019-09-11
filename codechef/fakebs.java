import java.util.*;
import java.io.*;
class fakebs {
    public static void main(String args[])  throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     int t=Integer.parseInt(br.readLine()),n,q,x,p,i,j,k,low,high,gy,gn,ly,ln,mid,ans;
     for(p=0;p<t;p++)
     {
      String str[]=br.readLine().split(" ");   
      n=Integer.parseInt(str[0]);
      q=Integer.parseInt(str[1]);
      int a[]=new int[n];
      int sorted[]=new int[n];
       String str1[]=br.readLine().split(" ");
      for(i=0;i<n;i++)
      {
       a[i]=Integer.parseInt(str1[i]);
       sorted[i]=a[i];
      }
      //Arrays.sort(sorted);
      sort(sorted,0,n-1);
      int indexof[]=new int[sorted[n-1]+1];
      for(i=0;i<n;i++)
          indexof[a[i]]=i;
      int less[]=new int[sorted[n-1]+1];
      int greater[]=new int[sorted[n-1]+1];
      for(i=0;i<n;i++)
      {
          less[sorted[i]]=i;
          greater[sorted[i]]=n-i-1;
      }
      while(q!=0)
      {
       q--;
       x=Integer.parseInt(br.readLine());
       low=0;high=n-1;
       gy=0;gn=0;ly=0;ln=0;
       while(low<=high)
       {
         mid=(low+high)/2; 
            if(a[mid]==x)
                break;
            else if(a[mid]<x && indexof[x]>mid)
            { low=mid+1;
                ln++;} 
            else if(a[mid]<x && indexof[x]<mid)
            { high=mid-1; 
               gy+=1;} 
            else if(a[mid]>x && indexof[x]<mid)
            {gn+=1; 
                high=mid-1;} 
            else if(a[mid]>x && indexof[x]>mid)
            {ly+=1;
                low=mid+1; }  
       }
       ans=(int)Math.max(ly,gy);
       if((ly>less[x]- ln) || (gy>greater[x]- gn))
       {ans=-1;}
       System.out.println(ans);
      }
     }
    }
    
    static void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[l + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1+ j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m = (l+r)/2;
 
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
}
