package vetor_matriz;

import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		float[][] matriz = new float[4][4];
		float[] media = new float[4];
		float soma = 0.0f;
		int tamanhoLinha = 4, tamanhoColuna = 4;

		Scanner leia = new Scanner(System.in);

		// CRIAÇÃO DA MATRIZ DE NOTAS
		
		/* Percorrer as linhas da Matriz */
		for (int indiceI = 0; indiceI < tamanhoLinha; indiceI++) {

			/* Percorrer as colunas da Matriz */
			for (int indiceJ = 0; indiceJ < tamanhoColuna; indiceJ++) {

				System.out.println("Digite a " + (indiceJ + 1) + "º nota do participante " + (indiceI + 1) + ": ");
				matriz[indiceI][indiceJ] = leia.nextFloat();

			}

		}
		
		// CRIAÇÃO DA MATRIZ DE MÉDIAS

		/* Percorrer as linhas da Matriz */
		for (int indiceI = 0; indiceI < tamanhoLinha; indiceI++) {

			/* Percorrer as colunas da Matriz */
			for (int indiceJ = 0; indiceJ < tamanhoColuna; indiceJ++) {

				soma += matriz[indiceI][indiceJ];

			}

			// Adiciona a média de cada aluno em uma posição no Vetor Media
			media[indiceI] = soma / tamanhoColuna;
			soma = 0.0f;

		}

		// Percorre o Vetor que contém as médias e exibe
		for (int indiceI = 0; indiceI < media.length; indiceI++) {
			System.out.printf("\nMédia do participante " + (indiceI + 1) + ": %.1f", (media[indiceI]));
		}

	}

}
