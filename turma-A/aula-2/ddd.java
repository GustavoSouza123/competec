import java.util.Scanner;

public class ddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criando os arrays para DDDs, estados e mensagens
        int[] ddd = {11,21,27,31,41,48,51,61,71,65,91,92,68,86,88};
        String[] states = {"SP","RJ","ES","MG","PR","SC","RS","DF","BA","MT","PA","AM","AC","PI","CE"};
        String[] messages = {
            "Maaaano, perdeu..passa tudo",
            "Jaé mermão...[barulhos de bala perdida no fundo]",
            "Pocar",
            "Uai sô...comendo meu pão de queijo",
            "Esse piá tá metendo um caô",
            "Fala, manezinho!",
            "Baaaah tchê..comendo meu cacetinho aqui",
            "Êêêêêêêêêêêêêê véi",
            "Óxênte",
            "Quá! Ele tá mei jururú hoje",
            "Ééééééééégua",
            "Olha lá, um índio",
            "Erro, estado inexistente",
            "Dica: Whindersson",
            "Quem tá nesse estado não é bom, é arretado"
        };
        
        // ínicio do programa
        System.out.println("\nEntre com um DDD de um estado do Brasil");
        System.out.println("Se o DDD digitado for válido, vai aparecer uma mensagem com gírias/estereótipos do estado correspondente ao DDD");
        System.out.println("Sua tarefa é adivinhar o estado!");
        System.out.println("Dica: digite apenas a sigla do estado\n");

        // lendo o DDD
        int input;
        System.out.print("Entre com o DDD: ");
        input = sc.nextInt();

        int index = -1;
        for(int i = 0; i < ddd.length; i++) {
            if(input == ddd[i]) {
                index = i;
            }
        }

        System.out.println(messages[index]);

        sc.close();
    }
}