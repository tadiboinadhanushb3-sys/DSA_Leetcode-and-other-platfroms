class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < tasks.length; i++) {
            int finishTime = tasks[i][0] + tasks[i][1];
            min = Math.min(min, finishTime);
        }

        return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna