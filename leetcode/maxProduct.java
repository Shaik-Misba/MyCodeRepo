import java.util.*;

public class maxProduct {
        public static int productOf3( int lmnts[],int len)
        {
            
            if(len==3)
            {
                return lmnts[0]*lmnts[1]*lmnts[2];
            }
            else{
                
                Arrays.sort(lmnts);
                int product=lmnts[len-1]*lmnts[len-2]*lmnts[len-3];
                product=Math.max(lmnts[0]*lmnts[1]*lmnts[len-1], product);
                return product;
            }
            
        }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] =new int[n];
        for(int ech =0;ech<n ;ech++)
        ar[ech]=sc.nextInt();
        int max3=maxProduct.productOf3(ar,n);
        System.out.println(max3);

    }
}
