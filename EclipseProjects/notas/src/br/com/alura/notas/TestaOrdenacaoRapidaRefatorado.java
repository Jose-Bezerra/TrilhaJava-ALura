package br.com.alura.notas;

/*Vamos ordenar rapidamente um array? Usaremos o algoritmo do Pivo em que 
 * descobrimos quantos valores elementos menores o vetor possui em relação ao pivô.
 * Daí achamos a posição relativa do pivo e trocamos sua posição, deixando os menores
 * na esquerda e maiores na sua direita. Ok. Mas, como ordenamos a partição esquerda e 
 * direita? Usaremos o algoritmo do Pivot -Paraticiona quantas vezes necessário até o 
 * array estar completamente ordenado.
 * **/


public class TestaOrdenacaoRapidaRefatorado {

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
		
		ordena(notas, 0, notas.length);
		int encontrei = busca(notas, 0, notas.length, 3.7);
		
		if (encontrei >= 0) {
			System.out.println("Encontrei a nota na posição " + encontrei + ".");
		} else {
			System.out.println("Não encontrei a nota.");
		}
			
		
		for (int atual = 0; atual < notas.length; atual++) {
			Nota nota = notas[atual];
			System.out.println(nota.getAluno() + " " + nota.getValor());
		}
		
	}
	
	// Abaixo refatoramos o método de busca
	private static int busca(Nota[] notas, int de, int ate, double buscando) {
		System.out.println("Buscando " + buscando + " entre " + de + " e " + ate);
		
		if ( de > ate) {
			return -1;
		}
		int meio = (de + ate) / 2;
		Nota nota = notas[meio];
		if (nota.getValor() == buscando) {
			return meio;
		}
		
		if (buscando < nota.getValor()) {
			return busca(notas, de, meio - 1, buscando);
		} 
		return busca(notas, meio + 1, ate, buscando);
	}

	private static void ordena(Nota[] notas, int de, int ate) {
		//Se eu tenho 'um' elemento ou 'nenhum'elemento não preciso ordenar;
		int elementos = ate - de;
		if (elementos > 1) { //Observe a recursão do método ordena
			int posicaoPivo = particiona(notas, de, ate);
			ordena(notas, de, posicaoPivo); //Ordenando a esqueda do pivot
			ordena(notas, posicaoPivo + 1, ate); //Ordenando a direita do pivot
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
