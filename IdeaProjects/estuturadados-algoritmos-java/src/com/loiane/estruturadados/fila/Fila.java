package com.loiane.estruturadados.fila;

import com.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T>  extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileiar(T elemento) {
//        this.elementos[this.tamanho] = elemento;
//        this.tamanho++;tamanho

//        this.elementos[this.tamanho++] = elemento; // Primeiro obtém a posicão,
        //segundo atribui o elemento e terceiro incrementa o tamnanho;

        this.adiciona(elemento);
    }

    public T espiar() {
        if (this.estaVazio()) {
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileirar() {
        final int POS = 0;

        if (this.estaVazio()) {
            return null;
        }
        T elementoASerRemovido = this.elementos[POS];
        this.remove(POS);
        return elementoASerRemovido;
    }


}
