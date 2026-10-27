class Solution {
    public boolean judgeSquareSum(int c) {
         int l=0;
        int h=(int)(Math.sqrt(c));
        while(l<=h)
        {
      long r=(long)l*l+(long)h*h;
      if(r==c)
        {
            return true;
        }
        else if(r<c)
        {
            l++;

        }
        else
        {
            h--;
        }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna