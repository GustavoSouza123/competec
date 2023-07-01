import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.print("tamanho do vetor: ");
        int N = sc.nextInt(); // tamanho do vetor
        int[] arr = new int[N];
        System.out.print("valores do vetor: ");
        for(i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); // adicionar valores ao vetor
        }

        System.out.print("vetor: ");
        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i]); // imprimir os valores do vetor
            if(i != arr.length-1) System.out.print(", ");
        }

        System.out.println();

        int mult = 1;
        for(i = 0; i < arr.length; i++) {
            mult *= arr[i]; // multiplicar os valores do vetor
        }
        System.out.println("multiplicação de todos os valores do vetor: " + mult);

        double media = 0;
        for(i = 0; i < arr.length; i++) {
            media += arr[i]; // somando todos os valores do vetor
        }
        media /= arr.length; // dividindo a soma de todos os valores do vetor pelo tamanho do vetor (para calcular a média de todos os seus valores)
        System.out.println("média de todos os valores do vetor: " + media);
    }
}