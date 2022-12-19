import java.util.*;

class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer,Boolean> temp = new HashMap<>();
        while(n!=1)
        {
            if(temp.containsKey(n))
            {
                return false;
            }
            else
            {
                temp.put(n,true);
            }
            n=digitSqrSum(n);
            
        }
        return true;
    }
    public int digitSqrSum(int n)
    {
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum+=r*r;
            n/=10;
        }
        return sum;
    }
}
class happyNumber
{
    public static void main(String[] args) {
        Solution s =new Solution();
        for(int i=1;i<100000;i++)
        {
            if(s.isHappy(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}