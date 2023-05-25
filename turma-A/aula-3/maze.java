import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class maze {
    
    // modify board
    public static void setBoard(ArrayList<ArrayList<Integer>> arr, int boardYSize, int x, int y, int el) {
        arr.get(boardYSize-y).set(x-1, el);
    }
    /*
     * setBoard(arr, boardSize, x, y, el) method:
     * ex: setBoard(board, boardYSize, 3, 3, 999);
     */

    // add values to ArrayLists x
    public static void addValues(ArrayList<Integer> x, int numValues) {
        for(int cont = 0; cont < numValues; cont++) {
            x.add(cont+1);
        }
    }

    // main method
    public static void main(String[] args) {
        // scanner and variables
        // Scanner sc = new Scanner(System.in);
        int i;

        //  board size
        int boardXSize = 5;
        int boardYSize = 5;

        // ArrayList for the board (y)
        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(boardYSize);

        // ArrayLists for x
        ArrayList<Integer> x1 = new ArrayList<Integer>();
        ArrayList<Integer> x2 = new ArrayList<Integer>();
        ArrayList<Integer> x3 = new ArrayList<Integer>();
        ArrayList<Integer> x4 = new ArrayList<Integer>();
        ArrayList<Integer> x5 = new ArrayList<Integer>();

        // add values for x
        board.add(x1);
        addValues(x1, boardXSize);
        board.add(x2);
        addValues(x2, boardXSize);
        board.add(x3);
        addValues(x3, boardXSize);
        board.add(x4);
        addValues(x4, boardXSize);
        board.add(x5);
        addValues(x5, boardXSize);

        // print ArrayList coords
        setBoard(board, boardYSize, 5, 4, 999);
        for(i = 0; i < boardXSize; i++) {
            System.out.println(boardXSize-i + ": " + board.get(i));
        }
    }
}