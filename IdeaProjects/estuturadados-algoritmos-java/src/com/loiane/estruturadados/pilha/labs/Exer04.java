package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

public class Exer04 {
  public static void main(String[] args) {
    Stack<Livro> pilha = new Stack<>();

    Livro livro1 = new Livro();
    livro1.setNome("Learning JavaScript Data Structures and Algorithms - Second Edition");
    livro1.setAutor("Loiane Groner");
    livro1.setAnoLancamento(2016);
    livro1.setIsbn("B01C2XX8Y2");


    Livro livro2 = new Livro();
    livro2.setNome("Learning JavaScript Data Structures and Algorithms");
    livro2.setAutor("Loiane Groner");
    livro2.setAnoLancamento(2014);
    livro2.setIsbn("B00OYTCT02");

    Livro livro3 = new Livro();
    livro3.setNome("Mastering Ext JS - Second Edition");
    livro3.setAutor("Loiane Groner");
    livro3.setAnoLancamento(2015);
    livro3.setIsbn("B00U01QQWU");

    Livro livro4 = new Livro();
    livro4.setNome("JavaScript Regular Expressions");
    livro4.setAutor("Loiane Groner");
    livro4.setAnoLancamento(2015);
    livro4.setIsbn("B00YHBVHGO");

    System.out.println("Pilha de livros criada! Pilha está vazia? " + pilha.isEmpty());
    System.out.println();
    System.out.println("Empilhando livros na pilha.");

    pilha.push(livro1);
    pilha.push(livro2);
    pilha.push(livro3);
    pilha.push(livro4);

    System.out.println();
    System.out.println(pilha.size() + " Livros foram empilhados");
    System.out.println("Espiando o topo da  pilha: " + pilha.peek());
    System.out.println("Desempilhando os livros da pilha.");

    while (!pilha.isEmpty()) {
      System.out.println("Desempilhando livro: " + pilha.pop());
    }

    System.out.println("Todos os livros foram desempilhados. Pilha vazia: " + pilha.isEmpty());


  }
}
