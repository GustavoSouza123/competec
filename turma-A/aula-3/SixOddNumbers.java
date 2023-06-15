import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        sc.close();
        if(X % 2 == 0) X += 1;
        for(int i = X; i < X+12; i+=2) {
            if(i % 2 == 1) System.out.println(i);
        }
    }
}