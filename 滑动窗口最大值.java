import java.util.*;
//很难，双端队列
//不知道还有什么其他问题需要类似解法。感觉很特殊也很巧妙
public class 滑动窗口最大值 {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> res = new ArrayList<>();
        if (num == null || num.length == 0 || size <= 0 || size > num.length) {
            return res;
        }
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < num.length; i++) {
            while (!deque.isEmpty() && deque.peekFirst() < i - size + 1) {
                deque.pollFirst();
            }
            while (!deque.isEmpty() && num[deque.peekLast()] < num[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            if (i >= size - 1) {
                res.add(num[deque.peekFirst()]);
            }
        }
        return res;
    }
}