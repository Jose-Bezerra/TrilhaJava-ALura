package br.com.alura.testes;

import br.com.alura.modelos.Aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesteListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<Aula>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);
    }
}
