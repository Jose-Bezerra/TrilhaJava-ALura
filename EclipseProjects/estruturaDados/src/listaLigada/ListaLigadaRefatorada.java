package listaLigada;

public class ListaLigadaRefatorada {
	
		private Celula primeira = null;
		private Celula ultima = null;
		private int totalDeElementos = 0;
		
	
	    public void adicionaNoComeco(Object elemento) {
	    	if (this.totalDeElementos == 0) {
	    		Celula nova = new Celula(elemento);
	    		this.primeira = nova;
	    		this.ultima = nova;
	    	} else {
	    		Celula nova = new Celula(elemento, this.primeira);
	    		this.primeira.setAnterior(nova);
	    		this.primeira = nova;
	    	}
	    	
			this.totalDeElementos++;
	    }

	    public void adiciona(Object elemento) {  //Inserir no final
	    	if (this.totalDeElementos == 0) {
	    		adicionaNoComeco(elemento);
	    	} else {
	    		
	    		Celula nova = new Celula(elemento);
	    		this.ultima.setProximo(nova);
	    		nova.setAnterior(this.ultima);
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
	    		
	    		Celula anterior = pegaCelula( posicao - 1);
	    		Celula proxima = anterior.getProximo();
	    		
	    		Celula nova = new Celula(elemento, anterior.getProximo());
	    		nova.setAnterior(anterior);
	    		anterior.setProximo(nova);
	    		proxima.setAnterior(nova);
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
	    
	    public void removeDoFim() {
	    	if (this.totalDeElementos == 1) {
	    		this.removeDoComeco();
	    	} else {
	    		Celula penultima = this.ultima.getAnterior();
	    		penultima.setProximo(penultima);
	    		this.ultima = penultima;
	    		this.totalDeElementos--;
	    		
	    	}
	    }

	    public void remove(int posicao) {
	    	if (posicao == 0) {
	    		this.removeDoComeco();
	    	} else if ( posicao ==  this.totalDeElementos - 1) {
	    		this.removeDoFim();
	    	} else {
	    		Celula anterior = this.pegaCelula(posicao - 1);
	    		Celula atual = anterior.getProximo();
	    		Celula proxima = atual.getProximo();
	    		
	    		anterior.setProximo(proxima);
	    		proxima.setAnterior(anterior);
	    		
	    		this.totalDeElementos--;
	    	}
	    }

	    public int tamanho() { 
	    	return this.totalDeElementos;
	    }

	    public boolean contem(Object elemento) { 
	    	Celula atual = this.primeira;
	    	
	    	while(atual != null) {
	    		if (atual.getElemento().equals(elemento)) {
	    			return true;
	    		}
	    		 atual = atual.getProximo();	    
	    	}
	    	
	    	return false;
	    }
	    
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
