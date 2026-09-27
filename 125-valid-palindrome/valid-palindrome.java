class Solution {
    public boolean isPalindrome(String s) {
        String r=s.toLowerCase();
        String k="";
        String a="";
        for(char ch:r.toCharArray())
        {
            if(Character.isLetterOrDigit(ch))
            {
                k+=ch;
            }
        }
        for(int i=k.length()-1;i>=0;i--)
         {
            a+=k.charAt(i);
        }
        if(a.equals(k))
        {
            return true;
        }
        return false;

    }
}