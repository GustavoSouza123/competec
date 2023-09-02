import java.util.Scanner;

public class FactorialSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, N, Mf, Nf, i;
        do M = sc.nextInt(); while(M < 0 || M > 20);
        do N = sc.nextInt(); while(N < 0 || N > 20);
        while(M >= 0 && N >= 0) {
            Mf = (M == 0) ? 1 : M;
            Nf = (N == 0) ? 1 : N;
            for(i = M-1; i > 1; i--) Mf *= i;
            for(i = N-1; i > 1; i--) Nf *= i;
            System.out.println(Mf + Nf);
            if(sc.hasNextInt()) {
                do M = sc.nextInt(); while(M < 0 || M > 20);
                do N = sc.nextInt(); while(N < 0 || N > 20);
            }
        }
    }   
}