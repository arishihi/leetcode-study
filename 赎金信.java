class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] cnt = new int[26];
        for (char c : magazine.toCharArray()) {
            cnt[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            cnt[c - 'a']--;
            if(cnt[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}


class Solution2 {
    public boolean canConstruct(String ransomNote, String magazine) {
       if(ransomNote.length()>magazine.length()){
           return false;
       }
       int[] ascii = new int[26];
       for(char c : ransomNote.toCharArray()){
           int index = magazine.indexOf(c,ascii[c - 'a']);
           if(index == -1){
               return false;
           }
           ascii[c - 'a'] = index + 1;
       }
       return true;
   }
}