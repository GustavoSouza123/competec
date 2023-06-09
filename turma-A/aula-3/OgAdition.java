import java.util.Scanner;

public class OgAdition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = -1;
        int R = -1;
        while(sc.hasNext()) {
            if(sc.hasNextInt()) {
                if(L == -1) L = sc.nextInt();
                else R = sc.nextInt();
            }
            else {
                sc.next();
            }
            if(L > -1 && R > -1) {
                if(L == 0 && R == 0) break;
                else {
                    System.out.println(L + R);
                    L = -1;
                    R = -1;
                }
            }
        }

        sc.close();
    }
}