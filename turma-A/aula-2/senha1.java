import java.util.Scanner;

public class senha1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criando uma senha
        String senha;
        System.out.print("\nCrie uma senha: ");
        senha = sc.nextLine();

        // verificação
        String input;
        boolean acessoPermitido = false;
        System.out.println();

        while(!acessoPermitido) {
            System.out.print("Entre com a senha: ");
            input = sc.nextLine();
            if(input.equals(senha)) {
                System.out.println("Acesso permitido!");
                acessoPermitido = true;
            } else {
                System.out.println("Senha inválida\n");
            }
        }

        sc.close();
    }
}