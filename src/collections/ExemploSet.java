package collections;

import java.util.HashSet;
import java.util.Set;

public class ExemploSet {

	public static void main(String[] args) {

		// Criando a Collection HashSet
		Set<String> setFrutas = new HashSet<String>();

		// Adiciona algumas frutas na Colection Set
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jabotica");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Kiwi");
		
		System.out.println("\nDados da Collection: " + setFrutas);
		
		// For Each
		for(String fruta : setFrutas) {
			System.out.println("A posição de " + fruta + " é: " + fruta.hashCode());	
		}

	}

}
