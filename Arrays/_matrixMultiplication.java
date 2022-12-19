import java.util.*;
class _matrixMultiplication {
    public static void matrixMultiplication(int[][] m,int[][] b)
    {
        //int result=0;
        int len=m.length;
        int[][] chain =new int[len][len];
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                int k=0;
                int sum=0;
                while(k<len)
                {
                    sum+=m[i][k]*b[k][j];
                    k++;
                }
                chain[i][j]=sum;
            }
        }
        for(int idx=0;idx<len;idx++)
        {
            for(int jdx=0;jdx<len;jdx++)
            {
                System.out.print(chain[idx][jdx]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[][] m = new int[n][n];
        int[][] b = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        matrixMultiplication(m, b);
    }
}
