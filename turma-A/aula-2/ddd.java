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
        
        int input;
        
        System.out.print("Entre com o DDD: ");
        input = sc.nextInt();

        /*switch(ddd) {
            case 11:
                msg = "São Paulo";
                break;
            case 21:
                msg = "Rio de Janeiro";
                break;
            case 31:
                msg = "Minas Gerais";
                break;
            case 71:
                msg = "";
                break;
            case 27:
                msg = "";
                break;

            default:
                msg = "Erro";
        }*/
    }
}