import java.util.*;

//堆排序（Heap Sort) 堆是完全二叉树，可用数组表示
//大根堆，小跟堆，用起来感觉挺方便的，就是定义有点麻烦，要记点东西
//研究半天堆怎么实现，结果有自成的函数不需要我写，直接用就行了。
//真要实现起来感觉也不容易
public class 最小k个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0 || k <= 0 || k > input.length) {
            return res;
        }
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k,
                Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.offer(input[i]);
        }
        for (int i = k; i < input.length; i++) {
            if (input[i] < maxHeap.peek()) {
                maxHeap.poll();
                maxHeap.offer(input[i]);
            }
        }
        res.addAll(maxHeap);
        return res;
    }
}


