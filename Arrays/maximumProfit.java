import java.util.*;
class maximumProfit {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int price[] =new int[n];
        for(int i=0;i<n;i++)
        {
            price[i]=sc.nextInt();
        }
        int maxProfit=0,curProfit;
        for(int i=0;i<n;i++)
        {
            if(n%(i+1)!=0)
            {
                curProfit=(n/(i+1))*price[i];
                curProfit+=price[n%(i+1)-1];
            }
            else
            curProfit=(n/(i+1))*price[i];
            if(curProfit>maxProfit)
            maxProfit=curProfit;
        }
        System.out.println(maxProfit);

    }
}
