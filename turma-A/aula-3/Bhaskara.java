import java.util.Scanner;

public class Bhaskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A, B, C, delta, r1, r2;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        sc.close();
        delta = B*B - 4*A*C;
        if(A <= 0 || delta <= 0) {
            System.out.println("Impossivel calcular");
        } else {
            r1 = (-B + Math.sqrt(delta)) / (2*A);
            r2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.printf("R1 = %.5f", r1);
            System.out.printf("\nR2 = %.5f", r2);
            System.out.println();
        }
    }
}