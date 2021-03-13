package br.com.bytebank.banco.teste;

public class TesteArrayPrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5];
//        idades[0] = 29;
//        idades[1] = 39;
//        idades[2] = 49;
//        idades[3] = 59;
//        idades[4] = 69;
//
//        int idade4 = idades[3];
//        System.out.println(idade4);
//        System.out.println(idades.length);

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int j = 0; j < idades.length; j++) {
            System.out.println(idades[j]);
        }
    }
}
