class Solution {
    public int scoreOfString(String s) {
        int a=0;
        for(int i=0;i<s.length()-1;i++) 
        {
            char ch=s.charAt(i);
            char b=s.charAt(i+1);
             a+=Math.abs((int)(ch)-(int)(b));
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna