package aula02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por Gentileza insira seu Nome Completo:");
		String nome = input.nextLine();
		
		System.out.println("Agora seu sexo:");
		String sexo = input.nextLine();
		
		System.out.println("Estado civil:");
		String estCivil = input.nextLine();
		
		System.out.println("Quantos filhos você tem?");
		int qtdFilhos = input.nextInt();
		
		input.nextLine(); //limpeza de buffer
		
		System.out.println("E sua escolaridade?");
		String escol = input.nextLine();
		
		System.out.println("Por último. Qual sua renda mensal?");
		double rendaMensal = input.nextDouble();
		
		//imprimindo os dados
		
		System.out.println("\nNome Completo: " + nome);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estCivil);
		System.out.println("Quantidade de filhos: " + qtdFilhos);
		System.out.println("Escolaridade: " + escol);
		System.out.println("Renda mensal: R$ " + String.format("%.2f",rendaMensal));
		
		input.close();
	}
}
