import java.util.*;

public class 称砝码 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) { 
            HashSet<Integer> set = new HashSet<>();
            set.add(0);
            int n = in.nextInt();//个数
            int[] w = new int[n];
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();//砝码的重量
            }
            for (int i = 0; i < n; i++) {
                nums[i] = in.nextInt();//砝码个数
            }
            for (int i = 0; i < n; i++) { //遍历砝码
                ArrayList<Integer> list = new ArrayList<>(set);
                for (int j = 1; j <= nums[i]; j++) { //遍历个数
                    for (int k = 0; k < list.size(); k++) {
                        set.add(list.get(k) + w[i] * j);
                    }
                }
            }
            System.out.println(set.size());
        }
    }
}