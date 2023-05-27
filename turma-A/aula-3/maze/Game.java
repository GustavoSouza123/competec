import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class Game {
    // main method
    public static void main(String[] args) {
        // scanner and variables
        // Scanner sc = new Scanner(System.in);
        int i;

        // ArrayList for the board (y)
        static ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(boardYSize);

        // ArrayLists for x
        ArrayList<Integer> x1 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x4 = new ArrayList<Integer>();
        ArrayList<Integer> x5 = new ArrayList<Integer>();

        // add values for x
        addValues(board, x1);
        addValues(board, x2);
        addValues(board, x3);
        addValues(board, x4);
        addValues(board, x5);

        // print ArrayList coords
        // setBoard(board, 5, 4, 999);
        for(i = 0; i < boardXSize; i++) {
            System.out.println(boardXSize-i + ": " + board.get(i));
        }
    }
}