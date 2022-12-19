import java.util.*;
class taggle
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("enter position:");
        int pos=sc.nextInt();
        int btMsk=1<<pos;
        int operation=btMsk & n;
        if(operation==0)
        {
            //set bit
            n=n|btMsk;
        }
        else{
            //clear bit
            btMsk=~btMsk;
            n=n&btMsk;
        }
        System.out.println(n);
    }
}