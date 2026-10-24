class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            hm.put(d,hm.getOrDefault(d,0)+1);
            temp=temp/10;
        }
        int sum=0;
        for(int key:hm.keySet())
        {
            sum+=key*hm.get(key);
        }
        return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna