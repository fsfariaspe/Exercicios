package Exercicios;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o primeiro n�mero: ");
		double a = ler.nextDouble();
		System.out.print("Digite o segundo n�mero: ");
		double b = ler.nextDouble();

		System.out.println("Escolha qual opera��o voc� quer fazer:"
				+ "\nPara soma, digite 1"
				+ "\nPara subtra��o, digite 2" 
				+ "\nPara multiplica��o, digite 3" 
				+ "\nPara divis�o, digite 4");
		
		int opcao = ler.nextInt();
		Double resultado;
		
		switch(opcao) {
		
		case 1:
			resultado = a + b;
			System.out.println("A soma de " + a + " + " + b + " = " + resultado);
			break;
		case 2:
			resultado = a - b;
			System.out.println("A subtra��o de " + a + " - " + b + " = " + resultado);
			break;
		case 3:
			resultado = a * b;
			System.out.println("A multiuplica��o de " + a + " x " + b + " = " + resultado);
			break;
		case 4:
			resultado = a / b;
			System.out.println("A divis�o de " + a + " / " + b + " = " + resultado);
			break;
		}
		
		ler.close();

		System.out.println("Fim");
	}

}
