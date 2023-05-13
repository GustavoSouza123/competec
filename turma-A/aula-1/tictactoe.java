import java.util.ArrayList;

public class tictactoe {
    public static void main(String[] args) {
        ArrayList<String> board = new ArrayList<String>();
        for(int i = 0; i < 9; i++) {
            board.add(".");
        }

        for(int i = 0; i < board.size(); i++) {
            System.out.print(board.get(i));
        }
    }
}