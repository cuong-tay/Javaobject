package baiTapJava.GameSudoku;

public class Game {
    private Node[][] arr;

    public Game(int[][] initialValues) {
       this.arr= new Node[9][9];

        for (int i = 0; i < initialValues.length; i++) {
            for (int j = 0; j < initialValues[i].length; j++) {
                arr[i][j] = new Node(i,j,initialValues[i][j]);
            }
        }


    }
/*
 private Node[][] createDefaultMatrix() {
        int[][] initialValues = {
                {5, 7, 1, 3, 9, 6, 4, 2, 8},
                {3, 2, 8, 1, 7, 4, 6, 5, 9},
                {6, 9, 4, 2, 5, 8, 7, 1, 3},
                {1, 8, 3, 5, 6, 7, 2, 9, 4},
                {7, 4, 9, 8, 3, 2, 1, 6, 5},
                {2, 5, 6, 4, 1, 9, 3, 8, 7},
                {4, 3, 2, 9, 8, 1, 5, 7, 6},
                {8, 6, 5, 7, 2, 3, 9, 4, 1},
                {9, 1, 7, 6, 4, 5, 8, 3, 0}
        };

        Node[][] defaultMatrix = new Node[9][9];

        for (int i = 0; i < initialValues.length; i++) {
            for (int j = 0; j < initialValues[i].length; j++) {
                defaultMatrix[i][j] = new Node(i,j,initialValues[i][j]);
            }
        }

        return defaultMatrix;
    }
*/

    public Node[][] getArr() {
        return arr;
    }

    public void setArr(Node[][] arr) {
        this.arr = arr;
    }



    public boolean isValidMove(int row, int col, int value) {
        return row >= 0 && row < arr.length && col >= 0 && col < arr[row].length &&
                arr[row][col].getValue() == 0 &&
                !isNumberInRow(row, value) &&
                !isNumberInColumn(col, value) &&
                !isNumberInBox(row, col, value);
    }
 // kiểm tra hàng
    private boolean isNumberInRow(int row, int number) {
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i].getValue() == number) {
                return true;
            }
        }
        return false;
    }
 // kiểm tra cột
    private boolean isNumberInColumn(int column, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][column].getValue() == number) {
                return true;
            }
        }
        return false;
    }
 // kiểm tra ma trận 3*3
    private boolean isNumberInBox(int row, int column, int number) {
        int localBoxRow = row - row % 3;
        int localBoxColumn = column - column % 3;

        for (int i = localBoxRow; i < localBoxRow + 3; i++) {
            for (int j = localBoxColumn; j < localBoxColumn + 3; j++) {
                if (arr[i][j].getValue() == number) {
                    return true;
                }
            }
        }
        return false;
    }
 //kểm tra sự lấp đầy
    public boolean isSolved() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].getValue() == 0) {
                    return false;
                }
            }
        }
        System.out.println("Chúc mừng! Câu đố đã được giải quyết!");
        return true;
    }


}
