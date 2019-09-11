import java.util.*;
class chefprad {
    boolean bpm(boolean bpGraph[][], int u, boolean seen[],
                int matchR[])
    {
        for (int v = 0; v < N; v++)
        {
            if (bpGraph[u][v] && !seen[v])
            {
                seen[v] = true; 
                if (matchR[v] < 0 || bpm(bpGraph, matchR[v],
                                         seen, matchR))
                {
                    matchR[v] = u;
                    return true;
                }
            }
        }
        return false;
    }
     int maxBPM(boolean bpGraph[][])
    {
        int matchR[] = new int[N];
 
       
        for(int i=0; i<N; ++i)
            matchR[i] = -1;
 
        int result = 0; 
        for (int u = 0; u < M; u++)
        {
            
            boolean seen[] =new boolean[N] ;
            for(int i=0; i<N; ++i)
                seen[i] = false;
            if (bpm(bpGraph, u, seen, matchR))
                result++;
        }
        return result;
    }
}
