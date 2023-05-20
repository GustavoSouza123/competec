import java.util.Scanner;

public class senha2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criando uma senha
        String password;
        System.out.print("Crie uma senha: ");
        password = sc.nextLine();

        // verificação
        String input;
        boolean accessAllowed;
        
        do {
            System.out.print("Entre com a senha: ");
            input = sc.nextLine();
            accessAllowed = (input.equals(password));
            if(!accessAllowed) System.out.println("Acesso negado");
        } while(!accessAllowed);

        System.out.println("Acesso permitido");
    }
}