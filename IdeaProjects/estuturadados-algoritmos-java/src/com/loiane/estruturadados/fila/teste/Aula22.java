package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula22 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        fila.enfileiar(1);
        fila.enfileiar(2);
        fila.enfileiar(3);

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);

        System.out.println(fila.desenfileirar());

        System.out.println(fila);
    }
}
