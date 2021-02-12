package listaLigada;

public class TestaListaLigada {

	public static void main(String[] args) {
//		ListaLigada lista = new ListaLigada();
		ListaLigadaRefatorada lista = new ListaLigadaRefatorada();
		
		System.out.println(lista);
		lista.adicionaNoComeco("José");
		System.out.println(lista);
		lista.adicionaNoComeco("Júlio");
		System.out.println(lista);
		lista.adicionaNoComeco("Jivago");
		System.out.println(lista);
		
		lista.adiciona("Marcelo");
		System.out.println(lista);
		
		lista.adiciona(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		lista.removeDoComeco();
		System.out.println(lista);
		System.out.println(lista.tamanho());
		
//		lista.removeDoFim();
//		System.out.println(lista);
//		
		lista.remove(2);
		System.out.println(lista);
		
		System.out.println(lista.contem("Júlio"));
		System.out.println(lista.contem("Danilo"));
	}

}
