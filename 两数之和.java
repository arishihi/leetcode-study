import java.util.*;
//越是朦胧，越是模糊不清，越是复杂的
//越会被人挂在嘴边，反复强调
//清洗明澈，一眼通透的，反而不会受人欢迎

public class 两数之和 {
    
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < numbers.length; i++)
        {
            int com = target - numbers[i];
            if(map.containsKey(com)){
                return new int[]{map.get(com)+1,i+1};
            }
            map.put(numbers[i],i);
        }
        return new int[0] ;
    }
}