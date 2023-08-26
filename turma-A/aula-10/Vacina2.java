import java.util.Scanner;

public class Vacina2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String gene;
        char letra;
        int quant = 0;
        while(N > 0) {
            gene = sc.next();
            letra = sc.next().charAt(0);
            for(int i = 0; i < gene.length(); i++) {
                if(gene.charAt(i) == letra) quant++;
            }
            System.out.println(quant);

            quant = 0;
            N--;
        }
    }
}