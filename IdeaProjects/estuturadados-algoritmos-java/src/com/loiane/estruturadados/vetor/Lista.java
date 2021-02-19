package com.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista<T> { //Estamos usando o recurso Generics - /java 5, obrigando que seja declarado o tipo na criação
    //da lista.

    private T[] elementos; //Este T é simbologia de Tipo
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse) { //segundo maneira de escrever o Generics
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        tamanho = 0;
    }


    private void aumentaCapacidade(){
      if (this.tamanho == this.elementos.length) {
        T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
        for (int i = 0; i < this.elementos.length; i++) {
          novosElementos[i] = elementos[i];
        }
        this.elementos =  novosElementos;
      }
    }


    public boolean adiciona(T elemento) {
      this.aumentaCapacidade();
        if (tamanho < elementos.length) {
           elementos[tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }
  /**
   * 0 1 2 3 4 => indíces
   * B C E F G => 5 elementos
   * Quero acrescentar um elemento na posição X
   * Teremos que abrir um espaço e empurrar para direita os elementos
   * if posicao x = 1;
   * vetor[2] = vetor[1];
   * vetor[3] = vetor[2]
   * vetor[4] = vetor[3]
   * vetor[5] = vetor[4], antes dessa atribuiçao, vetor[5] = null;
   */

  public boolean adiciona (int posicao, T elemento){
      this.aumentaCapacidade();
      if (posicaoValida(posicao)) { // se true, movemos os elementos abaixo.
        for (int i = this.tamanho - 1; i >= posicao; i--){
          this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
      }

      return false;
    }

    // 0 1 2 3 4 => índices
    // B C E F G =>  tamanho 5
    // Quero remover o elemento na posiçao 1
    // vetro[1] = vetor[2]
    // vetro[2] = vetor[3]
    // vetro[3] = vetor[4] o valor na posição 4 é G.
    // Perceba que o G ficou na posição 3 e 4. então temos que diminuir o tamanho do vetor.
    // tamanho--
    public void remove(int posicao) {
      if (posicaoValida(posicao)) {
        for (int i = posicao; i < tamanho - 1; i++) {
          elementos[i] = elementos[i +1];
        }
        tamanho--;
      }
    }

    public void remove(T elemento) {
        int posicao = this.busca(elemento);
        if (posicao > -1) {
            this.remove(posicao);
        }
    }

    public int tamanho() {
       return  this.tamanho;
    }


    public Object busca(int posicao) {
      if (posicaoValida(posicao)) {
        return elementos[posicao];
      }

      return "Posição inválida" ; // Temos que fazer um tratamento
    }

  private boolean posicaoValida(int posicao) {
    if (!(posicao >= 0 && posicao < tamanho) ) {
      throw new IllegalArgumentException("Posição inválida!");
    }

    return true;
  }

  //Busca sequencial para saber se o elemento existe na coleção
    public int busca(T elemento) {
      for (int i = 0; i < tamanho; i++) {
        if (this.elementos[i].equals(elemento)) {
          return i;
        }
      }
      return -1;
    }

    public int ultimoIndice(T elemento){ //Para elementos repetidos, pegamos o último índice da posição
      /*
      int ultimaPosicao = -1;
      Observe que o método é custoso, pois varre o array inteiro, logo vamos inverter e varrer o array do fim
      para o início.
      for (int i = 0; i < tamanho; i++) {
          if (this.elementos[i].equals(elemento)) {
            ultimaPosicao = i;
          }
      }
      * */
        for (int i = tamanho - 1; i >= 0; i--) {
            if (this.elementos[i].equals(elemento)) {
              return i;
            }
        }
      return -1;
    }

    public void limpar() {
      this.elementos = (T[]) new Object [this.elementos.length];

      for (int i = 0; i < tamanho; i++ ) {
          this.elementos = null;
      }
      tamanho = 0;
    }

    public boolean contem(T elemento) { //Poderíamos utilizar as instruções abaixo, porém a manutenção do
      // código ficaria mais custoso
//        for (int i = 0; i < tamanho; i++) {
//            if (this.elementos[i].equals(elemento)) {
//                return true;
//            }
//        }
//        return false;
        return busca(elemento) > -1;
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
