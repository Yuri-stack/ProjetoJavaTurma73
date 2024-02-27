package laco_condicional;

import java.util.Scanner;

public class ExemploSwitchCase {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para uma frase motivacional--");
		System.out.println("--Digite 2 para um abraço virtual--");
		System.out.println("--Digite 3 para um conselho--");

		int opcao = leia.nextInt();

		switch (opcao) {
		
		case 1:
			System.out.println("Frase motivacional: a vida é muito curta para viver com pressa");
			break;

		case 2:
			System.out.println("Abraço virtual: 🤗");
			break;
			
		case 3:
			System.out.println("Apertar ctrl + s salva seu arquivo, e às vezes, a sua vida");
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}

		leia.close();
	}

}
