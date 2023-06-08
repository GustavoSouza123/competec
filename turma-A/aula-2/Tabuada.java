import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Entre com um número inteiro para imprimir sua tabuada: ");
        num = sc.nextInt();

        for(int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+(num*i));
        }

        sc.close();
    }
}