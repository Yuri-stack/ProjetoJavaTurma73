package laco_condicional;

import java.util.Scanner;

public class ExemploIfEncadeado {

	public static void main(String[] args) {
		
		/* If Encadeado: É quando um temos várias condições
		 * sendo verificadas por If´s diferentes;
		 * */

		int x, y;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número X");
		x = leia.nextInt();

		System.out.println("Digite um número Y");
		y = leia.nextInt();

		if (x > y) { // SE
			
			System.out.println("X é maior");
			
		} else if (y == x) { // SENÃO SE
			
			System.out.println("não existe maior");
			
		} else { // SENÃO
			
			System.out.println("Y é maior");
			
		}

		leia.close();

	}

}
