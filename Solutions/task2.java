import java.util.Scanner;

public class task2 {

    //Nic noc game
    public static void iterateNumbers(int[][] board){
        int userInputRow;
        int userInputCol;
        int[][] orginalBoard=board;
        boolean orgianlWinear = false;

        Scanner scanner= new Scanner(System.in);

        System.out.println("First user please enter row:");
        userInputRow = scanner.nextInt()-1;
        System.out.println("First user please enter col:");
        userInputCol = scanner.nextInt()-1;
        orginalBoard[userInputRow][userInputCol] = 1;
        printMatrix(orginalBoard);
        // Check there is some winer
        orgianlWinear = checkThereIsWiner(orginalBoard);
        if (orgianlWinear == true){
            System.out.println("Winer is a first user!!");
            return;
        }

        System.out.println("Second user please enter row:");
        userInputRow = scanner.nextInt()-1;
        System.out.println("Second user please enter col:");
        userInputCol = scanner.nextInt()-1;
        orginalBoard[userInputRow][userInputCol] = 2;
        printMatrix(orginalBoard);
        // Check there is some winer
        orgianlWinear = checkThereIsWiner(orginalBoard);
        if (orgianlWinear == true){
            System.out.println("Winer is a second user!!");
            return;
        }

        iterateNumbers(board);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println(" ");
        }
    }

    public static boolean checkThereIsWiner(int[][] matrix){

        boolean isThereWiner=false;
        for (int i = 0; i < matrix.length; i++) {
            //Check row
            if (matrix[i][0] == 1 && matrix[i][1] == 1 && matrix[i][2] == 1) {
                System.out.println("Condition 1");
                isThereWiner = true;
            }
            if (matrix[i][0] == 2 && matrix[i][1] == 2 && matrix[i][2] == 2) {
                System.out.println("Condition 2");
                isThereWiner = true;
            }

            //Check col
            if (matrix[0][i] == 1 && matrix[1][i] == 1 && matrix[2][i] == 1) {
                System.out.println("Condition 3");
                isThereWiner = true;
            }
            if (matrix[0][i] == 2 && matrix[1][i] == 2 && matrix[2][i] == 2) {
                System.out.println("Condition 4");
                isThereWiner = true;
            }


        }

        //Check main diagonal
        if (matrix[0][0] == 1 && matrix[1][1] == 1 && matrix[2][2] == 1) {
            System.out.println("Condition 5");
            isThereWiner = true;
        }
        if (matrix[2][0] == 2 && matrix[1][1] == 2 && matrix[0][2] == 2) {
            System.out.println("Condition 6");
            isThereWiner = true;
        }

            /*//Check left diagonal
            int reversedSize = matrix.length-i-1;
            if (matrix[reversedSize][reversedSize] == 1 && matrix[reversedSize][reversedSize] == 1 && matrix[reversedSize][reversedSize] == 1) {
                isThereWiner = true;
            }
            if (matrix[reversedSize][reversedSize] == 2 && matrix[reversedSize][reversedSize] == 2 && matrix[reversedSize][reversedSize] == 2) {
                isThereWiner = true;
            }*/

        return isThereWiner;
    }


}
