import java.util.Scanner;

public class ZeroOrOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = -1;
        int B = -1;
        int C = -1;
        String w = "";
        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                if(A == -1) A = sc.nextInt();
                else if(B == -1) B = sc.nextInt();
                else C = sc.nextInt();
            } else {
                sc.next();
            }

            if(A > -1 && B > -1 && C > -1) {
                if(A == B && A == C) w = "*";
                else if(A != B && A != C) w = "A";
                else if(B != A && B != C) w = "B";
                else if(C != A && C != B) w = "C";

                System.out.println(w);
                A = -1;
                B = -1;
                C = -1;
            }
        }

        sc.close();
    }
}