import java.util.Scanner;

public class Metodos {
    public static void ola() {
        System.out.println("olá mundo!");
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static void tabuada(int n) {
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        ola();

        int soma = somar(1, 1);
        System.out.println("a soma é: " + soma);

        Scanner sc = new Scanner(System.in);
        System.out.print("entre com um número para calcular sua tabuada: ");
        int num = sc.nextInt();
        System.out.println("a tabuada do " + num + " é:");
        tabuada(num);
        sc.close();
    }
}