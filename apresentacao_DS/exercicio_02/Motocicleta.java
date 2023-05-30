package exercicio_02;

public class Motocicleta extends Veiculo {
	// sobrescreve os métodos ligar() e desligar() da classe Veiculo
	public void ligar() {
		super.ligar();
		System.out.println("--- Moto ligada");
		System.out.println("SELOKO ESSE ROBOZAO EH BALA");
		System.out.println("[0 minutos depois] RAN DAN DAN DAN DAN DAN DAN");
		System.out.println("[sirene de policia no fundo, perseguicao comeca]");
	}
	
	public void desligar() {
		super.desligar();
		System.out.println("--- Moto desligada");
		System.out.println("[UIIIIIIUU]");
		System.out.println("ENCOSTA NA PAREDE ENCOSTA NA PAREDE");
	}
}