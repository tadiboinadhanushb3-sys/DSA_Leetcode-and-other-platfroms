class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;

        for (int num : nums) {
            total += num;
        }

        return total % 2 == 0 ? nums.length - 1 : 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna