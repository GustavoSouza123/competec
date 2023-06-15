import java.util.Scanner;

public class WeightedAvgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double a, b, c, avg;
        int i = 0;
        while(i < N) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
            avg = (a*2) + (b*3) + (c*5);
            avg /= 10;
            System.out.printf("%.1f", avg);
            System.out.println();
            i++;
        }

        sc.close();
    }
}