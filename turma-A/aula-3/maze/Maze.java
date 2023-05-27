import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class Maze {
    //  board size
    public static int boardXSize = 5;
    public static int boardYSize = 5;

    // ArrayList for the board (y)
    static ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(boardYSize);
    
    
    // add a value to a coordinate in the board
    public static void setBoard(ArrayList<ArrayList<Integer>> arr, int x, int y, int el) {
        arr.get(boardYSize-y).set(x-1, el);
    }
    
    // create ArrayLists x and add values to them
    public static void addValues(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> x) {
        arr.add(x);
        for(int cont = 0; cont < boardXSize; cont++) {
            x.add(0);
        }
    }

    // main method
    public static void main(String[] args) {
        // scanner and variables
        // Scanner sc = new Scanner(System.in);
        int i;

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


/*
* setBoard(arr, boardSize, x, y, el) method:
* ex: setBoard(board, boardYSize, 3, 3, 999);
*/