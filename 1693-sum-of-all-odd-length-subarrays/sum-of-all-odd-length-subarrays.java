class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
       
        int n=arr.length;
        for(int i=0;i<arr.length;i+=2)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                for(int k=j;k<=j+i;k++){
              

                sum+=arr[k];
                }
            }
        }
       return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna