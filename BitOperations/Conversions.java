import java.util.*;
public class Conversions {
    public static String toBinary(int num)
    {
        int temp=num;
        StringBuilder store=new StringBuilder("");
        while(temp>0)
        {
            if((temp & 1)==0)
            {
                store.insert(0,"0");
            }
            else{
                store.insert(0,"1");
            }
            if(temp!=0)
            temp=temp>>1;
            else
            break;
        }
        return store.toString();
    }
    public static int toDecimal(String binary)
    {
        int len =binary.length();
        int result=0;
        int two=1;
        for(int i=len-1;i>=0;i--)
        {
            result+=Integer.parseInt(binary.charAt(i)+"")*two;
            two*=2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num =sc.nextInt();
        String binary=toBinary(num);
        System.out.println("binaryform: "+binary);
        System.out.println("Decimal Form: "+toDecimal(binary));
    }
}
