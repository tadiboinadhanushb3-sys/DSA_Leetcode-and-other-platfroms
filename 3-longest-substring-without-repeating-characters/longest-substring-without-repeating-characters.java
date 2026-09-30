class Solution {
    public int lengthOfLongestSubstring(String s) {
        String result="";
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(result.indexOf(ch)==-1)
            {
                result+=ch;
            }
            else
            {
                result=result.substring(result.indexOf(ch)+1);
                result+=ch;
            }
            max=Math.max(max,result.length());
        }
        
        return max;
    }
}