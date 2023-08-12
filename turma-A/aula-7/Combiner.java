import java.util.Scanner;

public class Combiner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String in, res;
        String[] strs;
        int i;

        in = "";
        res = "";
        while(N > 0) {
            in += sc.next();
            in += " ";
            in += sc.next();
            strs = in.split(" ");

            if(strs[0].length() < strs[1].length()) {
                for(i = 0; i < strs[0].length(); i++) {
                    res += strs[0].charAt(i);
                    res += strs[1].charAt(i);
                }
                for(i = strs[1].length()-(strs[1].length()-strs[0].length()); i < strs[1].length(); i++) {
                    res += strs[1].charAt(i);
                }
            } else if(strs[0].length() > strs[1].length()) {
                for(i = 0; i < strs[1].length(); i++) {
                    res += strs[0].charAt(i);
                    res += strs[1].charAt(i);
                }
                for(i = strs[0].length()-(strs[0].length()-strs[1].length()); i < strs[0].length(); i++) {
                    res += strs[0].charAt(i);
                }
            } else {
                for(i = 0; i < strs[0].length(); i++) {
                    res += strs[0].charAt(i);
                    res += strs[1].charAt(i);
                }
            }

            System.out.println(res);

            N--;
            in = "";
            res = "";
            strs[0] = null;
            strs[1] = null;
        }
    }
}