import java.util.Scanner;

public class FastPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of test cases
        int N = 0;
        do N = sc.nextInt(); while(N < 1 || N > 200);

        // processing and output
        int X;
        while(N > 0) {
            do X = sc.nextInt(); while(X <= 1);
            
            String prime = "Prime";
            for(int i = X-1; i >= 2; i--) {
                if(X % i == 0) prime = "Not Prime";
            }

            System.out.println(prime);
            N--;
        }

        sc.close();
    }
}