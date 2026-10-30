class Solution {
    public String reverseOnlyLetters(String s) {
        char a[]=s.toCharArray();
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(!Character.isLetter(a[l]))
            {
                l++;
            }
            else if(!Character.isLetter(a[r]))
            {
                r--;
            }
            else
            {
                char temp=a[l];
                a[l]=a[r];
                a[r]=temp;
                l++;
                r--;
            }
        }
        return new String(a);
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna