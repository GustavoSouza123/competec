import java.util.Scanner;

public class ArrayFill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();

        int[] N = new int[10];
        for(int i = 0; i < N.length; i++) {
            System.out.print("N["+i+"] = " + V + "\n");
            V *= 2;
        }

        sc.close();
    }
}