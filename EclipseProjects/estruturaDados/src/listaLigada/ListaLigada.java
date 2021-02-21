package listaLigada;

public class ListaLigada {
	
		private Celula primeira = null;
		private Celula ultima = null;
		private int totalDeElementos = 0;
		
	
	    public void adicionaNoComeco(Object elemento) {
	    	
	    	Celula nova = new Celula(elemento, primeira);
	    	this.primeira = nova;
	    	
	    	if (this.totalDeElementos == 0) {
				this.ultima = this.primeira; //Quando o primeiro elemento entrar no array, ele sempre 
				//será o último
			}
			this.totalDeElementos++;
	    }

	    public void adiciona(Object elemento) {  //Inserir no final
	    	if (this.totalDeElementos == 0) {
	    		adicionaNoComeco(elemento);
	    	} else {
	    		
	    		Celula nova = new Celula(elemento, null);
	    		/*Até aqui o último elemento aponta pro null, temos que fazer o último apontar pro 'nova'*/
	    		this.ultima.setProximo(nova);
	    		this.ultima = nova;
	    		this.totalDeElementos++;
	    		
	    	}
	    	
	    	
	    }
	    
	    /*Para validar o pegaCelula precisamos de um método que confirme
	     * se a posicáo é válida
	     * */
	    
	    public boolean posicaoOcupada(int posicao) {
	    	return posicao >= 0 && posicao < totalDeElementos;
	    }
	    
	    /* Precisamos de um método auxiliar para navegar até a posição desejada 
	     * onde iremos inserir o elemento */
	    public Celula pegaCelula(int posicao){
	    	
	    	if (!posicaoOcupada(posicao)) {
	    		throw new IllegalArgumentException("Posição inexistente");
	    	}
	    	
	    	Celula atual = primeira;
	    	
	    	for (int i = 0; i < posicao; i++) {
	    		atual = atual.getProximo();
	    	}
	    	
	    	return atual;
	    }
	    
	    public void adiciona(int posicao, Object elemento) {//Adiciona no meio
	    	
	    	if (posicao == 0) {
	    		this.adicionaNoComeco(elemento);
	    	} else if (posicao == this.totalDeElementos){
	    		this.adiciona(elemento);
	    	} else {
	    		
	    		Celula anterior = this.pegaCelula(posicao - 1);
	    		Celula nova = new Celula(elemento, anterior.getProximo());
	    		anterior.setProximo(nova);
	    		this.totalDeElementos++;
	    	}
	    	
	    	
	    	
	    }

	    public Object pega(int posicao) {
	    	return this.pegaCelula(posicao).getElemento(); 
	    }
	    
	    public void removeDoComeco() {
	    	if (this.totalDeElementos == 0) {
	    		throw new IllegalArgumentException("Lista vazia.");
	    	}
	    	
	    	this.primeira = this.primeira.getProximo();
	    	this.totalDeElementos--;
	    	
	    	if (this.totalDeElementos == 0) {
	    		this.ultima = null;
	    	}
	    	
	    }

	    public void remove(int posicao) {}

	    public int tamanho() { 
	    	return this.totalDeElementos;
	    }

	    public boolean contem(Object o) { return false;}
	    
	    @Override
	    public String toString() {
	    	if ( totalDeElementos == 0 ) {
	    		return "[]";
	    	}
	    	
	    	Celula atual = primeira;
	    	
	    	StringBuilder builder = new StringBuilder("[");
	    	
	    	for ( int i = 0; i < totalDeElementos; i++) {
	    		builder.append(atual.getElemento());
	    		builder.append(",");
	    		atual = atual.getProximo();
	    	}
	    	
	    	builder.append("]");
	    	
	    	return builder.toString();
	    }
	
}
