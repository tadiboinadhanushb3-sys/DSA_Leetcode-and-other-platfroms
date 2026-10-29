import java.util.*;
class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }
       ArrayList<Integer> al=new ArrayList<>(hs);
       Collections.sort(al,Collections.reverseOrder());
       if(al.size()>2)
       {
        return al.get(2);
       }
       if(al.size()>1)
       {
        Collections.sort(al);
        return al.get(1);
       }
       return al.get(0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna