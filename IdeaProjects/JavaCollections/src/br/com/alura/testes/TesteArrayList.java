package br.com.alura.testes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteArrayList {
    public static void main(String[] args) {
        String curso1 = "Java 8";
        String curso2 = "Apache Camel";
        String curso3 = "Certificação Java";

        ArrayList<String> cursos = new ArrayList<>();

        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        cursos.remove(1);
        System.out.println(cursos);
        System.out.println("Primeiro curso da lista: " + cursos.get(0));

        Collections.sort(cursos);
        System.out.println(cursos);
    }
}
