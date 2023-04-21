import java.util.PriorityQueue;
//很精彩，两个堆不断堆加，维持两个堆的平衡
//最后只需要取尖端就能简单解决。
//不可思议的是还能分布 输出不同阶段的中位数
//不太了解流的机制

public class 数据流中的中位数 {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
    private PriorityQueue<Integer> minHeap = new PriorityQueue<>();


    public void Insert(Integer num) {
        if (maxHeap.isEmpty() || num <= maxHeap.peek()) {
            maxHeap.offer(num);
            // 当插入元素后，如果两个堆大小差距大于1，则需要平衡两个堆的大小
            if (maxHeap.size() - minHeap.size() > 1) {
                minHeap.offer(maxHeap.poll());
            }
        } else {
            minHeap.offer(num);
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.offer(minHeap.poll());
            }
        }
    }

    public Double GetMedian() {
        int size = maxHeap.size() + minHeap.size();
        if (size % 2 == 0) {
            return (double) (maxHeap.peek() + minHeap.peek()) / 2;
        } else {
            return (double) maxHeap.peek();
        }
    }


}
