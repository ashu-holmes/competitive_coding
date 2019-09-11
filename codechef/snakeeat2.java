import java.util.*;
class snakeeat2 {
    public static void main(String args[])
    {
     Scanner in=new Scanner(System.in);
     int t=in.nextInt();
     int i,j,n,q,p,u;
     int k;
     for(p=0;p<t;p++)
     {
      n=in.nextInt();
      q=in.nextInt();
      int a[]=new int[n];
      for(i=0;i<n;i++)
          a[i]=in.nextInt();
      //Arrays.sort(a);
      sort(a, 0,n-1);
      /*for(i=0;i<n;i++)
      {
        a[i]=a[i]+i;  
      }*/
      int ans=0;
      for(u=0;u<q;u++)
      {
        k=in.nextInt();
       ans=  Arrays.binarySearch(a,k);
       int count=0;
       if(ans>=0)
       {ans=first(a,0,n-1,k,n);count=n-ans;}
       else
       {ans=ans+1;ans=(int)Math.abs(ans);count=n-ans;}
       j=0;ans--;
        while(true&&ans>=0)
	        {
	            if(k-a[ans]<=(ans-j))
	            {
	                count++;
	                j=j+k-a[ans];
	                ans--;
	            }
	            else
	            break;
	        }
       System.out.println(count);
      }
     }
    }
    
    public static int first(int arr[], int low, int high, int x, int n)
    {
        if(high >= low)
        {
            int mid = low + (high - low)/2;
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x)
                return mid;
             else if(x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            else
                return first(arr, low, (mid -1), x, n);
        }
    return -1;
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
