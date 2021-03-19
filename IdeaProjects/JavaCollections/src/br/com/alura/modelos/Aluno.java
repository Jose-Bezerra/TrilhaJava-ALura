package br.com.alura.modelos;

import java.util.Objects;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if (nome == null) {
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[ Aluno: "+ this.nome + " matricula: " + this.matricula + "]";
    }

//    @Override
//    public boolean equals (Object obj) {
//        Aluno outroAluno = (Aluno) obj;
//        return this.nome.equals(outroAluno.nome);
//    }
//
//    public int hashCode() {
////        return this.nome.charAt(0); // o primitivo char retorna visualmente um caractere,
//        //mas retorna de fato um inteiro definido na tabela Unicode.
//        return this.nome.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getMatricula() == aluno.getMatricula() && getNome().equals(aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMatricula());
    }

    public int getNumeroMatricula() {
        return this.matricula;
    }
}
