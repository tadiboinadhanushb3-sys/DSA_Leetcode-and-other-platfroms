class Solution {
    public String restoreString(String s, int[] indices) {
        String m="";
        char a[]=new char[s.length()];
        for(int i=0;i<indices.length;i++)
        {
            a[indices[i]]=s.charAt(i);
        }
        for(int i=0;i<a.length;i++)
        {
            m+=a[i];
        }
        return m;
    }
}