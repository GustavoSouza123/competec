// import java.util.Scanner; // import the Scanner class
import java.util.ArrayList; // import the ArrayList class

public class Game {
    // main method
    public static void main(String[] args) {
        // scanner and variables
        // Scanner sc = new Scanner(System.in);
        int i;
        
        // maze object
        Maze maze1 = new Maze(5, 5);
        
        // ArrayLists for x
        // for(i = 0; i < maze1.getBoardXSize(); i++) {
        //     ArrayList<Integer> x`i` new ArrayList<Integer>();
        // }

        // ArrayList<Integer> x1 = new ArrayList<Integer>();
        // ArrayList<Integer> x2 = new ArrayList<Integer>();
        // ArrayList<Integer> x3 = new ArrayList<Integer>();
        // ArrayList<Integer> x4 = new ArrayList<Integer>();
        // ArrayList<Integer> x5 = new ArrayList<Integer>();

        // add values for x
        for(i = 0; i < maze1.getBoardXSize(); i++) {
            ArrayList<Integer> x = new ArrayList<Integer>();
            maze1.addValues(maze1.board, x);
        }

        // maze1.addValues(maze1.board, x1);
        // maze1.addValues(maze1.board, x2);
        // maze1.addValues(maze1.board, x3);
        // maze1.addValues(maze1.board, x4);
        // maze1.addValues(maze1.board, x5);

        // print ArrayList coords
        maze1.setBoard(maze1.board, 5, 4, 999);
        for(i = 0; i < maze1.getBoardXSize(); i++) {
            System.out.println(maze1.getBoardXSize()-i + ": " + maze1.board.get(i));
        }


        // sc.close(); // close scanner
    }
}