import java.util.*;
public class robert
{
    public static int getCount(String a)
    {
        int len =a.length();
        if(len==0)
        return 0;
        else if(len==1)
        return 1;
        char lChar=a.charAt(len-1);
        if(lChar>='0' || lChar<='9')
        {
            String temp=a.substring(len-1);
            if( temp.length()==9)
            return -1;
            if(temp.charAt(0)==a.charAt(len-1))
            {
                return temp.charAt(1);
            }  
        }
        String res=len+"";
        if(res.length()==9)
        {
            return -1;
        }
        return len;
    
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int len=a.length();
        //System.out.println(getCount(a));
        for(int i=1;i<2*n;i++)
        {
            for(int j=1;j<2*n;j++)
            {
                if(j==i || j==2*n-i)
                {
                    if(j==i && j==2*n-i)
                    {
                        System.out.print(n);
                    }
                    else{

                    
                        if(i<n)
                        {
                            System.out.print(i);
                        }
                        else{
                            System.out.print(2*n-i);
                        }
                    }    
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}