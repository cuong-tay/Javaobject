package baiTapJava.GameSudoku;

import java.util.Scanner;

public class ControllGame {
    private Game gameModel;
    private GameView gameView;

   public ControllGame(Game gameModel, GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        int mang = 3;

        while (!gameModel.isSolved() && mang > 0) {
            gameView.printBoard(gameModel.getArr());
            System.out.println("Nhập tọa độ cần điền");
            int row = sc.nextInt(), col = sc.nextInt();
            System.out.println("Nhập giá trị để giải: ");
            int value = sc.nextInt();

            if (row == -1 && col == -1 && value == 0) {
                gameView.printMessage("Exiting the game.");
                break;
            }

            if (gameModel.isValidMove(row, col, value)) {
                gameModel.getArr()[row][col].setValue(value);
            } else {
                gameView.printMessage("Nước đi của bạn đã bị sai!!");
                mang--;

                if (mang == 0) {
                    gameView.printMessage("Bạn đã thua :(((");
                    break;
                }
            }
        }

        sc.close();
    }
}
