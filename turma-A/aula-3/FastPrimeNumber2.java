import java.util.Scanner;

public class FastPrimeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X;
        while(N > 0) {
            X = sc.nextInt();
            
            int i = X-1;
            String prime = (X%i==0) ? "Not Prime" : "Prime";
            i--;

            System.out.println(prime);
            N--;
        }
    }
}