package baiTapJava;

import java.util.Scanner;

public class SudokuGame {
    /*
    Đáp án:
                {5, 7, 1, 3, 9, 6, 4, 2, 8},
                {3, 2, 8, 1, 7, 4, 6, 5, 9},
                {6, 9, 4, 2, 5, 8, 7, 1, 3},
                {1, 8, 3, 5, 6, 7, 2, 9, 4},
                {7, 4, 9, 8, 3, 2, 1, 6, 5},
                {2, 5, 6, 4, 1, 9, 3, 8, 7},
                {4, 3, 2, 9, 8, 1, 5, 7, 6},
                {8, 6, 5, 7, 2, 3, 9, 4, 1},
                {9, 1, 7, 6, 4, 5, 8, 3, 2}
    Đề bài:
                {0, 0, 1, 3, 0, 6, 0, 0, 8},
                {0, 0, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 4, 2, 0, 0, 0, 0, 3},
                {0, 0, 3, 0, 0, 0, 0, 9, 0},
                {0, 0, 9, 8, 0, 2, 1, 0, 0},
                {0, 5, 0, 0, 0, 0, 3, 0, 0},
                {4, 0, 0, 0, 0, 1, 5, 0, 6},
                {0, 0, 0, 0, 2, 0, 0, 0, 0},
                {9, 0, 0, 6, 0, 5, 8, 0, 0}

     */
    private static long startTime;
    private static long endTime;
    public static void startTimer() {
       startTime = System.currentTimeMillis();
    }

    public static void endTimer() {
         endTime = System.currentTimeMillis();
    }

    public static void printElapsedTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Thời gian giải đố: " + (elapsedTime / 1000) + " giây");
    }
    private static final int SIZE = 9;

    public static void main(String[] args) {
        int[][] board = {
                {0, 0, 1, 3, 0, 6, 0, 0, 8},
                {0, 0, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 4, 2, 0, 0, 0, 0, 3},
                {0, 0, 3, 0, 0, 0, 0, 9, 0},
                {0, 0, 9, 8, 0, 2, 1, 0, 0},
                {0, 5, 0, 0, 0, 0, 3, 0, 0},
                {4, 0, 0, 0, 0, 1, 5, 0, 6},
                {0, 0, 0, 0, 2, 0, 0, 0, 0},
                {9, 0, 0, 6, 0, 5, 8, 0, 0}
        };

        printBoard(board);
        startTimer();// thời gian giải đố tính theo thời gian thực
        Scanner sc= new Scanner(System.in);
        System.out.print("---------Nhập hàng (1-9), cột (1-9) và giá trị (1-9) cách nhau bằng dấu cách (hoặc nhập '0 0 0' để thoát)------------ \n");
        System.out.println("Lưu ý bạn chỉ có 3 cơ hội để nhập lại.Nếu sai bạn sẽ DIE");
        int mang = 3;
        while (!isSolved(board) && mang>0) {

            System.out.println("Nhập tọa độ cần điền");
            int row=sc.nextInt(),col= sc.nextInt();
            System.out.println("Nhập giá trị để giải: ");
            int value=sc.nextInt();
            if (row == -1 && col == -1 && value == 0) {
                System.out.println("Exiting the game.");
                break;
            }
            if (isValidMove(board, row, col, value)) {

                board[row][col] = value;
                printBoard(board);
            } else {
                System.out.println("Nước đi của bạn đã bị sai!!");
                mang--;
                System.out.println("Bạn còn "+mang+" mạng");

                if (mang==0){
                    System.out.println("Bạn đã thua :(((");
                    break;
                }
            }
        }
        endTimer();
        printElapsedTime();
        sc.close();
    }

    private static void printBoard(int[][] board) {
        System.out.println("   -------------------------------   ");
        for (int row = 0; row < SIZE; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("   -------------------------------   ");
            }
            System.out.print(" | ");
            for (int column = 0; column < SIZE; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print(" | ");
                }
                System.out.print(board[row][column] == 0 ? " * " :" "+ board[row][column] + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("   -------------------------------   ");
    }

    private static boolean isValidMove(int[][] board, int row, int col, int value) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE &&//ddkien hàng cột phải từ [0,9)
                board[row][col] == 0 &&
                !isNumberInRow(board, value, row) &&
                !isNumberInColumn(board, value, col) &&
                !isNumberInBox(board, value, row, col);
    }
//ktra xem số nhập(number) đã có trong hàng chưa
    private static boolean isNumberInRow(int[][] board, int number, int row) {
        for (int i = 0; i < SIZE; i++) {
            if (board[row][i] == number) {
                return true;
            }
        }
        return false;
    }
 //ktra xem số nhập(number) đã có trong cột chưa
    private static boolean isNumberInColumn(int[][] board, int number, int column) {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][column] == number) {
                return true;
            }
        }
        return false;
    }
//ktra xem số nhập(number) đã có trong ô 3x3 chưa
    private static boolean isNumberInBox(int[][] board, int number, int row, int column) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (board[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }
//ktra xem ma trận đã được lấp đầy hay chưa
    private static boolean isSolved(int[][] board) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        System.out.println("Chúc mừng! Câu đố đã được giải quyết!");
        return true;
    }
}
