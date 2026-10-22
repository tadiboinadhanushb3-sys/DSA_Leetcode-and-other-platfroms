class Solution {
    public int hammingWeight(int n) {
        int count=0;
        String n1=Integer.toBinaryString(n);
        for(int i=0;i<n1.length();i++)
        {
            char ch=n1.charAt(i);
            if(ch=='1')
            {
                count++;
            }
        }
        return count;
    }
}