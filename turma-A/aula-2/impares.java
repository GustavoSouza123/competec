import java.util.Scanner;

public class impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Entre com um número inteiro para imprimir todos os números ímpares até ele: ");
        num = sc.nextInt();

        for(int i = 1; i <= num; i++) {
            if(i % 2 == 1) System.out.println(i);
        }

        sc.close();
    }
}