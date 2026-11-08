class Solution {
    public int[] minOperations(String boxes) {
        int res[]=new int[boxes.length()];
        int k=0;
        for(int i=0;i<boxes.length();i++)
        {
            int c=0;
            for(int j=0;j<boxes.length();j++)
            {
                if(boxes.charAt(j)=='1')
                {
                    c+=Math.abs(i-j);

                }
            }
            res[k++]=c;
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna