import java.util.*;
public class NC61_两数之和 {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        int n = numbers.length;
        int[] res = {-1, -1};
        //遍历数组
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                //判断相加值是否为target
                if (numbers[i] + numbers[j] == target) {
                    res[0] = i+1;
                    res[1] = j+1;
                    //返回值
                    return res;
                }
            }
        }
        return res;
    }
}
// 
// 时间复杂度：O(n^2) 遍历两次数组
// 空间复杂度：O(1) 未申请额外空间  hash 解法不明 放过