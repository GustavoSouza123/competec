import java.util.Scanner;

public class Areas {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double A, B, C;
        double pi = 3.14159;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();
        System.out.printf("TRIANGULO: %.3f", (A*C)/2);
        System.out.printf("\nCIRCULO: %.3f", pi*C*C);
        System.out.printf("\nTRAPEZIO: %.3f", ((A+B)*C)/2);
        System.out.printf("\nQUADRADO: %.3f", B*B);
        System.out.printf("\nRETANGULO: %.3f", A*B);
        System.out.println();
    }
}