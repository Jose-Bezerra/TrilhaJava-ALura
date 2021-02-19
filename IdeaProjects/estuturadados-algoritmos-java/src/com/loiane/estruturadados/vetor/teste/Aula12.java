package com.loiane.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula12 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("C");
        System.out.println(arrayList);

        arrayList.add(1, "B");
        System.out.println(arrayList);

        boolean existe = arrayList.contains("A");

        if (existe) {
            System.out.println("Elemento existe no Array");
        } else {
            System.out.println("Não existe no Array");
        }

        int posicao = arrayList.indexOf("D");
        if (posicao > -1) {
            System.out.println("Elemento existe");
        } else {
            System.out.println("elemento não existe na posição: " + posicao);
        }

        System.out.println(arrayList.get(0));

        arrayList.remove(0);
        arrayList.remove("B");
        System.out.println(arrayList);
        System.out.println(arrayList.size());


    }
    
}
