package javase8.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringsV1 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");


        System.out.println("Introdução ao Lambda com Java8");
        palavras.sort((s1, s2) -> s1.length() - s2.length());
        System.out.println(palavras);
        System.out.println();

        /* Classe anônima
        Consumer<String> consumidor = new Consumer() {
            @Override
            public void accept(Object s) {
                System.out.println(s);
            }
        };
         */

        System.out.println("Associando o Lambda com o Default Method");
        palavras.forEach( s -> System.out.println(s));



    }


}
