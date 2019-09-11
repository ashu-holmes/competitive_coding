import java.util.*;
class snsocial {
    static int R,C;
    
    static boolean isvalid(int i, int j)
{
    return (i >= 0 && j >= 0 && i < R && j < C);
}
  
 static class ele {
    int x, y;
    ele()
    {}
    ele(int a,int b)
    {
     x=a;y=b;   
    }
};   
   static boolean isdelim(ele temp)
{
    return (temp.x == -1 && temp.y == -1);
}
 
    
static boolean check(int a[][],int i,int j)
{
    int c=0,k=0;
    if(isvalid(i-1,j-1))
    {
        k++;
       if(a[i-1][j-1]>a[i][j]) return false;
       if(a[i-1][j-1]==a[i][j]) c++;
    }
    if(isvalid(i-1,j))
    {
       k++; 
      if(a[i-1][j]>a[i][j])  return false; 
      if(a[i-1][j]==a[i][j])  c++;
    }
    if(isvalid(i-1,j+1))
    {
        k++;
        if(a[i-1][j+1]>a[i][j]) return false;
        if(a[i-1][j+1]==a[i][j]) c++;
    }
    if(isvalid(i,j-1))
    {
        k++;
        if(a[i][j-1]>a[i][j]) return false;
        if(a[i][j-1]==a[i][j]) c++;
    }
    if(isvalid(i,j+1))
    {
        k++;
        if(a[i][j+1]>a[i][j]) return false;
        if(a[i][j+1]==a[i][j]) c++;
    }
    if(isvalid(i+1,j-1))
    {
        k++;
        if(a[i+1][j-1]>a[i][j]) return false;
        if(a[i+1][j-1]==a[i][j]) c++;
    }
    if(isvalid(i+1,j))
    {
        k++;
        if(a[i+1][j]>a[i][j]) return false;
        if(a[i+1][j]==a[i][j]) c++;
    }
    if(isvalid(i+1,j+1))
    {
        k++;
        if(a[i+1][j+1]>a[i][j]) return false;
         if(a[i+1][j+1]==a[i][j]) c++;
    }
    if(k==c) return false;
    return true;
}    
    
    
    static int rot(int arr[][])
{
    // Create a queue of cells
    Queue<ele> Q=new LinkedList<>();
    ele temp=null;
    int ans = 0;
 
    
    for (int i=0; i<R; i++)
    {
       for (int j=0; j<C; j++)
       {
            if (check(arr,i,j))
            {
                Q.add(new ele(i,j));
            }
        }
    }
 
    
        Q.add(new ele(-1,-1));
 
    // Process the grid while there are rotten oranges in the Queue
    while (!Q.isEmpty())
    {
        
        boolean flag = false;
 
        // Process all the rotten oranges in current time frame.
        while (!isdelim(Q.peek()))
        {
            int w1=0,w2=0,w3=0,w4=0,w5=0,w6=0,w7=0,w8=0;
            temp = Q.poll();
            int val=arr[temp.x][temp.y];
           
            if (isvalid(temp.x-1, temp.y-1) && arr[temp.x-1][temp.y-1] <val)
            {
                
                if (!flag) ans++; flag = true;
 
                // Make the orange rotten
                arr[temp.x-1][temp.y-1] = val;
                w1=1; 
                
            }
 
            // Check left adjacent cell that if it can be rotten
            if (isvalid(temp.x-1, temp.y) && arr[temp.x-1][temp.y] <val) {
                if (!flag) ans++; flag = true;w2=1;
                arr[temp.x-1][temp.y] = val;
            }
             if (isvalid(temp.x-1, temp.y+1) && arr[temp.x-1][temp.y+1] <val) {
                if (!flag) ans++; flag = true;w3=1;
                arr[temp.x-1][temp.y+1] = val;
            }
             if (isvalid(temp.x, temp.y-1) && arr[temp.x][temp.y-1] <val) {
                if (!flag) ans++; flag = true;w4=1;
                arr[temp.x][temp.y-1] = val;
            }
             if (isvalid(temp.x, temp.y+1) && arr[temp.x][temp.y+1] <val) {
                if (!flag) ans++; flag = true;w5=1;
                arr[temp.x][temp.y+1] = val;
            }
             if (isvalid(temp.x+1, temp.y-1) && arr[temp.x+1][temp.y-1] <val) {
                if (!flag) ans++; flag = true;w6=1;
                arr[temp.x+1][temp.y-1] = val;
            }
             if (isvalid(temp.x+1, temp.y) && arr[temp.x+1][temp.y] <val) {
                if (!flag) ans++; flag = true;w7=1;
                arr[temp.x+1][temp.y] = val;
            }
            if (isvalid(temp.x+1, temp.y+1) && arr[temp.x+1][temp.y+1] <val) {
                if (!flag) ans++; flag = true;w8=1;
                arr[temp.x+1][temp.y+1] = val;
            }
             
            if(w1==1&&check(arr,temp.x-1,temp.y-1)) {Q.add(new ele(temp.x-1,temp.y-1));}
            if(w2==1&&check(arr,temp.x-1,temp.y)) {Q.add(new ele(temp.x-1,temp.y));}
            if(w3==1&&check(arr,temp.x-1,temp.y+1)) {Q.add(new ele(temp.x-1,temp.y+1));}
            if(w4==1&&check(arr,temp.x,temp.y-1)) {Q.add(new ele(temp.x,temp.y-1));}
            if(w5==1&&check(arr,temp.x,temp.y+1)) {Q.add(new ele(temp.x,temp.y+1));}
            if(w6==1&&check(arr,temp.x+1,temp.y-1)) {Q.add(new ele(temp.x+1,temp.y-1));}
            if(w7==1&&check(arr,temp.x+1,temp.y)) {Q.add(new ele(temp.x+1,temp.y));}
            if(w8==1&&check(arr,temp.x+1,temp.y+1)) {Q.add(new ele(temp.x+1,temp.y+1));}
            //Q.pop();
        }
 
        // Pop the delimiter
        Q.poll();
 
        // If oranges were rotten in current frame than separate the
        // rotten oranges using delimiter for the next frame for processing.
        if (!Q.isEmpty()) {
            
            Q.add(new ele(-1,-1));
        }
 
        
        
    }
 
    
    return ans;
}
  
    
    
    
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int t=in.nextInt(),p,i,j,k;
      for(p=0;p<t;p++)
      {
        R=in.nextInt();
        C=in.nextInt();
        int arr[][]=new int[R][C];
        for(i=0;i<R;i++)
        {
          for(j=0;j<C;j++)
          arr[i][j]=in.nextInt();    
        }
        int ans=rot(arr);
        System.out.println(ans);
      }
      
    }
    
    
}
