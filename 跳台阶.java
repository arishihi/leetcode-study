class 跳台阶 {
    public int jumpFloor(int target) {
        if(target <= 1) return 1;
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}


class Solution {
    public:
        int f[50]{0};
        int jumpFloor(int number) {
            if (number <= 1) return 1;
            if (f[number] > 0) return f[number];
            return f[number] = (jumpFloor(number-1)+jumpFloor(number-2));
        }
    };