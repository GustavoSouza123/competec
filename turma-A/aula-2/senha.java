import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criando uma senha
        String senha;
        System.out.print("Crie uma senha: ");
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