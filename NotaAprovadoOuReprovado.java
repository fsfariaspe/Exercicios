package Exercicios;

import java.util.Scanner;

public class NotaAprovadoOuReprovado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a nota:");
		
		double nota = sc.nextDouble();
		
		if(nota >= 7) {
		
			System.out.println("Parab�ns!! Voc� passou direto!");
			
		} else if(nota < 7 && nota >= 5) {
			
			System.out.println("Voc� est� na recupera��o");
			
		} else {
			
			System.out.println("Infelizmente, voc� foi reprovado direto.");
			
		}
		sc.close();
	}

}
