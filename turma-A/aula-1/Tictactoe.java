import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    
    public static void print(ArrayList<String> arr) {
        System.out.println("- - - - - - - -");
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(" | " + arr.get(i));
            if((i + 1) % 3 == 0) {
                System.out.print(" |\n");
            }
        }
        System.out.println("- - - - - - - -");
    }

    public static boolean victoryX(ArrayList<String> arr, int id1, int id2, int id3) {
        return arr.get(id1).equals("X") && arr.get(id2).equals("X") && arr.get(id3).equals("X");
    }

    public static boolean victoryO(ArrayList<String> arr, int id1, int id2, int id3) {
        return arr.get(id1).equals("O") && arr.get(id2).equals("O") && arr.get(id3).equals("O");
    }
    
    public static void main(String[] args) {
        // creating an array for the board and the scanner
        ArrayList<String> board = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int i;

        // initializing the board
        for(i = 0; i < 9; i++) {
            board.add(".");
        }

        // players
        String player1, player2, player1Symb, player2Symb;
        System.out.print("Entre com o nome do jogador 1: ");
        player1 = sc.nextLine();
        System.out.print("Entre com o nome do jogador 2: ");
        player2 = sc.nextLine();
        System.out.print("Entre com o símbolo do jogador 1 (X ou O): ");
        player1Symb = sc.nextLine();
        player2Symb = (player1Symb.equals("X")) ? "O" : "X";

        // the game
        System.out.println("\nO jogo vai começar!");
        System.out.println("Jogador 1: "+player1+" - "+player1Symb);
        System.out.println("Jogador 2: "+player2+" - "+player2Symb);
        System.out.println("\nO jogador 1 vai começar");

        boolean gameover = false;
        int playerMove = 1;
        int numMoves = 0;
        int move;
        while(!gameover) {
            int aux = 0;
            while(aux == 0) {
                print(board);
                System.out.println("Vez do " + ((playerMove == 1) ? player1 : player2) + " (" + ((playerMove == 1) ? player1Symb : player2Symb)  + ")");
                System.out.print("Entre com a sua jogada (1-9): ");
                move = sc.nextInt();

                if(board.get(move-1) == ".") {
                    if(playerMove == 1) {
                        board.set(move-1, player1Symb);
                    } else if(playerMove == 2) {
                        board.set(move-1, player2Symb);
                    }
                    playerMove = (playerMove == 1) ? 2 : 1;
                    numMoves++;
                    aux++;
                } else {
                    System.out.println("Erro, tente novamente");
                }
            }

            if(victoryX(board, 0, 1, 2) || 
            victoryX(board, 3, 4, 5) || 
            victoryX(board, 6, 7, 8) || 
            victoryX(board, 0, 3, 6) || 
            victoryX(board, 1, 4, 7) || 
            victoryX(board, 2, 5, 8) || 
            victoryX(board, 0, 4, 8) || 
            victoryX(board, 2, 4, 6)) {
                print(board);
                System.out.println("O jogador " + ((playerMove == 2) ? player1 : player2) + " ganhou!");
                gameover = true;
            }

            if(victoryO(board, 0, 1, 2) || 
            victoryO(board, 3, 4, 5) || 
            victoryO(board, 6, 7, 8) || 
            victoryO(board, 0, 3, 6) || 
            victoryO(board, 1, 4, 7) || 
            victoryO(board, 2, 5, 8) || 
            victoryO(board, 0, 4, 8) || 
            victoryO(board, 2, 4, 6)) {
                print(board);
                System.out.println("O jogador " + ((playerMove == 2) ? player1 : player2) + " ganhou!");
                gameover = true;
            }
            
            if(numMoves == 9) {
                print(board);
                System.out.println("Deu velha...");
                gameover = true;
            }
        }
    }
}