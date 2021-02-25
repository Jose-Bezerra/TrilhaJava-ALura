package com.loiane.estruturadados.pilha.labs;

import java.util.Stack;

//Torre de Hanoi
public class Exer08 {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        //A base da pilha segue uma ordem crescente.
        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, destino, auxiliar);
    }

    public static void torreDeHanoi(int n, Stack<Integer> original, Stack<Integer> destino, Stack<Integer> auxiliar){
        if (n > 0) {
            torreDeHanoi(n -1, original, auxiliar, destino);
            destino.push(original.pop());
            System.out.println("------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);
            torreDeHanoi(n-1, auxiliar, destino, original);

        }
    }

}
