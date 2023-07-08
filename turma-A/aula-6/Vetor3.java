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

        /* // ordenar vetor
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
        */

        // sem ordenar vetor
        int maior = arr[0], maiorPosicao = 0, menor = arr[0], menorPosicao = 0;
        for(i = 0; i < arr.length; i++) {
            if(arr[i] > maior) {
                maior = arr[i];
                maiorPosicao = i;
            }
            if(arr[i] < menor) {
                menor = arr[i];
                menorPosicao = i;
            }
        }

        System.out.println("menor valor do vetor: " + menor);
        System.out.println("posicao do menor valor do vetor: " + menorPosicao);
        System.out.println("maior valor do vetor: " + maior);
        System.out.println("posicao do maior valor do vetor: " + maiorPosicao);
    }
}