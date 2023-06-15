import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x, y;
        double R, B, C;
        int i = 0;
        while(i < N) {
            x = sc.nextInt();
            y = sc.nextInt();
            R = Math.pow(3*x, 2) + Math.pow(y, 2);
            B = 2 * Math.pow(x, 2) + Math.pow(5*y, 2);
            C = -100*x + Math.pow(y, 3);
            if(R > B && R > C) System.out.println("Rafael ganhou");
            else if(B > R && B > C) System.out.println("Beto ganhou");
            else if(C > R && C > B) System.out.println("Carlos ganhou");
            i++;
        }

        sc.close();
    }
}