package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer05 {
  public static void main(String[] args) {
    imprimeResultado("ADA");
    imprimeResultado("ABCD");
    imprimeResultado("ABCCBA");
    imprimeResultado("Maria®");
  }

  private static void imprimeResultado(String palavra) {
    System.out.println(palavra + " é palindromo? " +
        testaPalindromo(palavra));
  }

  public static boolean  testaPalindromo(String palavra){

    Stack<Character> pilha = new Stack<>();

    for (int i = 0; i < palavra.length(); i++) {
      pilha.push(palavra.charAt(i));
    };

    String palavraInversa = "";
    while (!pilha.isEmpty()) {
      palavraInversa += pilha.pop();
    }

    if (palavraInversa.equalsIgnoreCase(palavra)) {
      return true;
    }

    return false;
  }
}
