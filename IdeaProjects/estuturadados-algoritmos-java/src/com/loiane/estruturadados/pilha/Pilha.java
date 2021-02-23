package com.loiane.estruturadados.pilha;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

  public Pilha(int capacidade) {
    super(capacidade);
  }

  public Pilha() {
    super();
  }

  public void empilha(T elemento){
    super.adiciona(elemento);
  }

  public T topo() {
      // Esse if é essencial para evitar uma Excessão.
      if (this.estaVazio()) {
        return null;
      }
     return this.elementos [tamanho - 1];
  }

  public T desempilha() {
        if (this.estaVazio()) {
          return null;
        }

//        T elemento = this.elementos[tamanho - 1];
//        return elemento;
          return this.elementos[--tamanho];
  }

}
