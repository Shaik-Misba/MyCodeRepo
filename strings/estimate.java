import java.util.*;
public class estimate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String S1=sc.next();
        String S2=sc.next();
        int c=0;
        int len=S1.length();
        for(int i=0;i<len;i++)
        {
            char a=S1.charAt(i);
            char b=S2.charAt(i);
            if(a=='?' && b=='?')
            {
                continue;
            }
            else if(a==b)
            {
                continue;
            }
            else if(a=='?' && b!='?')
            {
                continue;
            }
            else if(b=='?' && a!='?')
            {
                continue;
            }
            else 
                c++;
        }
    int m=0;
    for(int i=0;i<len;i++)
        {
            char a=S1.charAt(i);
            char b=S2.charAt(i);
            if(a!=b)
            m++;
            else if(a!='?' && b=='?')
            {
                m++;
            }
            else if(a=='?' && b!='?')
            {
                m++;
            }
            else if(a=='?' && b=='?')
            {
                m++;
            }
            else if(b!='?' && a!='?')
            {
                if(a==b)
                    continue;
            }
        }
        System.out.println(c+" "+m);
    }
}
