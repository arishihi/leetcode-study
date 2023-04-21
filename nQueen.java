

//非常巧妙
public class nQueen {
    int n;
    int count;
    int[] board;
    
    public int Nqueen (int n) {
        this.n = n;
        this.count = 0;
        this.board = new int[n];
        backtrack(0);
        return count;
    }
    public void backtrack(int row){
        if(row == n){
            count++;
            return;}
        for(int col = 0; col < n; col++){
            if(check(col, row)){
                board[row] = col;
                backtrack(row+1);
            }

        }
    }
    public boolean check(int col, int row){
        for(int i = 0; i < row; i++){
            if(board[i] == col || Math.abs(row - i) == Math.abs(board[i] - col))
            return false;            
        }return true;
    }
}