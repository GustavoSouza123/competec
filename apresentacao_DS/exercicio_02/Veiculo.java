package exercicio_02;

public class Veiculo {
	// atributo ligado (indica se o carro está ligado ou não, por isso é um boolean)
	private boolean ligado;
	
	// métodos setters - ligar() e desligar() - definem o valor para o boolean ligado
	public void ligar() {
		ligado = true;
	}
	
	public void desligar() {
		ligado = false;
	}
	
	// método getter - verifica se o carro is ligado ou isn't ligado
	public boolean isLigado() {
		return ligado;
	}
}