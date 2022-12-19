class sortFreqency {
    public String frequencySort(String s) {
        char a,b;
        int f=0;
        int len=s.length();
        char tempArray[] = s.toCharArray();
        // Sorting temp array using
        Arrays.sort(tempArray);
        // Returning new sorted string
        StringBuilder result =new StringBuilder( new String(tempArray));
        result.reverse();
        int count[] =new int[127];
        //created a hashmap
        for(int i=0;i<len;i++)
        {
            count[result.charAt(i)]++;
        }
        //modifying our string
        for(int i=0;i<len/4;i++)
        {
            f=0;
            for(int j=0;j<len-1;j++)
            {
                f=1;
                a=result.charAt(j);
                b=result.charAt(j+1);
                if(a==b)continue;
                if(count[a]<count[b])
                {
                    
                        result.setCharAt(j,b);
                        result.setCharAt(j+1,a);
                   
                }
                // else if(count[a]==count[b])
                // {
                //     if(a<b)
                //     {
                        
                //         result.setCharAt(j,b);
                //         result.setCharAt(j+1,a);
                //     }
                // }
            }
            if(f==0)
            return result.toString();
        }
        return result.toString();
    }
}