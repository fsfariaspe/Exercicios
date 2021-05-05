package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		double a = ler.nextDouble();
		System.out.print("Digite o segundo número: ");
		double b = ler.nextDouble();

		System.out.println("Escolha qual operação você quer fazer:"
				+ "\nPara soma, digite 1"
				+ "\nPara subtração, digite 2" 
				+ "\nPara multiplicação, digite 3" 
				+ "\nPara divisão, digite 4");
		
		int opcao = ler.nextInt();
		Double resultado;
		
		switch(opcao) {
		
		case 1:
			resultado = a + b;
			System.out.println("A soma de " + a + " + " + b + " = " + resultado);
			break;
		case 2:
			resultado = a - b;
			System.out.println("A subtração de " + a + " - " + b + " = " + resultado);
			break;
		case 3:
			resultado = a * b;
			System.out.println("A multiuplicação de " + a + " x " + b + " = " + resultado);
			break;
		case 4:
			resultado = a / b;
			System.out.println("A divisão de " + a + " / " + b + " = " + resultado);
			break;
		}
		
		ler.close();

		System.out.println("Fim");
	}

}
