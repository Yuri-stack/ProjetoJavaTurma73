package introducao;

public class VariavelConstante {

	public static void main(String[] args) {
		
		// Variáveis	 
		int divisor = 4;
		float preco = 10.5f; 		// float (00000.00) - double (000000000000.00)
		boolean resposta = true;	// lógico - true/false
		String texto = "Generation Brasil";
				
		// Constantes
		final int QUANTIDADE = 50;
		final String TURMA = "Turma 73";
		final double AREA = 45.4567;
		
		// Saída de Dados
		System.out.println("Variáveis");
		System.out.println("Divisor: " + divisor);
		System.out.println("Preço: " + preco);
		System.out.println("Resposta (verdadeiro/falso): " + resposta);
		System.out.println("Texto: " + texto);
		
		System.out.println("\nConstantes");
		System.out.println("QUANTIDADE: " + QUANTIDADE);
		System.out.println("TURMA: " + TURMA);
		System.out.println("AREA: " + AREA);
	}

}
