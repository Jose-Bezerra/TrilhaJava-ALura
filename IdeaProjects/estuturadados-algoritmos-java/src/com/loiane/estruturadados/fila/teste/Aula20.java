package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Object> fila = new Fila<>();

        fila.enfileiar(1);
        fila.enfileiar(2);
        fila.enfileiar(3);

        System.out.println(fila.estaVazio());
        System.out.println(fila.getTamanho());
        System.out.println(fila.toString());
    }
}
