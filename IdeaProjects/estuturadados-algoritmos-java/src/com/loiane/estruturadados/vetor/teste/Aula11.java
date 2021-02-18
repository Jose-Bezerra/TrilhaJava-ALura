package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Lista;
import com.loiane.estruturadados.vetor.VetorObjetos;

public class Aula11 {
    public static void main(String[] args) {
//        VetorObjetos vetor = new VetorObjetos(3);


        //Perceba que ao generalizarmos a criação do vetor com o tipo
        //Object, criamos um problema pois poderemos misturar tipos diferentes
        //Quebrando a regra de criação do vetor
//        vetor.adiciona(1);
//        vetor.adiciona("Elemento");
//        System.out.println(vetor);
//        System.out.println("Tamanho: " + vetor.tamanho());

        Lista<String> vetor = new Lista<String>(2);

        vetor.adiciona("Teste 1");
        vetor.adiciona("Teste 2");

        System.out.println(vetor);


    }

}
