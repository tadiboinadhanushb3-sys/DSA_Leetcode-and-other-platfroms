class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int a[]=new int[n+1];
        a[0]=0;
        int k=1;
        for(int i=0;i<gain.length;i++)
        {
            a[k]=a[i]+gain[i];
            k++;
        }
        Arrays.sort(a);
    
        return a[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna