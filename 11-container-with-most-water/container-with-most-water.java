class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int first=0;
        while(l<r)
        {
            int base=r-l;
            int h=Math.min(height[l],height[r]);
            int area=base*h;
            first=Math.max(area,first);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return first;
    }
}