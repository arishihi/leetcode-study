import java.util.*;
//加减乘 算法非常巧妙。让前面的数和后面的数运算，把运算符巧妙地存到下次检测到运算符的时候执行。
//递归运算括号不知道算不算麻烦

public class 计算器表达式求值 {

    public int solve (String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        int num = 0;
        char op = '+';
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }
            if (c == '(') {
                int j = findClosingBracket(s, i);
                num = solve(s.substring(i + 1, j)); // 递归计算括号内表达式的值
                i = j;
            }
            if ((!Character.isDigit(c) && c != ' ') || i == s.length() - 1) {
                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(-num);
                } else if (op == '*') {
                    stack.push(stack.pop() * num);
                } else if (op == '/') {
                    stack.push(stack.pop() / num);
                }
                op = c;
                num = 0;
            }
        }
        int res = 0;
        while (!stack.isEmpty()) {
            res += stack.pop();
        }
        return res;
    }
    private int findClosingBracket(String s, int i) {
        int count = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (c == '(') count++;
            if (c == ')') count--;
            if (count == 0) return i;
            i++;
        }
        return -1;
    }


}