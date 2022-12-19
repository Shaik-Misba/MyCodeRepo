//you have two matrixe A and B,you will be given a number where the B matrix 
//is rotated clock wise.Find the matrix multiplication of A and rotated B.
//Brute Forse approach
import java.util.*;
class matrixRotation {
    public static void rotate(int[][] m)
    {
        int n=m.length-1;
        int temp;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<i;j++)
            {
                temp=m[i][j];
                m[i][j]=m[j][i];
                m[j][i]=temp;
            }
        }
        System.out.println();
        for(int i=0;i<=n;i++)
        {
            if(i<n-i)
            {
                for(int j=i;j<=n;j++)
                {
                    temp=m[j][i];
                    m[j][i]=m[j][n-i];
                    m[j][n-i]=temp;
                }
            }
        }
        
    }
    public static int matrixMultiplication(int[][] m,int[][] b)
    {
            int result=0;
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
            for(int i=0;i<len;i++)
            {
                for(int j=0;j<len;j++)
                {
                    result+=chain[i][j];
                    System.out.print(chain[i][j]+" ");
                }
                System.out.println();
            }
            return result;
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
        int maxAcceleration=0;
        for(int i=0;i<4;i++)
        {
            int cur=matrixMultiplication(m, b);
            System.out.println(cur);
            if(maxAcceleration<cur)
            {
                maxAcceleration=cur;
            }
            rotate(b);
        }
        System.out.println(maxAcceleration);
        
    }
}
