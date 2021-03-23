package javase8.testes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

public class OrdenaStringsV2 {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");


        System.out.println("Introdução ao Lambda com Java8");
//        palavras.sort((s1, s2) -> s1.length() - s2.length());
//        Function<String, Integer> funcao = s -> s.length();
//        Comparator<String> comparador = Comparator.comparing(funcao);
//        palavras.sort(comparador);
        palavras.sort(Comparator.comparing(s -> s.length()));
        palavras.sort(Comparator.comparing(String::length));
        System.out.println(palavras);
        System.out.println();



        System.out.println("Associando o Lambda com o Default Method");
        palavras.forEach(System.out::println);



    }


}
