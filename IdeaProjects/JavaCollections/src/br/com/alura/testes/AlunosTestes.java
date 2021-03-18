package br.com.alura.testes;

import java.util.*;

public class AlunosTestes {
    public static void main(String[] args) {
//        Set<String> alunos = new HashSet<>();
        Collection<String> alunos = new HashSet<>();

        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Nico Steppat");
        alunos.add("Sérgio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Maurício Aniche");

        System.out.println(alunos.size());
        boolean joseEstaMatriculado = alunos.contains("José");
        System.out.println(joseEstaMatriculado);

        for (String aluno : alunos) {
            System.out.println(aluno);
            System.out.println();
        }

        System.out.println("-------");
        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
