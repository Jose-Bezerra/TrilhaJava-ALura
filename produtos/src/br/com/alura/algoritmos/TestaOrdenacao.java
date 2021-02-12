package br.com.alura.algoritmos;

//selectionSort => Selecionamos o elemento que deve ficar na posição
//insertionSort => Encontrando a posição onde devo inserir o elemento
/*Como resolver problemas de lógica? Analise o problema por vários ângulos para atacar o
 * problema com algoritmos menores já conhecidos e solucionar um problema maior. Ex: Achar os quatro elementos
 * maiores de um array pode ser reduzido a uma simples ordenação que já sabemos como resolver*/

public class TestaOrdenacao {

	public static void main(String[] args) {
		Produto produtos[] = {
				  new Produto("Lamborghini", 1000000),
				  new Produto("Jipe", 46000),
				  new Produto("Brasília", 16000),
				  new Produto("Smart", 46000),
				  new Produto("Fusca", 17000)
			  };
		//Em várias linguagens podemos o length para determinar o tamanho do array
		//Tamanho != Quantidade de elementos válidos
		selectionSort(produtos, produtos.length);
		insertionSort(produtos, produtos.length);
		
		imprime(produtos);
		
		

	}

	private static void imprime(Produto[] produtos) {
		for (Produto produto : produtos) {
			System.out.println(produto.getNome() + " custa " + produto.getPreco());
		}
	}
	
	private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 0; atual < quantidadeDeElementos; atual++) {
			int analise = atual;
			System.out.println("Estou na posição " + atual);
			//O laço while serve para percorrer o array para esquerda da posição analisada
			while ( analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				System.out.println("Estou trocando " 
									+ produtos[analise].getNome() 
									+ " por " + produtos[analise -1].getNome());
				troca(produtos, analise, analise - 1);	
				analise--;
			}
			
			imprime(produtos);
			System.out.println();
			System.out.println();
			System.out.println();
		}
		
	}

	private static void troca(Produto[] produtos, int primeiro, int segundo) {
		Produto primeiroElemento = produtos[primeiro];
		Produto segundoElemento = produtos[segundo];
		produtos[primeiro] = segundoElemento;
		produtos[segundo] = primeiroElemento;
	}

	//A ideia é analisar o menor valor apartir de cada posição (0, 1, 2..), varrendo o restante do array
	//O método abaixo irá ordenar qualquer array de valores
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		/* Analisamos cada posiçao do array começando pela posição 0 varrendo para direita em busca de 
		 * um valor menor e depois trocamos as posições caso necessário*/
		for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) { //Descartamos a última posição do Array
			
			System.out.println("Estou na posição: " + atual);
			
			int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1); // Esse -1 varre até a posicáo 4
			System.out.println("Trocando o " + produtos[atual].getNome() + " por " + produtos[menor].getNome());
			troca(produtos, atual, menor);
		}
	}
	
	//O método abaixo descobre o menor valor de array. Ele é a base para ordenação
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		  int maisBarato = inicio;
		  //No For abaixo tenha cuidado com a inicialização da variável atual!!!
		  for( int atual = inicio; atual <= termino; atual++) {
			  if ( produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				  maisBarato = atual;
			  }
		  }
		  return maisBarato;
	}

}
