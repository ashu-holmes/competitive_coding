import java.util.*;
import java.io.*;
public class demo1 {
    static int count,ROW,COL;
    public static void main(String args[]) throws IOException
    {
       int n, m;
       Scanner in=new Scanner(System.in);
    //cin >> n >> m;
    n=in.nextInt();
    m=in.nextInt();
    //COL=m;
    char mat[][]=new char[n][m];
    ROW=n;COL=m;
    String x=in.nextLine();
    for(int i = 0; i < n; i++)
    {
       String w=in.nextLine(); 
        for(int j = 0; j < m; j++)
            mat[i][j]=w.charAt(j);
    }      
    int c = 0;
    int row[][]=new int[n][m], col[][]=new int[n][m], freq[][]=new int[n][m];
    boolean visited[][]=new boolean[n][m];
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < m; j++)
        {
            row[i][j] = 0;
            col[i][j] = 0;
            freq[i][j]=0;
            visited[i][j]=false;
        }
    }
            
    if(mat[0][m-1] == '.')
        row[0][m-1] = 1;
    for(int i = 0; i < n; i++)
    {
        for(int j = m-1; j >= 0; j--)
        {
            if(j != m-1 && mat[i][j+1] == '.')
            {
                if(mat[i][j] == '.')
                    row[i][j] = row[i][j+1] + 1;
            }
            else
                if(mat[i][j] == '.')
                    row[i][j] = 1;
            else
                row[i][j] = 0;
        }
    }
    
    if(mat[0][0] == '.')
        col[0][0] = 1;
    for(int i = 0; i < m; i++)
    {
        for(int j = 0; j < n; j++)
        {
            if(j != 0 && mat[j-1][i] == '.')
            {
                if(mat[j][i] == '.')
                    col[j][i] = col[j-1][i] + 1;
            }
            else
                if(mat[j][i] == '.')
                    col[j][i] = 1;
            else
                col[j][i] = 0;
        }
    }
    
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<m;j++)
	  {
	   count = 1 ;
        if(mat[i][j]=='.'&&!visited[i][j])   
        DFS(mat, i, j, visited , freq);
        //System.out.print(freq[i][j]+" ");
	  }
      //System.out.println();
	}
    
    int large = 0;
    for(int i = 0; i < n; i++)
    {
        int sum = 0;
        for(int j = 0; j < m; j++)
        {
            if(mat[i][j]=='.'&&freq[i][j]==row[i][j] + col[i][j] - 1)
            {
               sum=  row[i][j] + col[i][j] - 1;	
	    }
        }
        
        if(large < sum)
            large = sum;
    }
    
    if(large != 0)
    {
        //cout << "YES" << endl << large << endl;
        System.out.println("YES");
        System.out.println(large);
    }
    else
        System.out.println("NO");
     
    }
    
    
    static boolean isSafe(char M[][], int row, int col,
                   boolean visited[][])
    {
        // row number is in range, column number is in range
        // and value is 1 and not yet visited
        return (row >= 0) && (row < ROW) &&
               (col >= 0) && (col < COL) &&
               (M[row][col]=='.' && !visited[row][col]);
    }
 
    // A utility function to do DFS for a 2D boolean matrix.
    // It only considers the 8 neighbors as adjacent vertices
    static void DFS(char M[][], int row, int col, boolean visited[][],int freq[][])
    {
        // These arrays are used to get row and column numbers
        // of 8 neighbors of a given cell
        int rowNbr[] = new int[] {-1, -1, -1,  0, 0,  1, 1, 1};
        int colNbr[] = new int[] {-1,  0,  1, -1, 1, -1, 0, 1};
 
        // Mark this cell as visited
        visited[row][col] = true;
 
        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k)
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited) )
            {
                count++;
                DFS(M, row + rowNbr[k], col + colNbr[k], visited,freq);
            }
        freq[row][col]=count;
    }
    
    
    
    
    }

