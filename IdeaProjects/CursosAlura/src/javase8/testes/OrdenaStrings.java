package javase8.testes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("alura online");
        palavras.add("casa do código");
        palavras.add("caelum");

        Collections.sort(palavras); //Maneira antiga de ordenar antes java8.
        System.out.println("Ordenação tradicional - natural antes do Java8.");
        System.out.println(palavras);
        System.out.println();

        System.out.println("Ordenação com outro critério de comparação");
        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        Collections.sort(palavras, comparador);
        System.out.println(palavras);
        System.out.println();

        System.out.println("Conhecendo outro método introduzindo com Java8");
        palavras.sort(comparador);
        System.out.println(palavras);
        System.out.println();

        System.out.println("Utilizando o foreach - default method da classe Iterable");
        Consumer<String> consumidor = new ConsumidorDeString();
        palavras.forEach(consumidor);



    }

    static class ComparadorDeStringPorTamanho implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return Integer.compare(s1.length(), s2.length());
        }
    }

    static class ConsumidorDeString implements Consumer<String> {

        @Override
        public void accept(String s) {
            System.out.println(s);
        }
    }
}
