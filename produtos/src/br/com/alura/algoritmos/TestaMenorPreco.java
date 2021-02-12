package br.com.alura.algoritmos;

public class TestaMenorPreco {
  public static void main(String[] args) {
	  
//	  Produto produtos[] = new Produto[5];	
	  Produto produtos[] = {
		  new Produto("Lamborghini", 1000000),
		  new Produto("Jipe", 46000),
		  new Produto("Brasília", 16000),
		  new Produto("Smart", 46000),
		  new Produto("Fusca", 17000)
	  };
	
	  int maisBarato = buscaMenor(produtos, 0, 4);
	  
	  System.out.println(maisBarato);
	  System.out.println("O carro " + produtos[maisBarato].getNome()
			  						+ " é o mais barato, e custa " 
			  						+ produtos[maisBarato].getPreco());
			  			
  }
 
  /* Este método foi generalizado com os parâmetros início e término devido algumas linguagens não 
   * possuirem o lenght para verirficar o tamanho do arra e ainda assim no caso do Java poderemos 
   * ter Array criado com posições Null, logo necessitamos saber a quantidade de elementos válidos.
   * */
	private static int buscaMenor(Produto[] produtos, int inicio, int termino) {
		  int maisBarato = inicio;
		  
		  for( int atual = 0; atual <= termino; atual++) {
			  if ( produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
				  maisBarato = atual;
			  }
		  }
		  return maisBarato;
	}
}

/* Como descobrir os produtos mais baratos? sem colocar tantos if's no código.
Ordenando o array é a solução. Mas como podemos ordenar? tudo começa com um pequeno
algoritmo que no caso é o método buscaMenor()
1. Pensemos no seguinte, para ordenar temos que encontrar o mais barato para a 
posiçao 0 do array, depois achamos o mais barato apartir da posição 1, 2, 3 e por aí vai...
2. Então utilizamos o método buscaMenor várias vezes dependendo do tamanho do Array
*/
