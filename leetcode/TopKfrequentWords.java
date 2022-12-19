import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int key) {
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> wordList = new HashMap<>();
        int len=words.length;
        int p=0;
        for(int i=0;i<len;i++)
        {
            if(wordList.isEmpty() || wordList.containsKey(words[i])==false)
            {
                wordList.put(words[i],1);
                words[p++]=words[i];
                
            }
            else
            {
                wordList.put(words[i],wordList.get(words[i])+1);
            }
        }
        len=p;
        
        int ele,ele2,cnt=0;
        String temp;
        for(int j=0;j<len;j++)
        {
            ele=wordList.get(words[j]);
            p=j;
            temp=words[j];
            for(int k=j+1;k<len;k++)
            {
                ele2=wordList.get(words[k]);
                if(ele2>ele)
                {
                    System.out.println(ele+" "+ele2);
                    ele=ele2;
                    temp=words[k];
                    p=k;
                }
                else if(ele2==ele)
                {
                    if(temp.compareTo(words[k])>0)
                    {
                        temp=words[k];
                        p=k;
                    }
                }
            }
            if(p!=j)
            {
                cnt++;
                temp=words[p];
                words[p]=words[j];
                words[j]=temp;
            }
         
        }
        
        for(int j=0;j<key;j++)
        {
            result.add(words[j]);
        }
    return result;
    }
}
public class TopKfrequentWords
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String[] words ={"i","Love","Leetcode","i","Love","coding"};
        List<String> sol =new ArrayList<>();
        Solution s=new Solution();
        sol=s.topKFrequent(words, 2);
        for(int i=0;i<sol.size();i++)
        {
            System.out.println(sol.get(i));
        }
    }
}