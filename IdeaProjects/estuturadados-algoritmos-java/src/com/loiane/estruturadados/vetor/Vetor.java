package com.loiane.estruturadados.vetor;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }


//    public void adiciona(String elemento) {
//        for (int  i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break; //evita que o laço seja feito até o fim
//            }
//        }
//    }


    public boolean adiciona(String elemento) {
        if (tamanho < elementos.length) {
           elementos[tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public boolean adiciona (int posicao, String elemento){
      if (posicaoValida(posicao)) { // se true, movemos os elemento abaixo.
        for (int i = this.tamanho - 1; i >= posicao; i--){
          this.elementos[i + 1] = elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
      }


      return false;
    }


    public int tamanho() {
       return  this.tamanho;
    }

//  @Override
//  public String toString() {
//    return "Vetor{" +
//        "elementos=" + Arrays.toString(elementos) +
//        ", tamanho=" + tamanho +
//        '}';
//  }

    public String busca(int posicao) {
      posicaoValida(posicao);
      return this.elementos[posicao]; // Temos que fazer um tratamento
    }

  private boolean posicaoValida(int posicao) {
    if (!(posicao >= 0 && posicao < tamanho) ) {
      throw new IllegalArgumentException("Posição inválida!");
    }

    return true;
  }

  //Busca sequencial para saber se o elemento existe na coleção
    public int busca(String elemento) {
      for (int i = 0; i < tamanho; i++) {
        if (this.elementos[i].equals(elemento)) {
          return i;
        }
      }
      return -1;
    }

    public String toString(){
      StringBuilder s = new StringBuilder();
      s.append("[");
      for (int i = 0; i < this.tamanho -1; i++) {
        s.append(elementos[i]);
        s.append(", ");
      }

      if (this.tamanho > 0) {
        s.append(elementos[this.tamanho -1]);
      }

      s.append("]");
      return s.toString();

    }
}
