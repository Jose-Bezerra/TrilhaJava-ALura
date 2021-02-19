package com.loiane.estruturadados.vetor.labs;

import com.loiane.estruturadados.vetor.Lista;

public class Exer01 {
    public static void main(String[] args) {
        Lista<String> novaLista = new Lista<String>(5);

        novaLista.adiciona("A");
        novaLista.adiciona("B");
        novaLista.adiciona("C");

        System.out.println(novaLista.contem("A"));
        System.out.println(novaLista.contem("B"));
        System.out.println(novaLista.contem("D"));

    }
}
