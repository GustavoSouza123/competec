import java.util.Scanner;

public class Leds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String V;
        char[] arr;
        while(N > 0) {
            V = sc.nextLine();
            arr = V.toCharArray();
            for(int i = 0; i < arr.length; i++) System.out.println(arr[i] + ", ");
        }
    }
}