package javase8.testes;

import java.util.*;
import java.util.stream.Collectors;

public class CursoV1 {
    private String nome;
    private int alunos;

    public CursoV1(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }

    public static void main(String[] args) {
        List<CursoV1> cursos = new ArrayList<>();

        cursos.add(new CursoV1("Python", 45));
        cursos.add(new CursoV1("JavaScript", 150));
        cursos.add(new CursoV1("Java 8", 113));
        cursos.add(new CursoV1("C", 55));

        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny()
                .ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
                .mapToInt(c -> c.getAlunos())
                .average();

        cursos = cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toList());

        Map mapa = cursos
                .stream()
                .filter(c -> c.getAlunos() > 100)
                .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));


    }

}
