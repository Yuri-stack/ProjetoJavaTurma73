package laco_condicional;

import java.util.Scanner;

public class ExemploIfElse {

	public static void main(String[] args) {
			
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade");
		}
		
		else {
			System.out.println("Você ainda não é maior de idade");
		}
		
		leia.close();
		
	}

}
