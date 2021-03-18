package br.com.alura.testes;

import br.com.alura.modelos.Aluno;

public class TestandoReferencias {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Douglas", 11824763);
        Aluno alunoVeioFormulario = new Aluno("Douglas", 11824763);

        System.out.println(aluno == alunoVeioFormulario);
        System.out.println(aluno.equals(alunoVeioFormulario));
    }
}
