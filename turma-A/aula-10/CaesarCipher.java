import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str, res;
        int shift;
        while(N > 0) {
            str = sc.next();
            System.out.println("string: " +str);
            shift = sc.nextInt();
            System.out.println("shift: " +shift);
            for(int i = 0; i < str.length(); i++) {
                System.out.print(str.indexOf(str.charAt(i)) + " ");
            }
            System.out.println();

            N--;
        }
    }   
}