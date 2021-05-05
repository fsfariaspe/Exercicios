package Exercicios;

import java.util.Scanner;

public class SenhaBloqueada {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int senha;
		int senhaCorreta = 2002;
		int i = 1;

		while (i <= 3) {

			System.out.print("Digite sua senha: ");
			senha = ler.nextInt();

			if (senha == senhaCorreta) {

				System.out.println("Acesso Permitido");
				break;

			} else {

				System.out.println("Senha Inválida");
			}

			i++;
		}

		if (i > 3) {

			System.out.println("Senha Bloqueada");
		}
		ler.close();
	}

}
