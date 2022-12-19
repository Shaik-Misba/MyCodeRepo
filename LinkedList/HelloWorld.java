import java.util.*;
class HelloWorld {
    public static long subarray(int arr[])
    {
        int count =0;
        int prev=arr[0];
        int count1=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==prev)
            {
                count1++;
            }
            else
            {
                count=Math.max(count,count1);
                count1=1;
                prev=arr[i];
            }
        }
        count=Math.max(count,count1);
        return count;
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int T=sc.nextInt();
    while(T!=0)
    {
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int arr3[]=new int[N];
        Set<Integer>s=new HashSet<>();
        long max1=0;
        for(int i:arr) 
        s.add(i);
        for(int j:s)
        {
            for(int i=0;i<N;i++)
            {
                if(arr[i]==j && arr3[i]!=1)
                {
                        arr[i]++;
                        arr3[i]=1;
                }
                
            }
            max1=Math.max(subarray(arr),max1);
        }
        System.out.println(max1);
        T--;
    }
    }
}