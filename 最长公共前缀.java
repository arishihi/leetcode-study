//用substring从后面一点点减，直到减到公共前缀
//很简单，很巧秒
//不知道哪个天才能想出来的方法，用indexOf来处理这种乍一看毫不相干的问题
//据说是非常经典的字符串问题解法
//虽然很巧，但如果换成公共后缀的话就不那么容易了吧

public class 最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    return prefix;
}}