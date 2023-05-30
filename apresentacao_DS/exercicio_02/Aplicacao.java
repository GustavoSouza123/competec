package exercicio_02;

public class Aplicacao {
	public static void printLigado(Veiculo obj) {
		if(obj.isLigado()) System.out.println("[veiculo ligado]"); else System.out.println("[veiculo desligado]");
	}
	
	public static void main(String[] args) {
		// instancia a caranga
		Automovel celta = new Automovel(); // instancia a caranga
		celta.ligar(); // liga a caranga
		printLigado(celta); // imprime se a caranga está ligada ou não
		celta.desligar(); // desliga a caranga
		printLigado(celta); // imprime se a caranga está ligada ou não
		
		System.out.println();
		
		// instancia a moto
		Motocicleta robozao = new Motocicleta(); // instancia o robozao
		robozao.ligar(); // liga o robozao
		printLigado(robozao); // imprime se o robozao está ligado ou não
		robozao.desligar(); // desliga o robozao
		printLigado(robozao); // imprime se o robozao está ligado ou não
		
		System.out.println();
		
		// instancia o busão
		Onibus iva3762 = new Onibus(); // instancia o buzão
		iva3762.ligar(); // liga o buzão
		printLigado(iva3762); // imprime se o buzão está ligado ou não
		iva3762.desligar(); // desliga o buzão
		printLigado(iva3762); // imprime se o buzão está ligado ou não
	}
}