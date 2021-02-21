package br.com.alura.notas;
//O objetivo do pivot é separar os menores para o lado esquedo 
//E maiores para o lado direito, logo vamos achar a posição justa e correta do pivot.
//Para facilitar a implemenação deste algoritmo, colocamos o pivot na última posição do array

public class TestaPivota {

	public static void main(String[] args) {
		
		Nota guilherme = new Nota("Guilherme", 7);
		
		Nota[] notas = { 
				
				new Nota("Andre", 4), 
				new Nota("Carlos", 8.5), 
				new Nota("Ana", 10), 
				new Nota("Jonas", 3), 
				new Nota("Juliana", 6.7), 
				new Nota("Paulo", 9),
				new Nota("Mariana", 5), 
				new Nota("Lucia", 9.3), 
				guilherme,
		};
		
		int novaPosicao = particiona(notas, 0, notas.length);
		System.out.println("O pivô for parar na posição " + novaPosicao);
		
		for (int atual = 0; atual < notas.length; atual++) {
			Nota nota = notas[atual];
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}

	}

	private static int particiona(Nota[] notas, int inicio, int termino) {
		Nota pivo = notas[termino - 1];
		int menores = 0;
		
		for (int analisando = 0; analisando < termino; analisando++) {
			Nota atual = notas[analisando];
			if (atual.getValor() < pivo.getValor()) {
				troca(notas, menores, analisando); // colocando os menores na esquerda
				menores++;
			}
		}
		
		troca(notas, menores, termino - 1);
		return menores;
	}

	private static void troca(Nota[] notas, int de, int para) {
		Nota nota1 = notas[de];
		Nota nota2 = notas[para];
		notas[de] = nota2;
		notas[para] = nota1;
		
	}

}
