package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		int idade;
		float salario = 5000.0f;
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de Dados
		System.out.print("Insira o seu nome: ");
		nome = leia.next();
				
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
		
		System.out.print("Insira o seu salário: ");
		salario = leia.nextFloat();
		
		leia.close();
								
		// concatenação: juntar um texto com 1 ou mais variaveis/constantes
		
		// Saída de Dados
		System.out.println("\nBom dia, " + nome);
		System.out.println("A sua idade é " + idade + " anos");
		System.out.printf("O seu salário é: R$%.2f", salario);
				
	}

}
