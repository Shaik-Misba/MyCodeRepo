import java.util.*;
public class goodString {
    public void goodOutput(String original)
    {
        StringBuilder sd = new StringBuilder(original);   
        int f,len;
        while(true)
        {
            f=0;
            len=sd.length();
            char c;
            for(int i=0;i<sd.length()-1;i++)
            {
                c=Character.toLowerCase(sd.charAt(i+1));
                if(sd.charAt(i)==c){
                    f=1;
                    sd.delete(i,i+1);
                    sd.delete(i,i+1);
                }
            }
            if(f==0)
            break;
        }
        System.out.println(sd);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        goodString gt = new goodString();
        for(int i=0;i<n;i++)
        {
            String str = sc.next();
            gt.goodOutput(str);
        }
    }
}
