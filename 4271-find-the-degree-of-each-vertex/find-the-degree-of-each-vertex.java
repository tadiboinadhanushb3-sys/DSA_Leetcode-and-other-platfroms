class Solution {
    public int[] findDegrees(int[][] matrix) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
        {
            int c=0;
            for(int j=0;j<matrix[i].length;j++)
            {
            if(matrix[i][j]==1)
            {
                c++;
            }
            }
            al.add(c);
        }
        int b[]=new int[al.size()];
        for(int i=0;i<b.length;i++)
        {
            b[i]=al.get(i);
        }
        return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna