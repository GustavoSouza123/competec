package exercicio_02;

public class Automovel extends Veiculo {
	// sobrescreve os métodos ligar() e desligar() da classe Veiculo
	public void ligar() {
		super.ligar();
		System.out.println("--- Caranga ligada");
		System.out.println("[tirando selfie]");
		System.out.println("[5 minutos depois] AVEEEEE 140 KMH PAE");
	}
	
	public void desligar() {
		super.desligar();
		System.out.println("--- Caranga desligada");
		System.out.println("Quebro de novo, vai te q pega no tranco");
	}
}