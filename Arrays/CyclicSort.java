import java.util.*;
class CyclicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int idx=0;
        while(idx<n)
        {
            while(a[idx]!=idx+1)
            {
                int temp=a[idx];
                a[idx]=a[temp-1];
                a[temp-1]=temp;
            }
            idx++;
        }
        for(int j=0;j<n;j++)
        {
            System.out.print(a[j]+" ");
        }
    }
}
