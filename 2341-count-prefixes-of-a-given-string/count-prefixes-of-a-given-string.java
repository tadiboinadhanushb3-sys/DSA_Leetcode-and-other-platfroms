class Solution {
    public int countPrefixes(String[] words, String s) {
        int c=0;
        for(int i=0;i<words.length;i++)
        {
            String a=words[i];
            if(s.startsWith(a))
            {
                c++;
            }
        }
        return c;
    }
}