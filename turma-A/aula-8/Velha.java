import java.util.Scanner;

public class Velha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] tab = new int[3][3];
        String winner = "";
        int i, j;

        while(sc.hasNextInt()) {
            for(i = 0; i < 3; i++) {
                for(j = 0; j < 3; j++) {
                    tab[i][j] = sc.nextInt();
                }
            }

            if(tab[0][0] == tab[0][1] && tab[0][0] == tab[0][2]) winner = (tab[0][0] == 0) ? "O" : "X";
            if(tab[1][0] == tab[1][1] && tab[1][0] == tab[1][2]) winner = (tab[1][0] == 0) ? "O" : "X";
            if(tab[2][0] == tab[2][1] && tab[2][0] == tab[2][2]) winner = (tab[2][0] == 0) ? "O" : "X";

            if(tab[0][0] == tab[1][0] && tab[0][0] == tab[2][0]) winner = (tab[0][0] == 0) ? "O" : "X";
            if(tab[0][1] == tab[1][1] && tab[0][1] == tab[2][1]) winner = (tab[0][1] == 0) ? "O" : "X";
            if(tab[0][2] == tab[1][2] && tab[0][2] == tab[2][2]) winner = (tab[0][2] == 0) ? "O" : "X";
            
            if(tab[0][0] == tab[1][1] && tab[0][0] == tab[2][2]) winner = (tab[0][0] == 0) ? "O" : "X";
            if(tab[0][2] == tab[1][1] && tab[0][2] == tab[2][0]) winner = (tab[0][2] == 0) ? "O" : "X";

            System.out.println((winner != "") ? winner : "velha de velhas");
            winner = "";
        }

        sc.close();
    }
}