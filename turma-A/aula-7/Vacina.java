import java.util.Scanner;

public class Vacina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] genes = new int[N];
        int i;
        for(i = 0; i < N; i++) {
            genes[i] = sc.nextInt();
        }

        int R = sc.nextInt();
        int rep = 0;
        for(i = 0; i < genes.length; i++) {
            if(genes[i] == R) rep++;
        }

        if(rep == 0) {
            System.out.println("Sumiu!");
        } else if(rep == 1) {
            System.out.println("Ainda não é o suficiente");
        } else {
            System.out.println("Achei o danado!");
        }
    }
}