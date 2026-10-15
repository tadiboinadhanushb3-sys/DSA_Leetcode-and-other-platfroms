
import java.util.*;

class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int[] arr = score.clone();

        Arrays.sort(arr);

        String[] ans = new String[n];

        for (int i = 0; i < n; i++) {
            int rank = n - i;

            int index = -1;
            for (int j = 0; j < n; j++) {
                if (score[j] == arr[i]) {
                    index = j;
                    break;
                }
            }

            if (rank == 1)
                ans[index] = "Gold Medal";
            else if (rank == 2)
                ans[index] = "Silver Medal";
            else if (rank == 3)
                ans[index] = "Bronze Medal";
            else
                ans[index] = String.valueOf(rank);
        }

        return ans;
    }
}
