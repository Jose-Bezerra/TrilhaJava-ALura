package com.loiane.estruturadados.pilha.labs;

import com.loiane.estruturadados.pilha.Pilha;

import java.util.Scanner;

public class Exer02 {
  public static void main(String[] args) {
    Pilha<Integer> par = new Pilha<>();
    Pilha<Integer> impar = new Pilha<>();

    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 10; i++) {

      System.out.println("Entre com um número: ");
      int num = scanner.nextInt();

      if (num == 0) {

        //Pilha par
        Integer desempilhado = par.desempilha();
        if (desempilhado == null) {
          System.out.println("Pilha está vazia!");
        } else {
          System.out.println("Desempilhando da pilha PAR:" + desempilhado);
        }

        //Pilha ímpar
        desempilhado = impar.desempilha();
        if (desempilhado == null) {
          System.out.println("Pilha está vazia!");
        } else {
          System.out.println("Desempilhando da pilha ÍMPAR:" + desempilhado);
        }


      } else if (num % 2 == 0) {
        System.out.println("Empilhando na pilha PAR: " + num);
        par.empilha(num);
      } else {
        System.out.println("Empilhando na pilha ÍMPAR: " + num);
        impar.empilha(num);
      }
    }

    System.out.println("Desempilhando todos os números da pilha PAR: ");
    while (!par.estaVazio()) {
      System.out.println(par.desempilha());
    }
    System.out.println("Desempilhando todos os números da pilha ÍMPAR: ");
    while (!impar.estaVazio()) {
      System.out.println(impar.desempilha());
    }

  }
}
