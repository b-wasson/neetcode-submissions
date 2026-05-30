class Solution {

    boolean[][] seenArray;
    public int numIslands(char[][] grid) {

       seenArray = new boolean[grid.length][grid[0].length];
       int islandCounter = 0;

       for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                char c = grid[i][j];
                
                if(c == '1'){
                    if(checkNewIsland(i, j, grid)){
                        islandCounter++;
                    }
                }
                
            }
       } 

       return islandCounter; 
    }

    public boolean checkNewIsland(int i, int j, char[][] grid){
        // if the surronding tiles are land or sea 
        //check if the current node is apart of a seen island 
        if(seenArray[i][j]){
            return false;
        }
        
        //marks all the touching pieces of land as seen
        markIsland(i, j, grid);

        return true;
    
    }

  public void markIsland(int x, int y, char[][] grid){
    seenArray[x][y] = true; // mark the current cell

    if(x != 0 && grid[x-1][y] == '1' && !seenArray[x-1][y]){
        markIsland(x-1, y, grid);
    }

    if(y != 0 && grid[x][y-1] == '1' && !seenArray[x][y-1]){
        markIsland(x, y-1, grid);
    }

    if(x != seenArray.length - 1 && grid[x+1][y] == '1' && !seenArray[x+1][y]){
        markIsland(x+1, y, grid);
    }

    if(y != seenArray[0].length - 1 && grid[x][y+1] == '1' && !seenArray[x][y+1]){
        markIsland(x, y+1, grid);
    }
}
}
