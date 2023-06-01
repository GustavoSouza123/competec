import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class Game {
    // main method
    public static void main(String[] args) {
        // scanner and variables
        Scanner sc = new Scanner(System.in);
        int i;


        // entering the board size
        int inputBoardXSize, inputBoardYSize;
        System.out.print("Entre com o tamanho do tabuleiro (x): ");
        inputBoardXSize = sc.nextInt();
        System.out.print("Entre com o tamanho do tabuleiro (y): ");
        inputBoardYSize = sc.nextInt();
        
        // maze object
        Maze maze1 = new Maze(inputBoardXSize, inputBoardYSize);
        
        // create ArrayLists for x an add values on them
        for(i = 0; i < maze1.getBoardYSize(); i++) {
            ArrayList<String> x = new ArrayList<String>();
            maze1.addValues(maze1.board, x);
        }

        // modify board
        maze1.setBoard(maze1.board, 4, 7, "9");

        // print board
        maze1.printBoard();

        
        sc.close(); // close scanner
    }
}