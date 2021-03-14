package br.com.alura.java.io.teste;

import java.io.*;

public class TesteCopiarArquivo {
    public static void main(String[] args) throws IOException {
        InputStream fis =  System.in;//new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        OutputStream fos = System.out;//new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        String row = br.readLine();

        while (row != null && !row.isEmpty()) {
            bw.write(row);
            bw.newLine();
            bw.flush();
            row = br.readLine();
        }

        br.close();
        bw.close();
    }
}
