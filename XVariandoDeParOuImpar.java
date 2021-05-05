package Exercicios;

import java.util.Scanner;

public class XVariandoDeParOuImpar {

	public static void main(String[] args) {

		System.out.print("Digite um número: ");
		Scanner ler = new Scanner(System.in);
		int x = ler.nextInt();
		System.out.print(x + " -> ");
		
		while(x > 1) {
			
			
			if (x % 2 == 0) {

				x = x / 2;

			} else {

				x = 3 * x + 1;
			}
			System.out.print(x);
			
			if(x != 1) {
				System.out.print(" -> ");
			}
		}
		
		ler.close();
	}

}
