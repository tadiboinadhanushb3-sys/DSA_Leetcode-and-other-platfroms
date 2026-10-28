class Solution {
    public String sortSentence(String s) {
        String w[]=s.split(" ");
        String res="";
        for(int i1=1;i1<=w.length;i1++)
        {
        for(int i=0;i<w.length;i++)
        {
            String a=w[i];
            String t=String.valueOf(i1);
                if(a.contains(t))
                {
                res+=a.substring(0,a.length()-1)+" ";
                }
            }
        }
        return res.trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna