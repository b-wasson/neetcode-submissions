
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean valid = true;
        char row[] = new char[9];
        char col[] = new char[9];
        char square[] = new char[9];

        //check row to make sure valid 
        for(int j = 0; j < 9; j++){
            for(int i = 0; i < 9; i++){
                row[i] = board[i][j];
                col[i] = board[j][i];
            }
            if(!isValid(row)) return false; 
            if(!isValid(col)) return false; 
        }

       // check every 3x3 
        for (int r = 0; r < 9; r += 3) {
            for (int c = 0; c < 9; c += 3) {
                int index = 0;
                // Fill the square array with the 9 elements of the current 3x3 box
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        square[index++] = board[r + i][c + j];
                    }
                }
                if (!isValid(square)) return false;
            }
        }
        return true;
    }

    public boolean isValid(char[] line){
        HashSet<Character> lineHash = new HashSet<>();
        for(int i = 0; i < line.length; i++){
            //unique num and not empty
            if(!lineHash.add(line[i]) && line[i] != '.'){
                return false;
            }
        }
        return true;
    }
}
