package br.com.alura.java.io.teste;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Teste {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = "13º Órgão Oficial";
        byte[] bytes = s1.getBytes();
        String s2 = new String(bytes, "UTF-8");
        System.out.println(s2);

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());
    }
}
