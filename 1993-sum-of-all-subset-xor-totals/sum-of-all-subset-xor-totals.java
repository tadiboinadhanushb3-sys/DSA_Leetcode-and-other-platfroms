class Solution {
    public int subsetXORSum(int[] nums) {
        return solve(nums, 0, 0);
    }

    public int solve(int[] nums, int index, int xor) {
        if (index == nums.length) {
            return xor;
        }

        // Include current element
        int include = solve(nums, index + 1, xor ^ nums[index]);

        // Exclude current element
        int exclude = solve(nums, index + 1, xor);

        return include + exclude;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna