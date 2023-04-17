import java.util.*;

class Solution {
    public List<String> permutation(String S) {
        List<String> res = new ArrayList<>();
        if (S == null || S.length() == 0) {
            return res;
        }
        char[] chs = S.toCharArray();
        Arrays.sort(chs);
        boolean[] used = new boolean[S.length()];
        dfs(chs, used, new StringBuilder(), res);
        return res;
    }
    
    private void dfs(char[] chs, boolean[] used, StringBuilder sb, List<String> res) {
        if (sb.length() == chs.length) {
            res.add(sb.toString());
            return;
        }
        for (int i = 0; i < chs.length; i++) {
            if (used[i] || (i > 0 && chs[i] == chs[i - 1] && !used[i - 1])) {
                continue;
            }
            used[i] = true;
            sb.append(chs[i]);
            dfs(chs, used, sb, res);
            sb.deleteCharAt(sb.length() - 1);
            used[i] = false;
        }
    }
}