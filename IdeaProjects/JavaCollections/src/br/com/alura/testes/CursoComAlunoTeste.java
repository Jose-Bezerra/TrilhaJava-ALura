package br.com.alura.testes;

import br.com.alura.modelos.Aluno;
import br.com.alura.modelos.Aula;
import br.com.alura.modelos.Curso;

import java.util.Iterator;
import java.util.Set;


public class CursoComAlunoTeste {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando Coleções", "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 34672);
        Aluno a3 = new Aluno("Maurício Aniche", 34672);
        Aluno a4 = new Aluno("Rodrigo Turini", 34672);


        System.out.println(a1.equals(a3));

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println);
        System.out.println("-----------");

        Set<Aluno> alunos = javaColecoes.getAlunos();
        Iterator<Aluno> iterador = alunos.iterator(); //Forma antiga de iterar
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        System.out.println("O aluno " + a1.getNome() + " está matriculado?");
        System.out.println(javaColecoes.estaMAtriculado(a1));

        System.out.println(a1.equals(a4));

        System.out.println("E esse Turini está matriculado?");
        System.out.println(javaColecoes.estaMAtriculado(a4));

    }
}
