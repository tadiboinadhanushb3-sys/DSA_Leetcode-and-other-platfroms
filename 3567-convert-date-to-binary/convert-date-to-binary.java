class Solution {
    public String convertDateToBinary(String date) {
        String w[]=date.split("-");
        String res="";
        for(int i=0;i<w.length;i++)
        {
            int m=Integer.parseInt(w[i]);
            String k=Integer.toBinaryString(m);
            res+=k;
              if(i != w.length - 1) {
                res += "-";
            }
        }
        return res.trim();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna