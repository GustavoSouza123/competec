import java.util.Scanner;

public class GameTime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int D = 0;

        if(S < E) D = E - S;
        else if(S == E) D = 24;
        else if(S > E) D = (24 - S) + E;

        System.out.println("O JOGO DUROU " + D + " HORA(S)");

        sc.close();
    }
}