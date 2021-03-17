package br.com.alura.testes;

import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

import java.util.List;

public class CursoTeste {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silveira");

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

//        javaColecoes.getAulas().add(new Aula("Trabalhando com ArrayList", 25));
        System.out.println(aulas);

        System.out.println((aulas == javaColecoes.getAulas()));

        javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        System.out.println(javaColecoes.getAulas());
    }
}
