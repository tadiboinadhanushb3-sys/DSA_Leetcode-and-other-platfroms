class Solution {
    public int firstMatchingIndex(String s) {
        int f=0;
        int min=-1;
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {

          if(a[i]==a[a.length-i-1])
          {
            f=i;
            return f;
          }
       
        }
return min;
    }
}