package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {
    public static void main(String[] args) {

        Conta[] contas = new Conta[10];

        ContaCorrente cc1 = new ContaCorrente (22,11);
        ContaPoupanca cc2 = new ContaPoupanca(22,22);

        contas[0] = cc1;
        contas[1] = cc2;

        ContaCorrente ref = (ContaCorrente) contas[0];

        System.out.println(cc1);
        System.out.println(contas[0]);
        System.out.println(cc1.getNumero());
        System.out.println(contas[0].getNumero()    );
    }
}
