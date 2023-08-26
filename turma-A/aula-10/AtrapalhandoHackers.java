import java.util.Scanner;

public class AtrapalhandoHackers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.charAt(0) == str.charAt(str.length()-1)) {
            System.out.println(str + "*PERIGO*");
        } else {
            System.out.println(str.charAt(str.length()-1) + str.substring(1, str.length()-1) + str.charAt(0));
        }
    }
}

/*
    rascunho:

    declarar scanner
    declarar variavel "str"
    ler string digitada pelo usuario na variavel "str"
    declarar variavel "first"
    guardar primeiro caractere da variavel "str" na variavel "first"
    substituir o primeiro caractere da variavel "str" pelo ultimo caractere da variavel "str"
    substituir o ultimo caractere da variavel "str" pela variavel "first"
    imprimir variavel "str"
*/