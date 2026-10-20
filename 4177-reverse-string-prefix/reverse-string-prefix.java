class Solution {
    public String reversePrefix(String s, int k) {
        int i=1;
        String res="";
     for(i=k-1;i>=0;i--)
        {
          char ch=s.charAt(i);
          res+=ch+"";
        }
        res+=s.substring(k);
        return res;
    }
}