package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);
        ContaCorrente cc2 = new ContaCorrente(22, 11);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }

}
