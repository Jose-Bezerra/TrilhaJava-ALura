package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;
import br.com.bytebank.banco.modelo.GuardadorDeReferencias;

public class TesteGuardadorReferencias {

    public static void main(String[] args) {
        GuardadorDeReferencias guardador = new GuardadorDeReferencias();

        Conta cc1 = new ContaCorrente(22, 11);
        guardador.adiciona(cc1);
        Conta cc2 = new ContaCorrente(22, 11);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());


    }

}
