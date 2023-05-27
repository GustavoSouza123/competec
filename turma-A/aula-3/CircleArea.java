import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159;
        double R = sc.nextDouble();
        double A = pi * (R * R);
        
        sc.close();

        System.out.printf("A=%.4f", A);
        System.out.println();
    }
}