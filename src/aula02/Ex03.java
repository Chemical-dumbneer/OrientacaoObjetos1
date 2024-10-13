package aula02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insira o primeiro número:");
		int num1 = input.nextInt();

		System.out.println("Insira o segundo número:");
		int num2 = input.nextInt();
		
		System.out.println("Insira o terceiro número:");
		int num3 = input.nextInt();
		
		int mai12 = (num1>num2)?num1:num2;
		
		System.out.println("O maior valor entre os 3 números é: " + ((mai12>num3)?mai12:num3));
		
		input.close();
	}
	
}
