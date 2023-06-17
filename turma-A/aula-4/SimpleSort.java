import java.util.Scanner;

public class SimpleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();
        int aux;
        int rA = A;
        int rB = B;
        int rC = C;

        if(A > B) {
            aux = A;
            A = B;
            B = aux;
        }

        if(B > C) {
            aux = B;
            B = C;
            C = aux;
        }

        if(A > B) {
            aux = A;
            A = B;
            B = aux;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println();
        System.out.println(rA);
        System.out.println(rB);
        System.out.println(rC);
    }
}