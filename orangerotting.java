import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>(); //Queue()?
        int freshcount = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2)
                queue.offer(new int[] {i,j});        
                else if(grid[i][j] == 1)
                freshcount++;
            }
        }
    
    int[][] Directions = {{1,0},{0,1},{-1,0},{0,-1}};
    int minutes = 0;
    while(!queue.isEmpty() && freshcount > 0) 
    {
        int size = queue.size();
        for(int i = 0; i < size; i++){
            int[] orange = queue.poll();
            for(int direction[] : Directions){
                int x = orange[0] + direction[0];
                int y = orange[1] + direction[1];
            
            if(x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1){
                grid[x][y] = 2;
                queue.add(new int[] {x,y});
                freshcount--;
            }
        }
        }minutes++;
    }
    return freshcount == 0 ? minutes : -1;
}
}