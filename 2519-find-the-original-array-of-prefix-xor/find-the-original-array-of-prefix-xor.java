class Solution {
    public int[] findArray(int[] pref) {
        int n=pref.length;
        int a[]=new int[n];
         a[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
            a[i]=pref[i]^pref[i-1];
        }
        return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna