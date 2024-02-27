package laco_condicional;

import java.util.Scanner;

public class ExercicioResolvido_IfElse {

	public static void main(String[] args) {

		// Exercicio 04 - IF/ELSE

		Scanner leia = new Scanner(System.in);

		String palavra1, palavra2, palavra3;

		System.out.println("Digite a primeira palavra: ");
		palavra1 = leia.nextLine();

		System.out.println("Digite a segunda palavra: ");
		palavra2 = leia.nextLine();

		System.out.println("Digite a terceira palavra: ");
		palavra3 = leia.nextLine();

		if (palavra1.equals("vertebrado")) {

			if (palavra2.equals("ave")) {

				if (palavra3.equals("carnivoro")) {
					System.out.println("águia");
				}

				else {
					System.out.println("pomba");
				}

			} else {

				if (palavra3.equals("onivoro")) {
					System.out.println("homem");
				}

				else {
					System.out.println("vaca");
				}
			}

		} else {

			if (palavra2.equals("inseto")) {

				if (palavra3.equals("hematofago"))
					System.out.println("pulga");

				else
					System.out.println("lagarta");

			} else {

				if (palavra3.equals("hematofago"))
					System.out.println("sanguessuga");

				else
					System.out.println("minhoca");
			}
		}

		leia.close();
		
	}
}
