class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1)
    {
    
        sum+=n/2;
        n=(n/2) + (n%2);
    }
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna