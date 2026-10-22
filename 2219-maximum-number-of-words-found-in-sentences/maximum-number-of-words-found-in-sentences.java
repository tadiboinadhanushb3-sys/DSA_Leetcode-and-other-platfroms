import java.util.*;
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++)
        {
            String w[]=sentences[i].split(" ");
            int count=0;
            for(int j=0;j<w.length;j++)
            {
              count++;
            }
    max=Math.max(max,count);
        }
        return max;
    }
}