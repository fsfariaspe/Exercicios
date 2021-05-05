package Exercicios;

public class FatorialDe1A10 {

	public static void main(String[] args) {

		int i = 1;
		int fatorial = 1;

		while (i <= 10) {

			fatorial = fatorial * i;
			System.out.println("Fatorial de " + i + " é: " + fatorial);
			i++;
		}

	}

}
