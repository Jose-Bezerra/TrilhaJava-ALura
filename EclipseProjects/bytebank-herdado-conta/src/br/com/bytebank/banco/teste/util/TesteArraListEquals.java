package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TesteArraListEquals {
    public static void main(String[] args) {
       Collection<Conta> list = new ArrayList<>();

        ContaCorrente cc1 = new ContaCorrente(22, 22);
        ContaCorrente cc2 = new ContaCorrente(22, 22);

        list.add(cc1);

        boolean igual = cc1.equals(cc2);
        System.out.println("É igual? " + igual);

        boolean existe = list.contains(cc2);
        System.out.println("Já existe? " + existe);

        System.out.println(cc2);


        for (Conta conta: list) {
            System.out.println(conta);
        }
    }
}
