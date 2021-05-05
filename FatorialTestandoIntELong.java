package Exercicios;

public class FatorialTestandoIntELong {

	public static void main(String[] args) {
		
		Long fatorial = 1L;
		for (int n = 1; n <= 40; n++) {
			
			System.out.println("Fatorial de " + n + " é: " + (fatorial = fatorial * n));
		}

	}

}
