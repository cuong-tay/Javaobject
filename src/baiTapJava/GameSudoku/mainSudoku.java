package baiTapJava.GameSudoku;


public class mainSudoku {
    public static void main(String[] args) {
        int[][] broad = {
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
        System.out.print("---------Nhập hàng (1-9), cột (1-9) và giá trị (1-9) cách nhau bằng dấu cách (hoặc nhập '0 0 0' để thoát)------------ \n");
        System.out.println("Lưu ý bạn chỉ có 3 cơ hội để nhập lại.Nếu sai bạn sẽ DIE");
        Game suDoKu = new Game(broad);
        GameView view= new GameView();
        ControllGame s= new ControllGame(suDoKu,view);
        s.play();


    }
}
