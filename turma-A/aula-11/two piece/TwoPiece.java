import java.util.Scanner;

public class TwoPiece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de frutas que deseja converter: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("Entre com o nome da moeda para a qual deseja converter as frutas: ");
        String moeda = sc.nextLine();

        Frutas frutas = new Frutas(n);
        double conversao = frutas.converterFrutas(moeda);
        System.out.println(frutas.getNumFrutas() + " frutas = " + ((conversao == 0) ? "erro" : conversao));

        sc.close();
    }
}