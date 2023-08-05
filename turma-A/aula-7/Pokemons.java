import java.util.Scanner;

public class Pokemons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i, j;
        String aux;
        while(n != 0) {
            // ler pokemons
            String[] pk = new String[n];
            for(i = 0; i < n; i++) {
                pk[i] = sc.next();
            }
            
            // ordenar pokemons
            for(i = 0; i < pk.length; i++) {
                for(j = i+1; j < pk.length; j++) {
                    if(pk[i].compareToIgnoreCase(pk[j]) > 0) {
                        aux = pk[i];
                        pk[i] = pk[j];
                        pk[j] = aux;
                    }
                }
            }

            // imprimir pokemons
            System.out.print("[");
            for(i = 0; i < pk.length; i++) {
                System.out.print(pk[i]);
                if(i != pk.length-1) System.out.print(" ");
            }
            System.out.println("]");

            n = sc.nextInt();
        }

        sc.close();
    }
}

// str1.compareToIgnoreCase(str2): compara duas strings ignorando letras maiúsculas e minúsculas
// > 0: str1 > str2
// < 0: str1 < str2
// = 0: str1 == str2