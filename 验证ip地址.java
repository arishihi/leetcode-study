import java.util.regex.*;
//正则表达式很有趣
//如果用普通方法会有亿些麻烦，因为有没有0,有没有点，有多少个之类的，边界条件多如牛毛
//正则很有意思，也很简洁


public class 验证ip地址 {
    
    public String solve (String IP) {
        String patternIPv4 = "^(([1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-5])\\.){3}([1-9]\\d?|1\\d\\d|2[0-4]\\d|25[0-5])$";
        String patternIPv6 = "^([0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$";

        if (Pattern.matches(patternIPv4, IP)) {
            return "IPv4";
        } else if (Pattern.matches(patternIPv6, IP)) {
            return "IPv6";
        } else {
            return "Neither";
        }
    }
}