package metodos_Exemplo;

import metodosSemRetorno.ExemploMetodo02;

public class ExemploMetodo01 {

	public static void main(String[] args) {
		
		int resultado = somar(2,5); // resultado = 7
		// String texto = mensagem(); não retorna informação
		
		System.out.println("O primeiro resultado é: " + resultado);
		
		System.out.println("O segundo resultado é: " + somar(8,3));
		
		ExemploMetodo02.mensagem();
		
		ExemploMetodo02.saudacao("\nOi, sei lá");
		ExemploMetodo02.saudacao("Bom dia");
		
		
		/* Métodos
		 * 
		 * Métodos c/ Retorno: Funções
		 * Métodos s/ Retorno: Processamentos
		 * 
		 * */
		
	}
	
	// valor1 + valo2 = resultado
	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
			
	/*
	public static int somar(int num1, int num2) {
		int resultado = num1 + num2;
		
		return resultado;
	}*/

}
