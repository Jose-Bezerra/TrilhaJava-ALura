package com.loiane.estruturadados.fila.teste;

import com.loiane.estruturadados.fila.FilaComPrioridade;

public class Aula24 {
    public static void main(String[] args) {
        FilaComPrioridade<Integer> fila = new FilaComPrioridade<>();

        fila.enfileiar(1);
        fila.enfileiar(3);
        fila.enfileiar(2);

        System.out.println(fila);

    }
}
