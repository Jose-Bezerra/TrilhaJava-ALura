package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        Integer idadeRef = 43; //Autoboxing, é criado um objeto Integer apartir de um tipo primitivo int.
        int primitivo = new Integer(21); //Unboxing realizaod també de forma automática.
        System.out.println(primitivo);

        List<Integer> lista = new ArrayList<>();
        lista.add(idadeRef); //ok
        lista.add(primitivo); //autoboxing

        int i1 = lista.get(0); //unboxing
        Integer i2 = lista.get(1); //ok

        System.out.println(i1);
        System.out.println(i2);

        Integer valorRef = Integer.valueOf(33);
        int valorPrimitivo = valorRef.intValue();
        System.out.println(valorPrimitivo);

        Integer iParseado1 = Integer.valueOf("42");
        int iParseado2 = Integer.parseInt("42");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
    }
}