//这是bfs 还是dfs 有点搞不懂
//自己做半天还做不出来，气死
//这个反而不用在最开始用if语句返回，陷入固执了
//叫他自己按条件一点点判断最后也不用返回，只要统计出最大数值就好了
//他用的这个len型参很有意思，函数执行完就消除掉了，不会影响回溯后的判断
//原作者题注“注意：这题dfs不需要记录visited, 因为能走的路径是单向的
// A能走到B说明B>A, 那B之后必不可能revisit A”
//这种题要是再来个visited不知道有多么地狱，列出来就是一大坨

public class 矩阵最长递增路径 {
    int[][] directions = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    int n, m, maxLen;

    public int solve (int[][] matrix) {
        n = matrix.length;
        m = matrix[0].length;
        maxLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                solveRec(i, j, 0, matrix);
            }
        }
        return maxLen;
    }

    public void solveRec(int i, int j, int len, int[][] matrix) {
        if (++len > maxLen)
            maxLen = len;

        for (int[] dir : directions) {
            int i_next = i + dir[0], j_next = j + dir[1];
            if (i_next < 0 || i_next >= n || j_next < 0 || j_next >= m)
                continue;
            if (matrix[i_next][j_next] <= matrix[i][j])
                continue;
            solveRec(i_next, j_next, len, matrix);
        }
    }
}