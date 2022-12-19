import java.util.*;

public class PowerOfTwo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        while(n>0)
        {
            if((n & 1) >0)
            {
                c++;
            }
            n=n>>1;
        }
        if(c==1)
        {
            System.out.println("repersented as a power of 2s");
        }
        else{
            System.out.println("cannot be represented as apower of 2");
        }
    }
}