class Solution {
    String ans = "";
    int count = 0;

    public String getHappyString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        dfs(n, k, sb);
        return ans;
    }

    void dfs(int n, int k, StringBuilder sb) {
        if (sb.length() == n) {
            count++;

            if (count == k) {
                ans = sb.toString();
            }
            return;
        }

        for (char ch = 'a'; ch <= 'c'; ch++) {
            if (sb.length() > 0 &&
                sb.charAt(sb.length() - 1) == ch) {
                continue;
            }

            sb.append(ch);
            dfs(n, k, sb);

            if (!ans.isEmpty())
                return;

            sb.deleteCharAt(sb.length() - 1);
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna