public class Exercises {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // java args array
        // System.out.println("Olá!, " + args[0]);

        // switch case
        int numero_mes = 1;
        switch(numero_mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
            default:
                System.out.println("Default");
                break;
        }

        // printing a square
        int lado = 7;
        int cont1 = 0;
        int cont2;

        while(cont1 < lado) {
            cont2 = 0;
            while(cont2 < lado) {
                System.out.print("* ");
                cont2++;
            }
            System.out.println();
            cont1++;
        }

        System.out.println();

        // printing a rectangle
        int lado1 = 7;
        int lado2 = 3;
        cont1 = 0;

        while(cont1 < lado2) {
            cont2 = 0;
            while(cont2 < lado1) {
                System.out.print("* ");
                cont2++;
            }
            System.out.println();
            cont1++;
        }

        System.out.println();
    }
}