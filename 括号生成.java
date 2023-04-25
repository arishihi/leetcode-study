import java.util.*;
//生殖器生成（x
//dfs depth-first search 感觉就像人生一样，很精巧，很不可思议，也很无奈
//整个程序，就一行命令而已
//进入程序也不过一眼就能看到终点，只是最开始还达不到他，只能绕开
//重复多少次，也完不成
//可一旦完成，一切就都结束了
//不如说，if在最前面，即是开端，又是终结
//是 一切结束的原因，也是一切开始运行的原因

public class 括号生成 {
    int n;
    ArrayList<String> res = new ArrayList<String>();
    public ArrayList<String> generateParenthesis (int n) {
        this.n = n;

        dfs("", n, n);
        
        return res;
    }
    public void dfs(String s, int left, int right){
        if(left == 0 && right == 0){
            res.add(s);
            return;
            }
        if(left > 0)dfs(s+"(", left -1, right);
        if(right > left && right > 0)dfs(s + ")", left, right -1);
    }
}