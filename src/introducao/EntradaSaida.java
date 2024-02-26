package introducao;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		
		// Variaveis
		String nome;
		int idade;
		float salario = 5000.0f;
		
		// Entrada de Dados
		Scanner leia = new Scanner(System.in);
				
		System.out.print("Insira o seu nome: ");
		nome = leia.next();
				
		System.out.print("Insira a sua idade: ");
		idade = leia.nextInt();
		
		System.out.print("Insira o seu salário: ");
		salario = leia.nextFloat();
								
		// concatenação: juntar um texto com 1 ou mais variaveis/constantes
		// Saída de Dados
		System.out.println("Bom dia, " + nome);
		System.out.println("A sua idade é " + idade + " anos.");
				
	}

}
