package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetor = new VetorObjetos(3);

        Contato contato1 = new Contato("José", "88753739", "josbezfi");
        Contato contato2 = new Contato("julio", "988759698", "julbezne");
        Contato contato3 = new Contato("Jivago", " 88427571", "jivago");
        Contato contato4 = new Contato("Paty", " 88427571", "Patrícia");

        vetor.adiciona(contato1);
        vetor.adiciona(contato2);
        vetor.adiciona(contato3);


        System.out.println(vetor);
        System.out.println("Tamanho: " + vetor.tamanho());

        int posicao = vetor.busca(contato4);

        if (posicao > -1) {
            System.out.println("Elemento existe no vetor");
        } else {
            System.out.println("Elemento não existe no vetor");
        }
    }

}
