package Exercicios;

import java.util.Scanner;

public class MultiplosEntreSi {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int a = ler.nextInt();
		System.out.print("Digite o segundo número: ");
		int b = ler.nextInt();

		if (a % 2 == 0 && b % 2 == 0) {

			if (a % b == 0) {

				System.out.println("Os números " + a + " e " + b + " são múltiplos entre si.");

			} else if (b % a == 0) {

				System.out.println("Os números " + a + " e " + b + " são múltiplos entre si.");

			}
		}

		if (a % 2 != 0 || b % 2 != 0) {

			System.out.println("Os números " + a + " e " + b + " NÃO são múltiplos entre si.");

		}

		System.out.println("Fim");

		ler.close();

	}

}
