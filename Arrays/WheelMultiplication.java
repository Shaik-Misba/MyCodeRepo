//you have two wheels which contains matrixes on it A and B,you will be given a number where the B matrix 
//is rotated clock wise.Find the matrix multiplication of A and rotated B.
//Optimized approach
import java.util.*;
class WheelMultiplication {
   
    public static int rotationMultiplication(int[][] a,int[][]b)
    {
        int n=a.length-1;
        int[] result =new int[4];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                int k=0;
                while(k<=n)
                {
                    result[0]+=a[i][k]*b[k][j];
                    result[1]+=a[i][k]*b[n-j][k];
                    
                    result[2]+=a[i][k]*b[n-k][n-j];
                    result[3]+=a[i][k]*b[j][n-k];
                    k++;
                }

            }
        }
        int max=0;
        for(int i=0; i<4;i++)
        {
            System.out.println(result[i]);
            if(max<result[i])
            {
                max=result[i];
            }
        }
        return max;
        
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
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
        int maxAcceleration=rotationMultiplication(a, b);
    
        System.out.println(maxAcceleration);
        
    }
}
