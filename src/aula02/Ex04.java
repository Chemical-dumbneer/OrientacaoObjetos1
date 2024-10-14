package aula02;

/*
Desenvolva um sistema que receberá o valor total da 
compra.
Se o valor for maior ou igual a R$50,00, calcule um 
desconto de 10%. Caso contrário, calcule um desconto de 
5%.
Apresente o valor de desconto em tela.
Utilize o conceito de operador ternário para resolução do 
exercício.
*/

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o valor total da compra:");
		double valor = input.nextDouble();
		double valFinal = valor * (1-((valor >= 50)?0.1:0.05));
		
		System.out.println("\nValor da compra: R$" + String.format("%.2f",valor));
		System.out.println("Valor do Desconto: " + String.format("%.2f", ((valor >= 50)?10:5)) + "%");
		

		input.close();
	}
	
}
