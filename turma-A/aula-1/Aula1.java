import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        Double abacaxi = 7.30;
        Double maca = 2.00;
        Double pera = 3.00;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite quantos abacaxis você deseja: ");
        abacaxi *= sc.nextInt();
        System.out.print("Digite quantas maçãs você deseja: ");
        maca *= sc.nextInt();
        System.out.print("Digite quantas peras você deseja: ");
        pera *= sc.nextInt();

        Double resultado = abacaxi + maca + pera;
        System.out.println("O valor da compra foi de R$ " + resultado);
    }
}