package Exercicios;

import java.util.Scanner;

public class MultiplosEntreSi {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.print("Digite o primeiro n�mero: ");
		int a = ler.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		int b = ler.nextInt();

		if (a % 2 == 0 && b % 2 == 0) {

			if (a % b == 0) {

				System.out.println("Os n�meros " + a + " e " + b + " s�o m�ltiplos entre si.");

			} else if (b % a == 0) {

				System.out.println("Os n�meros " + a + " e " + b + " s�o m�ltiplos entre si.");

			}
		}

		if (a % 2 != 0 || b % 2 != 0) {

			System.out.println("Os n�meros " + a + " e " + b + " N�O s�o m�ltiplos entre si.");

		}

		System.out.println("Fim");

		ler.close();

	}

}
