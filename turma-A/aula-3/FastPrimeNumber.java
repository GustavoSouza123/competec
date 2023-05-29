/*
CODE THAT WENT WRONG:

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
}*/

/* CODE THAT WENT RIGHT: */

import java.util.Scanner;

public class FastPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of test cases
        int N = 0;
        N = sc.nextInt();

        // processing and output
        int X, aux;
        for(int i = 0; i < N; i++) {
            X = sc.nextInt();
            aux = 0;

            if(X == 2) {
                System.out.println("Prime");
                continue;
            }
            
            for(int j = 2; j < Math.sqrt(X)+1; j++) {
                if(X % j == 0) aux++;
                if(aux == 2) break;
            }

            if(aux > 0) System.out.println("Not Prime");
            else System.out.println("Prime");
        }

        sc.close();
    }
}