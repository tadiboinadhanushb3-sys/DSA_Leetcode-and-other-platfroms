class Solution {
    public String reversePrefix(String word, char ch) {
        int a=word.indexOf(ch);
        char c[]=word.toCharArray();
        int i=0;
        while(i<=a)
        {
            char temp=c[i];
            c[i]=c[a];
            c[a]=temp;
            i++;
            a--;
        }
        return new  String(c);
    }
}