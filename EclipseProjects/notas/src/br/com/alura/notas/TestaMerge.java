package br.com.alura.notas;

/*Ordenar arrauys com selectionSort e insertionSort pode demandar muitos recursos
 * computacionais - devido a curva assintótica do algoritmo. Por isso podemos dividir
 * um grande array em pedaços menores (novos arrays) para serem ordenados individualmente e depois 
 * intercalá-los, gerando mais eficiência no processo.
 * */

public class TestaMerge {
	public static void main(String[] args) {
		Nota[] notas1 = { 
				new Nota("Andre", 4), 
				new Nota("Mariana", 5), 
				new Nota("Carlos", 8.5), 
				new Nota("Paulo", 9) };

		Nota[] notas2 = { 
				new Nota("Jonas", 3), 
				new Nota("Juliana", 6.7), 
				new Nota("Guilherme", 7),
				new Nota("Lucia", 9.3), 
				new Nota("Ana", 10) };

		Nota[] rank = intecala(notas1, notas2);
		for (Nota nota: rank) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}
		

	}

	private static Nota[] intecala(Nota[] notas1, Nota[] notas2) {
		int tamanho = notas1.length + notas2.length;
		Nota resultado[] = new Nota[tamanho];
		int atual = 0; // contador para o array resultado;
		int atual1 = 0; // contador para o array notas1;
		int atual2 = 0; // contador para o array notas2;

		while (atual1 < notas1.length && atual2 < notas2.length) {
			Nota nota1 = notas1[atual1];
			Nota nota2 = notas2[atual2];
			System.out.println("Estou comparando " + nota1.getAluno() + " com " +
								nota2.getAluno());
			if (nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atual1++;
			} else {
				resultado[atual] = nota2;
				atual2++;
			}
			atual++;
		}
		while (atual1 < notas1.length) {
			resultado[atual] = notas1[atual1];
			atual++;
			atual1++;
		}
		
		while (atual2 < notas2.length) { 
			resultado[atual] = notas2[atual2];
			atual++;
			atual2++;
		}
		return resultado;
	}

}
