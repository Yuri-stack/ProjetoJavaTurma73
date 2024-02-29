package vetor_matriz;

import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		// Vetor
		String cachorros[] = new String[3];
		// int numeros[] = new int[5]; 
		
		Scanner leia = new Scanner(System.in);
		int indice;
		
		// 0["Laika"] - 1["Sandy"] - 2["Spike"]
		
		// Guarda os nomes
		for(indice = 0; indice < 3; indice++) {
			
			//sysout e pressionar CTRL + Espaço
			System.out.println("Digite o nome: ");
			cachorros[indice] = leia.nextLine();
		}
		
		// cachorros.length = 3
		
		// Lista os nomes
		for(indice = 0; indice < cachorros.length; indice++) {
			System.out.println("cachorros[" + indice + "]: " + cachorros[indice]);
		}
		
		System.out.println("Quantidade: " + cachorros.length);
		
	}

}
