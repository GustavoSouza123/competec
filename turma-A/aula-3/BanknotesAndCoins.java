import java.util.Scanner;

public class BanknotesAndCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();
        double C = 0;
        int aux;
        sc.close();

        System.out.println("NOTAS:");
        aux = (int) N/100;
        System.out.println(aux + " nota(s) de R$ 100.00");
        N = N % 100;
        aux = (int) N/50;
        System.out.println(aux + " nota(s) de R$ 50.00");
        N = N % 50;
        aux = (int) N/20;
        System.out.println(aux + " nota(s) de R$ 20.00");
        N = N % 20;
        aux = (int) N/10;
        System.out.println(aux + " nota(s) de R$ 10.00");
        N = N % 10;
        aux = (int) N/5;
        System.out.println(aux + " nota(s) de R$ 5.00");
        N = N % 5;
        aux = (int) N/2;
        System.out.println(aux + " nota(s) de R$ 2.00");
        N = N % 2;
        C = N * 100;
        C = Math.round(C);
        N = 0;

        System.out.println("MOEDAS:");
        aux = (int) C/100;
        System.out.println(aux + " moeda(s) de R$ 1.00");
        C = C % 100;
        aux = (int) C/50;
        System.out.println(aux + " moeda(s) de R$ 0.50");
        C = C % 50;
        aux = (int) C/25;
        System.out.println(aux + " moeda(s) de R$ 0.25");
        C = C % 25;
        aux = (int) C/10;
        System.out.println(aux + " moeda(s) de R$ 0.10");
        C = C % 10;
        aux = (int) C/5;
        System.out.println(aux + " moeda(s) de R$ 0.05");
        C = C % 5;
        aux = (int) C/1;
        System.out.println(aux + " moeda(s) de R$ 0.01");
        C = C % 1;
    }
}