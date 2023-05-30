package exercicio_02;

public class Onibus extends Veiculo {
	// sobrescreve os métodos ligar() e desligar() da classe Veiculo
	public void ligar() {
		super.ligar();
		System.out.println("--- Busao ligado");
		System.out.println("[desenrolando com o cobrador] Posso descer pela frente? Bilhete ta passano nao");
		System.out.println("[cobrador] ...");
		System.out.println("[... dois minutos depois] VAI DESSE MOTO");
	}
	
	public void desligar() {
		super.desligar();
		System.out.println("--- Busao desligado");
		System.out.println("busao quebro denovo, naguento mais");
		System.out.println("[duas horas depois - chegando no trampo atrasado]");
		System.out.println("[dois minutos depois] VO TE QUE PROCURA EMPREGO DNV, AAAAAAAAAAAAAAA");
	}
}