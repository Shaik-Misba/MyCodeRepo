import java.util.*;
class  BuyStocks {
    public int Bestime(int[] time)
    {
        int len =time.length;
        if(len==1)
        {
            return 0;
        }
        else{
            int max=0,dif,
        }
        return 
    }
    public int maxArr(int a[],int pos)
    {
        int len=a.length;
        if(pos==len-1)
        {
            return a[pos];
        }
        else
        {
            int max=0;
            for(int i=pos;i<len;i++)
            {
                if(max<a[i])
                {
                    max=a[i];
                }
            }
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] graph =new int[n];
        for(int i=0;i<n;i++)
        {
            graph[i]=sc.nextInt();
        }
        System.out.println("maxprofit: "+)
    }
    
}
