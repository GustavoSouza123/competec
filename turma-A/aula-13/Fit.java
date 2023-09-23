import java.util.Scanner;

public class Fit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String A, B, str;
        while(N > 0) {
            str = "";
            A = sc.next();
            B = sc.next();
            if(!A.contains(B)) {
                System.out.println("nao encaixa");
                N--;
                continue;
            }
            str = A.substring(A.length()-B.length());
            if(str.equals(B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
            N--;
        }
    }
}