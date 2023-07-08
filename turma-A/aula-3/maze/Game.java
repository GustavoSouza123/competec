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
            maze1.addValues(x);
        }

        // modify board
        // generate starting and final points
        int startingPoint = (int)(Math.random() * maze1.getBoardXSize());
        int finalPoint = (int)(Math.random() * maze1.getBoardXSize());
        maze1.setBoard(startingPoint+1, maze1.getBoardYSize(), "S");
        maze1.setBoard(finalPoint+1, 1, "F");

        // generate obstacles
        int numObstacles = 10;
        i = 0;
        while(i < numObstacles) {
            int randomObstacleX = (int)(Math.random() * maze1.getBoardXSize()) + 1;
            int randomObstacleY = (int)(Math.random() * maze1.getBoardYSize()-2) + 2;

            if(maze1.getBoard(randomObstacleX, randomObstacleY).equals("-")) {
                maze1.setBoard(randomObstacleX, randomObstacleY, "O");
                i++;
            }
        }

        // print board
        maze1.printBoard();

        // close scanner
        sc.close();
    }
}

// int randomNum = (int)(Math.random() * 101);  // 0 to 100