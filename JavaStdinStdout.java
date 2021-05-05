package Exercicios;

import java.util.Scanner;

public class JavaStdinStdout {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite num1: ");
		int num1 = sc.nextInt();
		System.out.print("Digite num2: ");
		int num2 = sc.nextInt();
		System.out.print("Digite num3: ");
		int num3 = sc.nextInt();
		
		sc.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
