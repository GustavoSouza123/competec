import java.util.Scanner;

public class Slugs {
    
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int L, nivel, velocidade;
	        while (sc.hasNext()) {
	        	L = sc.nextInt();
	        	nivel = 0;
	        	for(int i = 0; i < L; i++) {
	        		velocidade = sc.nextInt();
	        		if(velocidade < 10 && nivel <= 1)  nivel = 1;
	        		else if(velocidade >= 20 && nivel <= 3) nivel = 3;
	        		else if(nivel < 2) nivel = 2;
	        	}
	        	System.out.println(nivel);
	        }
	}
	
}
