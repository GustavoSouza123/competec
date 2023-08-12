import java.util.Scanner;

public class RLJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String[] exp;
        int res = 0;
        while(str != "0+0=0") {
            exp = str.split("");
            if(exp[0].equals("R")) {
                res = Integer.parseInt(exp[4]) - Integer.parseInt(exp[2]);
            } else if(exp[2].equals("L")) {
                res = Integer.parseInt(exp[4]) - Integer.parseInt(exp[0]);
            } else if(exp[4].equals("J")) {
                res = Integer.parseInt(exp[0]) + Integer.parseInt(exp[2]);
            }
            System.out.println(res);
            if(sc.hasNext()) {
                str = sc.nextLine();
            }
        }

        sc.close();
    }
}