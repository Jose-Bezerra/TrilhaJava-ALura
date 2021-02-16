package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new String[capacidade];
        tamanho = 0;
    }


//    public void adiciona(String elemento) {
//        for (int  i = 0; i < this.elementos.length; i++) {
//            if (this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break; //evita que o laço seja feito até o fim
//            }
//        }
//    }


    public boolean adiciona(String elemento) {
        if (tamanho < elementos.length) {
           elementos[tamanho] = elemento;
            tamanho++;
            return true;
        } else {
            return false;
        }
    }


    public int tamanho() {
       return  this.tamanho;
    }

//  @Override
//  public String toString() {
//    return "Vetor{" +
//        "elementos=" + Arrays.toString(elementos) +
//        ", tamanho=" + tamanho +
//        '}';
//  }

    public String toString(){
      StringBuilder s = new StringBuilder();
      s.append("[");
      for (int i = 0; i < this.tamanho -1; i++) {
        s.append(elementos[i]);
        s.append(", ");
      }

      if (this.tamanho > 0) {
        s.append(elementos[this.tamanho -1]);
      }

      s.append("]");
      return s.toString();

    }
}
