package Exercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class IdadeParaVoto {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Calendar cal = GregorianCalendar.getInstance();

		System.out.print("Digite seu ano de nascimento: ");
		int anoDeNascimento = ler.nextInt();
		int idade = cal.get(Calendar.YEAR) - anoDeNascimento;
		System.out.println("Sua idade é: " + idade);

		if (idade < 17) {

			System.out.println("Infelizmente você ainda não pode votar.");

		} else if (idade > 16 && idade < 19) {

			System.out.println("O seu voto é opcional.");

		} else if (idade > 17 && idade < 70) {

			System.out.println("O seu voto é obrigatório.");

		} else {

			System.out.println("O seu voto é opcional.");

		}
		ler.close();
	}

}
