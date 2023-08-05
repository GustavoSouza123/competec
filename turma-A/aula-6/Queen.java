import java.util.Scanner;

public class Queen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1, y1, x2, y2, moves;
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        moves = 0;
        while(!(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)) {
            if(x1 == x2 && y1 == y2) {
            moves = 0;
            } else if(x1 == x2 || y1 == y2) {
                moves = 1;
            } else if((x2-x1) == (y2-y1) || -(x2-x1) == -(y2-y1) || -(x2-x1) == (y2-y1) || (x2-x1) == -(y2-y1)) {
                moves = 1;
            } else {
                moves = 2;
            }
            System.out.println(moves);
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
        }

        sc.close();
    }
}