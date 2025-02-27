package br.com.alura.testes;

import br.com.alura.modelos.Funcionario;
import br.com.alura.modelos.OrdenaPorIdade;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteOrdenaFuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonathan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());

        }
    }
}
