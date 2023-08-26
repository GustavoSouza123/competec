import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str, res;
        int shift;
        while(N > 0) {
            str = sc.nextLine();
            shift = Integer.parseInt(sc.nextLine());
            res = "";
            for(int i = 0; i < str.length(); i++) {
                int index = letters.indexOf(str.charAt(i))-2;
                System.out.println("index #1: " + index);
                if(index < 0) index = letters.length()+index;
                System.out.println("index #2: " + index);
                res += letters.charAt(index);
            }
            System.out.println(res);

            N--;
        }
    }   
}