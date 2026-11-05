class Solution {
    public int mirrorDistance(int n) {
        int k=n;
        int rev=0;

        while(k!=0)
        {
          rev=rev*10+(k%10);
          k=k/10;  
        }
        return Math.abs(rev-n);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna