package baiTapJava.GameSudoku;

public class GameView {
    public void printBoard(Node[][] arr) {
        System.out.println("   -------------------------------   ");
        for (int row = 0; row < arr.length; row++) {
            if (row % 3 == 0 && row != 0) {
                System.out.println("   -------------------------------   ");
            }
            System.out.print(" | ");
            for (int column = 0; column < arr[row].length; column++) {
                if (column % 3 == 0 && column != 0) {
                    System.out.print(" | ");
                }
                System.out.print(arr[row][column].getValue() == 0 ? " * " : " " + arr[row][column].getValue() + " ");
            }
            System.out.println(" | ");
        }
        System.out.println("   -------------------------------   ");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }
}
