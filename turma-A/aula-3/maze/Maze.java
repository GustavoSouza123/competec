import java.util.ArrayList; // import the ArrayList class

public class Maze {
    //  board size
    private int boardXSize;
    private int boardYSize;

    // ArrayList for the board (y)
    ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>(boardYSize);

    // constructor
    public Maze(int boardXSize, int boardYSize) {
        this.boardXSize = boardXSize;
        this.boardYSize = boardYSize;
    }

    // getters for the board size
    public int getBoardXSize() {
        return boardXSize;
    }
    public int getBoardYSize() {
        return boardYSize;
    }

    // setters for the board size
    public void setBoardXSize(int boardXSize) {
        this.boardXSize = boardXSize;
    }
    public void setBoardYSize(int boardYSize) {
        this.boardYSize = boardYSize;
    }

    // add a value to a coordinate in the board
    public void setBoard(ArrayList<ArrayList<Integer>> arr, int x, int y, int el) {
        arr.get(boardYSize-y).set(x-1, el);
    }
    
    // create ArrayLists x and add values to them
    public void addValues(ArrayList<ArrayList<Integer>> arr, ArrayList<Integer> x) {
        arr.add(x);
        for(int cont = 0; cont < boardXSize; cont++) {
            x.add(0);
        }
    }
}

/*
METHODS:
- setBoard(arr, boardSize, x, y, el) method:
  ex: setBoard(board, boardYSize, 3, 3, 999);
- addValues(board, x1);
*/