import java.util.ArrayList; // import the ArrayList class

public class Maze {
    //  board size
    public int boardXSize;
    public int boardYSize;

    // constructor
    public Maze(int boardXSize, int boardYSize) {
        this.boardXSize = boardXSize;
        this.boardYSize = boardYSize;
    }


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
}


/*
* setBoard(arr, boardSize, x, y, el) method:
* ex: setBoard(board, boardYSize, 3, 3, 999);
*/