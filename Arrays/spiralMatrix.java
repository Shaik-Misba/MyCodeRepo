import java.util.*;
class spiralMatrix {
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter values of m and n:");
            int m=sc.nextInt();
            int n=sc.nextInt();
            int[][] matrix =new int[m][n];
            for(int i=0;i<m;i++)
            {
                for(int j=0;j<n;j++)
                {
                    matrix[i][j]=sc.nextInt();
                }
            }
            int left=0;
            int top=0;
            int right=n-1;
            int bottom=m-1;
            while(top<=bottom && left<=right)
            {
                for(int k=left;k<=right;k++)
                System.out.print(matrix[top][k]+" ");
                top++;
                for(int k=top;k<=bottom;k++)
                System.out.print(matrix[k][right]+" ");
                right--;
                if(top<=bottom)
                {
                    for(int k=right;k>=left;k--)
                    System.out.print(matrix[bottom][k]+" ");
                    bottom--;
                }
                if(left<=right)
                {
                    for(int k=bottom;k>=top;k--)
                    System.out.print(matrix[k][left]+" ");
                    left++;
                }
                // top++;
                // left++;
                // right--;
                // n--;
                // m--;
            }
        }
    }
}