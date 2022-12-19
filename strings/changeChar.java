
public class changeChar {
    public static String change(String str)
    {
        int p=str.indexOf('e');
        int len=str.length()-1;
        while(p!=-1)
        {
            if(p==0)
            {
                str="i"+str.substring(p+1);
            }
            else if(p==len)
            {
                str=str.substring(0,len)+"i";
            }
            else{
               str=str.substring(0,p)+"i"+str.substring(p+1,len+1); 
            }
            p=str.indexOf('e',p);
        }
        return str;
        
    }
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        String givenString ="eabcdef";
        System.out.println(change(givenString));
        System.out.println(givenString);
    }
}
