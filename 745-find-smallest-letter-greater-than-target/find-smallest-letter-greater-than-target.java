import java.util.*;
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        ArrayList<Character> res=new ArrayList<>();
        res.add(target);
        for(int i=0;i<letters.length;i++)
        {
            res.add(letters[i]);
        }
        Collections.sort(res);
        for (int i = 0; i < res.size(); i++) {
            if (res.get(i) > target) {
                return res.get(i);
            }
        }

        return res.get(0);
    }
}