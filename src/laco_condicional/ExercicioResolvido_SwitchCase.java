package laco_condicional;

import java.util.Scanner;

public class ExercicioResolvido_SwitchCase {

	public static void main(String[] args) {
		
		float numero1, numero2;
		int op;
		
		Scanner ler = new Scanner(System.in);

		System.out.println("Insira o primeiro valor: ");
		numero1 = ler.nextFloat();
		
		System.out.println("Insira o segundo valor: ");
		numero2 = ler.nextFloat();
		
		System.out.println("Insira a operação: ");
		op = ler.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
			break;
			
		case 2:
			System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
			break;
			
		case 3:
			System.out.println(numero1 + " x " + numero2 + " = " + (numero1 * numero2));
			break;
			
		case 4:
			System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
			break;
		
		default:
			System.out.println("Operação Inválida!");
		}
		
		ler.close();
		
	}

}
