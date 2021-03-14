package br.com.bytebank.banco.teste.util;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArraList {
    public static void main(String[] args) {
        ArrayList<Conta> list = new ArrayList<>();

        Cliente cliente = new Cliente();
        ContaCorrente cc = new ContaCorrente(22, 11);
        list.add(cc);
        System.out.println(list.get(0));

        ContaCorrente cc1 = new ContaCorrente(22, 22);
        list.add(cc1);

        System.out.println("Tamanho: " + list.size());

        for (int i = 0; i < list.size(); i++) {
            Object oRef = list.get(i);
            System.out.println(oRef);
        }

        System.out.println("---------");

        for (Object oRef:
             list) {
            System.out.println(oRef);
        }
    }
}
