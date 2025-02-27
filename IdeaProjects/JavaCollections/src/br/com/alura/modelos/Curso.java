package br.com.alura.modelos;

import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new LinkedHashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
//    private Set<Aluno> alunos = new TreeSet<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }


    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //devolve uma cópia, read only
    }

    public Set<Aluno> getAlunos() {
        return  Collections.unmodifiableSet(alunos);
    }

    public void adiciona (Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal( ){
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[ Curso: " +
                nome +
                ", tempo total = " + this.getTempoTotal() +
                ", aulas = " + aulas +
                " ]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }

    public boolean estaMAtriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

//    public Aluno buscaMatriculado(int numero) {
//        for (Aluno aluno : alunos) {
//            if (aluno.getNumeroMatricula() == numero) {
//                return aluno;
//            }
//        }
//        throw new NoSuchElementException("Matricula " + numero
//                + " não encontrada");
//    }

    public Aluno buscaMatriculado (int numero) {
        return this.matriculaParaAluno.get(numero);
    }

}
