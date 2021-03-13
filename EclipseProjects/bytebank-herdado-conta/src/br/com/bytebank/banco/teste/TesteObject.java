package br.com.bytebank.banco.teste;

public class TesteObject {
    public static void main(String[] args) {

//        String nome = "Alura"; //Imutabilidade
//        String outro = new String("Alura");
//
//        nome.replace("A", "a");
//        System.out.println(nome);
//
//        String nova = nome.replace("A", "a");
//        System.out.println(nova);
//
//        String name = "Mario";
//        name = name.replace('o', 'a');
//        System.out.println(name);


//        String nome = "JOSÉ";
//         nome = nome.toLowerCase();
//        System.out.println(nome);
////        nome = nome.toUpperCase();
////        System.out.println(nome);
//
//        char c = nome.charAt(3);
//        System.out.println(c);
//
//        int pos = nome.indexOf("os");
//        System.out.println(pos);

        String texto = "Socorram";
        texto = texto.concat("-");
        texto = texto.concat("me");
        texto = texto.concat(", ");
        texto = texto.concat("subi ");
        texto = texto.concat("no ");
        texto = texto.concat("ônibus ");
        texto = texto.concat("em ");
        texto = texto.concat("Marrocos");
        System.out.println(texto);

        StringBuilder builder = new StringBuilder("Socorram");
        builder.append("-");
        builder.append("me");
        builder.append(", ");
        builder.append("subi ");
        builder.append("no ");
        builder.append("ônibus ");
        builder.append("em ");
        builder.append("Marrocos");
        String texto1 = builder.toString();
        System.out.println(texto1);
    }
}
