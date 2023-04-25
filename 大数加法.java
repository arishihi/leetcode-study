//我还用String.valueOf() 然后Integer.parseInt()解，一看评论区都在用BigInteger,满头问号
//我就是大聪明
//其实不用倒转两个字符，反向循环就行了，这样反而还麻烦了


public class 大数加法 {

    public String solve (String s, String t) {

        StringBuilder res = new StringBuilder();
        int i = 0, j = 0, carry = 0;
        s = new StringBuilder(s).reverse().toString();
        t = new StringBuilder(t).reverse().toString();
        while (i < s.length() || j < t.length() || carry > 0) {
            int n1 = i < s.length() ? s.charAt(i++) - '0' : 0;
            int n2 = j < t.length() ? t.charAt(j++) - '0' : 0;
            int sum = n1 + n2 + carry;
            carry = sum / 10;
            res.append(sum % 10);
        }
        return res.reverse().toString();
    }
}