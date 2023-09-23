import java.util.Scanner;

public class ArrayChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        int[] N = new int[20];
        for(i = 0; i < N.length; i++) {
            N[i] = sc.nextInt();
        }
        
        int aux;
        int last = N.length-1;
        for(i = 0; i < N.length; i++) {
            if(i < N.length/2) {
                aux = N[i];
                N[i] = N[last];
                N[last] = aux;
                last--;
            }
            System.out.println("N["+i+"] = " + N[i]);
        }
    }
}