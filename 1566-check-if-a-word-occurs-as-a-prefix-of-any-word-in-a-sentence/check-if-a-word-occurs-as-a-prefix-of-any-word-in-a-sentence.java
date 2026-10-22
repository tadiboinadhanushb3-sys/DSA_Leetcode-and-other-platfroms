class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String words[]=sentence.split(" ");

        for(int i=0;i<words.length;i++)
        {
            String w=words[i];
            if(w.length()>searchWord.length()||w.length() == searchWord.length())
            {
                if(w.startsWith(searchWord))
                {
                    return i+1;
                }
            }
        }
        return -1;
            }
}