import java.util.ArrayList; // import the ArrayList class

public class Maze {
    // board size attributes
    private int boardXSize;
    private int boardYSize;

    // ArrayList for the board (y)
    ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>(boardYSize);

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
    
    // method for creating ArrayLists x and adding values to them
    public void addValues(ArrayList<ArrayList<String>> arr, ArrayList<String> x) {
        arr.add(x);
        for(int cont = 0; cont < boardXSize; cont++) {
            x.add("-");
        }
    }

    // method for adding a value to a coordinate in the board
    public void setBoard(ArrayList<ArrayList<String>> arr, int x, int y, String el) {
        arr.get(boardYSize-y).set(x-1, el);
    }

    // method for printing the board
    public void printBoard() {
        int i, j;
        for(i = 0; i < boardYSize; i++) {
            System.out.print(boardYSize-i + "    ");
            for(j = 0; j < boardXSize; j++) {
                if(j < boardXSize-1) System.out.print(board.get(i).get(j) + "  ");
                else System.out.print(board.get(i).get(j) + "\n");
            }
        }
        System.out.println();
        System.out.print("     ");
        for(i = 1; i <= boardXSize; i++) {
            if(i < boardXSize) System.out.print(i + "  ");
            else System.out.println(i);
        }
    }
}

/*
METHODS:
- addValues(board, x1);
- setBoard(arr, boardSize, x, y, el;
  ex: setBoard(board, boardYSize, 3, 3, 999);
*/