package com.loiane.estruturadados.base;

import java.util.Arrays;
import java.util.Objects;

public class EstruturaEstatica<T> {

  protected T[] elementos;
  protected int tamanho;

  public EstruturaEstatica(int capacidade) {
    this.elementos = (T[]) new Object[capacidade];
    this.tamanho = 0;
  }

  public EstruturaEstatica() {
    this(10);
  }

  public boolean estaVazio() {
    return this.tamanho == 0;
  }

  protected boolean adiciona(T elemento) { //adiciona no final do vetor
    aumentaCapacidade();
    if (this.tamanho < this.elementos.length) {
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;
      return true;
    }
    return false;
  }

  protected boolean adiciona(int posicao, T elemento) { //adiciona em qualquer lugar
    aumentaCapacidade();
    if (!(posicao >= 0 && posicao <= tamanho)) {
      throw new IllegalArgumentException("Posição inválida");
    }

    //movendo todos elementos para direita no vetor
    for (int i = this.tamanho - 1; i >= posicao; i++) {
      this.elementos[i + 1] = this.elementos[i];
    }

    this.elementos[posicao] = elemento;
    this.tamanho++;

    return true;
  }

  private void aumentaCapacidade() {
    if (this.tamanho == this.elementos.length) {
      T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
      for (int i = 0; i < this.tamanho; i++) {
        elementosNovos[i] = this.elementos[i];
      }
      this.elementos = elementosNovos;
    }
  }

  public int getTamanho() {
    return this.tamanho;
  }

  @Override
  public String toString() {
    StringBuilder string = new StringBuilder();
    string.append("[");
    for (int i = 0; i < tamanho -1; i++){
      string.append(this.elementos[i]);
      string.append(", ");
    }
    if (this.tamanho > 0) {
      string.append(elementos[this.tamanho - 1]);
    }
    string.append("]");
    return string.toString();
  }
}
