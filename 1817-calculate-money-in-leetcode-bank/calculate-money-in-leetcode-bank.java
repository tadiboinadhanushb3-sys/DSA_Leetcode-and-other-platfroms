class Solution {
    public int totalMoney(int n) {
        int total = 0;
        int monday = 1;

        while (n > 0) {
            int days = Math.min(n, 7);

            for (int i = 0; i < days; i++) {
                total += monday + i;
            }

            monday++;
            n -= days;
        }

        return total;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna