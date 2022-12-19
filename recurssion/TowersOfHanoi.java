import java.util.*;
class TowersOfHanoi
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        towerOfHanoi(n,"S","H","D");
    }

    private static void towerOfHanoi(int n, String src, String hlpr, String dest) {
        if(n==1)
        {
            System.out.println("transferred "+n+"from"+src+" -> "+dest);
            return;
        }
        towerOfHanoi(n-1, src,dest,hlpr);
        System.out.println("transferred "+(n-1)+"from"+src+" -> "+dest);
        towerOfHanoi(n-1, hlpr,src, dest);
    }
}