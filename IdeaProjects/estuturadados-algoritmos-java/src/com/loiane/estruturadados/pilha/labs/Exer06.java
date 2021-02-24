package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

public class Exer06 {
    public static void main(String[] args) {
//    imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D");
//    imprimeResultado("A + B + C - D");
//    imprimeResultado("{[()]}{}[] ()");
//    imprimeResultado("{[(]}{}[] ()");
    }

    public static void imprimeResultado(String expressao) {
        System.out.println(expressao + " está balanceado? " +
                verificaSimbolosBalanceados(expressao));
    }

    final static String ABRE = "([{"; //Observe o index de cada simbolo
    final static String FECHA = ")]}"; //Vamos comparar os index's dos simbolos

    public static boolean verificaSimbolosBalanceados(String expressao) {

        Pilha<Character> pilha = new Pilha<>();//Apartir do Java 7, não precisamos mais repetir o tipo no simbolo diamante do lado direito da expressão.
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.empilha(simbolo); // Empilhamos o símbolo de abertura

            } else if (FECHA.indexOf(simbolo) > -1) {

                if (pilha.estaVazio()) {
                    return false;
                } else {
                    topo = pilha.desempilha();// desempilhamos o símbolo de abertura
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }

            index++;
        }
        return true;
    }
}
