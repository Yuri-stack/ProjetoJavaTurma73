package exercicio_complementar_introducao;

import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		// Variaveis
		float raio, area;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.println("Insira o valor do raio: ");
		raio = leia.nextFloat();
		
		area = 3.14159f * (raio * raio);
		
		leia.close();
		
		// Saída de Dados
		System.out.printf("\nÁrea do Círculo: %.4f", area);
		
	}
}
