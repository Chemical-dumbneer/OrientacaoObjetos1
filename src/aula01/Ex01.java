package aula01;

public class Ex01 {
	public static void main(String [] args) {
		
		String Item1 = "Notebook";
		String Item2 = "SSD";
		
		double preco1 = 3500;
		double preco2 = 250;
		
		System.out.println("Produtos:");
		System.out.println(Item1 + " por apenas R$" + String.format("%.2f", preco1));
		System.out.println(Item2 + " por apenas R$" + String.format("%.2f", preco2));
	}
}
