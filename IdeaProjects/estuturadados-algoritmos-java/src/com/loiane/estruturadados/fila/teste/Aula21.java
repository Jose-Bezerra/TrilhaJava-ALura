package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula21 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        System.out.println(fila.espiar());

        fila.enfileiar(3);
        fila.enfileiar(2);
        fila.enfileiar(1);

        System.out.println(fila.espiar());

    }
}
