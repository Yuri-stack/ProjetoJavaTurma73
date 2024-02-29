package vetor_matriz;

public class ExemploMatriz {

	public static void main(String[] args) {

		// int[LINHAS][COLUNAS] matriz = new int[3][3];

		/*
		 * int numeros[ LINHAS ][ COLUNAS ] = { {10, 15, 35}, {70, 120, 140}, {50, 100,
		 * 150} };
		 */

		int numeros[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		int linha, coluna;

		// Percorrer as linhas da Matriz
		for (linha = 0; linha < 3; linha++) {

			// Percorrer as colunas da Matriz
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.println("Numeros[" + linha + "][" + coluna + "]" + numeros[linha][coluna]);

			}

		}
	}

}
