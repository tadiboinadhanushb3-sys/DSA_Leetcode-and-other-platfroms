class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] result = new char[words.length];
        for (int i = 0; i < words.length; i++) {
            int sum = 0;
            for (char c : words[i].toCharArray()) {
                sum += weights[c - 'a'];
            }
            int rem = sum % 26;
            result[i] = (char) ('z' - rem);
        }
        return new String(result);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna