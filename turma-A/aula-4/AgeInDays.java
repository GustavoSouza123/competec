import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        while(N > 0) {
            System.out.println(N / 365);
            N = N % 365;
            System.out.println(N / 30);
            N = N % 30;
            System.out.println(N);
            N = 0;
        }
    }
}