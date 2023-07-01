import java.util.Scanner;

public class Leds {
    // this code is not working
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        int N = sc.nextInt();
        String V;
        int[] arrLeds = {6,2,5,5,4,5,6,3,7,6};
        int total = 0;
        while(N > 0) {
            V = sc.nextLine();
            for(i = 0; i < V.length(); i++) {
                for(j = 0; j < arrLeds.length; j++) {
                    if(V.charAt(i) == j) total += arrLeds[j];
                }
            }
            System.out.println(total + " leds");
            total = 0;
            N--;
        }
    }
}