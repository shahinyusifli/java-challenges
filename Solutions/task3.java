public class Task3 {
    public static void main(String args[]){
        int[][] board = new int[8][8];
        int startingCol = 0;
        int shiftedCol = 1;

        int allPosiblePoints = getMaxPointsForEightQueens(board);
        System.out.println("Total suitable points for queens: " + allPosiblePoints);
    }


    private static int getMaxPointsForEightQueens(int[][] board) {
        int allPosiblePoints = 0;
        int iterations = 0;
        int boardSize = board.length-1;

        return allPosiblePoints;
    }

    private static int putAllPoints(int[][] board,  int startingRow, int shiftedRow, int startingCol, int shiftedCol) {

        int[][] orginalBoard = board;
        int size = board.length;
        int iterations = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0){
                    if (shiftedRow>1 && shiftedCol>1) {
                        orginalBoard = putPoint(orginalBoard, shiftedRow, shiftedCol);
                    }
                    else orginalBoard = putPoint(orginalBoard, i, j);

                    iterations += 1;
                    System.out.println("Row: " + (i+1));
                    System.out.println("Column: " + (j+1));
                    System.out.println("Board: ");
                    printBoard(orginalBoard);
                }
            }
        }

        return iterations;
    }

    private static int[][] putPoint(int[][] board, int row, int col){

        int[][] orginalBoard = board;

        for (int i = 0; i < board.length; i++) {
            // Indicating 1 to selected row
            orginalBoard[row][i] = 1;
            // Indicating 1 to selected col
            orginalBoard[i][col] = 1;

            // Indicating 1 to selected diagonals
            // Bottom diagonals
            // Bottom right diagonal
            int selectedRow = row+i;
            int selectedCol = col+i;
            if (selectedRow<8 && selectedCol<8) {
                orginalBoard[selectedRow][selectedCol] = 1;
            }

            // Bottom left diagonal
            selectedCol=col-i;
            if (selectedRow<8 && selectedCol>=0) {
                orginalBoard[selectedRow][selectedCol] = 1;
            }

            // Up diagonals
            // Up right diagonals
            selectedRow = row-i;
            selectedCol = col+i;

            if (selectedRow>=0 && selectedCol<8) {
                orginalBoard[selectedRow][selectedCol] = 1;
            }

            // Up left diagonal
            selectedCol = col-i;
            if (selectedRow>=0 && selectedCol>=0){
                orginalBoard[selectedRow][selectedCol] = 1;
            }
        }

        return orginalBoard;
    }

    private static void printBoard(int[][] board){

        int boardSize = board.length;

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

