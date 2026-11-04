class Solution {
    public int arrangeCoins(int n) {
        long sum=0;
        int k=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
            if(sum>n)
            {
                k=i-1;
                break;

            }
            k=i;
        }
        return k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna