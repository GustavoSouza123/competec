import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        int N = sc.nextInt();
        int[] arr = new int[N];
        for(i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("vetor desordenado: ");
        for(int n : arr) System.out.print(n + " ");
        System.out.println();

        int aux = 0;
        for(i = 0; i < arr.length; i++) {
            for(j = 0; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux;
                }
            }
        }

        System.out.print("vetor ordenado: ");
        for(int n : arr) System.out.print(n + " ");
        System.out.println();

        System.out.println("menor valor do vetor: " + arr[0]);
        System.out.println("maior valor do vetor: " + arr[arr.length-1]);
    }
}