package br.com.alura.notas;

/*Já vimos como unir de forma ordenada (intercalar) dois arrays já ordenados, agora vamos receber um único 
 * array com dois pedaços ordenados e gerear um único array ordenado.
 * */

public class TestaOrdenaUnicoArray {

	public static void main(String[] args) {
		
		Nota[] notas = { 
				
				new Nota("Andre", 4), 
				new Nota("Mariana", 5), 
				new Nota("Carlos", 8.5), 
				new Nota("Paulo", 9),
				new Nota("Jonas", 3), 
				new Nota("Juliana", 6.7), 
				new Nota("Guilherme", 7),
				new Nota("Lucia", 9.3), 
				new Nota("Ana", 10) 
		};
		
		Nota[] rank = intercala(notas, 0, 4, 9);
		
		for (Nota nota: rank) {
			System.out.println(nota.getAluno() + " - " + nota.getValor());
		}

	}

	private static Nota[] intercala(Nota[] notas, int inicio, int miolo, int termino) {
		Nota[] resultado = new Nota[notas.length];
		int atual = 0;
		int atual1 = inicio;
		int atual2 = miolo;
		
		while(atual1 < miolo && atual2 < termino) {
			Nota nota1 = notas[atual1];
			Nota nota2 = notas[atual2];
			if (nota1.getValor() < nota2.getValor()) {
				resultado[atual] = nota1;
				atual1++;
				atual++;
			} else {
				resultado[atual] = nota2;
				atual2++;
				atual++;
			}
		}
		
		while(atual1 < miolo) {
			resultado[atual] = notas[atual1];
			atual1++;
			atual++;
		}
		
		while(atual2 < termino) {
			resultado[atual] = notas[atual2];
			atual2++;
			atual++;
		}
		
		return resultado;
	}

}
