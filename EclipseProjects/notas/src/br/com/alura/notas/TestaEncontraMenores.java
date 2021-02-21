package br.com.alura.notas;

//Estamos entrando a posição relativa de um elemento no array.

public class TestaEncontraMenores {

	public static void main(String[] args) {
			
		Nota guilherme = new Nota("Guilherme", 7);
		
		Nota[] notas = { 
				
				new Nota("Andre", 4), 
				new Nota("Carlos", 8.5), 
				new Nota("Ana", 10), 
				new Nota("Jonas", 3), 
				new Nota("Juliana", 6.7), 
				guilherme,
				new Nota("Paulo", 9),
				new Nota("Mariana", 5), 
				new Nota("Lucia", 9.3), 
		};
		 	
		int menores = buscaMenores(guilherme, notas);
		System.out.println("A quantidade de alunos que tiraram nota menor que " + guilherme.getValor() +
							" foram " + menores);

	}

	private static int buscaMenores(Nota busca, Nota[] notas) {
		int menores = 0;
		for ( int atual = 0; atual < notas.length; atual++) {
			Nota nota = notas[atual];
			if (nota.getValor() < busca.getValor()) {
				menores++;
			}
		}
		
		return menores;
	}

}
