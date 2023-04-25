import java.util.*;
//很简洁明了的dfs，由于是无重复的，就不用used标志用过没用过，直接判断path里面有没有

public class 没有重复项数字的全排列 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> path = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> permute(int[] num) {


        int n = num.length;
        if (n == 0)  return res;
        dfs(num, n);
        return res;
    }

private void dfs(int a[], int n) {
    if (path.size() == n)  {
        res.add(new ArrayList<Integer>(path));
        return;
    }
    for (int i = 0; i < n; i++) {
        if (!path.contains(a[i])) {
            path.add(a[i]);
            dfs(a, n);
            path.remove(path.size() - 1);
        }
    }

    return ;
}}