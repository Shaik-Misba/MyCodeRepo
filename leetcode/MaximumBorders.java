import java.util.*;
class MaximumBorders {
    public int MaxBorder(int n,int m,String[] b)
    {
        int bord =0,max;
        for(int i=0;i<n;i++)
        {
            max=maxChar(b[i],m);
            if(max>bord)
            {
                bord=max;
            }

        }
        return bord;
    }
    public int maxChar(String row ,int len)
    {
        int curCnt=0,prevCnt=0;
        for(int i=0;i<len;i++)
        {
            curCnt=0;
            if(row.charAt(i)=='#')
            {
                int j=i;
                while(row.charAt(j)=='#')
                curCnt++;
            }
            if(prevCnt<curCnt)
            {
                prevCnt=curCnt;
            }
        }
        return prevCnt;

    }
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int test =sc.nextInt();
        int n,m;
        MaximumBorders t =new MaximumBorders();
        for(int i=0;i<test;i++)
        {
            n=sc.nextInt();
            m=sc.nextInt();
            String[] border =new String[n];
            for(int idx =0;idx<n;idx++)
            {
                border[idx]=sc.next();
            }
            System.out.println(t.MaxBorder(n,m,border));
        }
    }
}
