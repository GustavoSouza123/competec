import java.util.ArrayList;
import java.util.Scanner;

public class Tictactoe {
    
    public static void imprimir(ArrayList<String> arr) {
        System.out.println("- - - - - - - -");
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(" | " + arr.get(i));
            if((i + 1) % 3 == 0) {
                System.out.print(" |\n");
            }
        }
        System.out.println("- - - - - - - -\n");
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

        imprimir(board);

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
        System.out.println("O jogador 1 " + player1 + " é o " + player1Symb);
        System.out.println("O jogador 2 " + player2 + " é o " + player2Symb);
        System.out.println("O jogador 1 vai começar\n");

        int victory = 0;
        int playerMove = 1;
        int move;
        while(victory == 0) {
            int aux = 0;
            while(aux == 0) {
                System.out.println("Vez do " + ((playerMove == 1) ? player1 : player2) + " (" + ((playerMove == 1) ? player1Symb : player2Symb)  + ")");
                System.out.print("Entre com a sua jogada (1-9): ");
                move = sc.nextInt();

                if(board.get(move-1) == ".") {
                    if(playerMove == 1) {
                        board.set(move-1, player1Symb);
                    } else if(playerMove == 2) {
                        board.set(move-1, player2Symb);
                    }
                    imprimir(board);
                    aux++;
                    playerMove = (playerMove == 1) ? 2 : 1;
                } else {
                    System.out.println("Erro, tente novamente");
                }
            }

            if(board.get(0) == "X" && board.get(1) == "X" && board.get(2) == "X" || 
            board.get(3) == "X" && board.get(4) == "X" && board.get(5) == "X" || 
            board.get(6) == "X" && board.get(7) == "X" && board.get(8) == "X" || 
            board.get(0) == "X" && board.get(3) == "X" && board.get(6) == "X" || 
            board.get(1) == "X" && board.get(4) == "X" && board.get(7) == "X" || 
            board.get(2) == "X" && board.get(5) == "X" && board.get(8) == "X" || 
            board.get(0) == "X" && board.get(4) == "X" && board.get(8) == "X" || 
            board.get(2) == "X" && board.get(4) == "X" && board.get(6) == "X") {
                System.out.println("O jogador " + ((player1Symb == "X") ? player1 : player2) + " ganhou");
                victory++;
            }
            // PAREI AQUI, FALTA FAZER VERIFICAÇÃO DE VITÓRIA PARA O JOGADOR (O)
        }

        sc.close();
    }
}