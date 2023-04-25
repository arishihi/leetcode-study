//小而美，简洁直观才是递归的存在价值，如果说递归反而递的更麻烦了，那还递归干什么
//dfs的时候会把遍历到的岛改成海，在遍历之前统计个数，很巧妙，省了很多代码
//就好像是大鲸鱼吃小岛，在吃之前看一眼，全吃完了就知道吃了几个岛了。

public class 岛屿数量 {

    public int solve (char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid, int i, int j) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i - 1, j);
        dfs(grid, i + 1, j);
        dfs(grid, i, j - 1);
        dfs(grid, i, j + 1);
    }
}