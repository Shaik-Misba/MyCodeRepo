import java.util.*;
class WallFallen
{
    public static int[] isballwillFall(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int [] dropClmn = new int[m];
        int i,k,pos;
        if(m==1)
        {
            return new int[] {-1};
        }
        else
        {
            for(int ech=0; ech<m ; ech++)
            {
                i=ech;
                k=0;
                pos=i;
                System.out.println(ech);
                while(k<n && i<m && pos!=-1)
                {
                    pos = ballFallenPos(grid,k,i);
                    System.out.print(pos+" ");
                    if(pos!=-1)
                    dropClmn[ech]=pos+1;
                    else
                    dropClmn[ech]=pos;
                    k++;
                    i=pos;
                }
            }
            return dropClmn;
        }
    }
    public static int ballFallenPos(int [][] grid,int idx ,int jdx)
    {
        int pos=-1;
        int m=grid[0].length;
        int curCell = grid[idx][jdx];
        if((m==1)||(jdx==0 && curCell==-1) || (jdx==m-1 && curCell==1))
        {
            return -1;
        }
        else
        {
            
            if(curCell==1 && grid[idx][jdx+1]==1)
            {
                return jdx+1;
            }
            else if(curCell==-1 && grid[idx][jdx-1]==-1)
            {
                return jdx-1;
            }
            return -1;
        }
        
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[][] grid = new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            grid[i][j]=sc.nextInt();
        }
        int [] result = WallFallen.isballwillFall(grid);
        // for(int i=0;i<n;i++)
        // System.out.println(result[i]+" ");
    }
}