import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] cinema = new int[5][8];
        int i, j;
        for(i = 4; i >= 0; i--) {
            for(j = 7; j >= 0; j--) {
                cinema[i][j] = sc.nextInt();
            }
        }

        int P = sc.nextInt();
        int fileira, lugar;
        while(P > 0) {
            fileira = sc.nextInt();
            lugar = sc.nextInt();

            if(cinema[fileira][lugar] == 0) {
                System.out.println("compra bem-sucedida");
            } else if(cinema[fileira][lugar] == 1) {
                System.out.println("lugar ocupado, compra cancelada");
            } else {
                System.out.println("lugar inválido, entre com o cinema novamente");
            }

            P--;
        }

        sc.close();
    }
}