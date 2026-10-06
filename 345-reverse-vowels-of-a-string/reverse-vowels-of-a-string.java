class Solution {
    public String reverseVowels(String s) {
       String res="aeiouAEIOU";
       char ch[]=s.toCharArray();
       int i=0;
       int j=s.length()-1;
       while(i<j)
       {
        if(res.indexOf(ch[i])==-1)
        {
            i++;
        }
        else if(res.indexOf(ch[j])==-1)
        {
            j--;
        }
        else
        {
            char t=ch[i];
            ch[i]=ch[j];
            ch[j]=t;
            i++;
            j--;
        }
       }
       return new String(ch);
            
        
    }
}