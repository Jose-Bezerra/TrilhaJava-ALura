package br.com.alura.java.io.teste;

import java.io.*;

public class TesteEscritaPrintStreamPrintWriter {
    public static void main(String[] args) throws IOException {
//        OutputStream fos = new FileOutputStream("lorem2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);

        PrintWriter pw = new PrintWriter("lorem2.txt");

        pw.print("Lorem Ipsum");
        pw.println();
        pw.println();
        pw.print("Jailheminau");

        pw.close();
    }
}
