import java.util.*;
public class 最常回文 {   
    public int getLongestPalindrome (String A) {
        int max = 1;
        for(int i = 0; i < A.length(); i++){
            max =Math.max(max,Math.max(csd(A,i,i),csd(A,i,i+1)));
        }
        return max;

    }

    public int csd(String s, int begin, int end){
        while(begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end))
        {
            begin--;
            end++;
        }
        return end - begin - 1;
}
}