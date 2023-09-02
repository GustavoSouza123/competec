import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str, res;
        int shift, index;
        while(N > 0) {
            str = sc.nextLine().toUpperCase();
            shift = Integer.parseInt(sc.nextLine());
            res = "";
            for(int i = 0; i < str.length(); i++) {
                index = letters.indexOf(str.charAt(i))-shift;
                if(index < 0) index = letters.length()+index;
                res += letters.charAt(index);
            }
            System.out.println(res);

            N--;
        }

        sc.close();
    }   
}