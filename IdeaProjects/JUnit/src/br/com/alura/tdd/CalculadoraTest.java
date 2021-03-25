package br.com.alura.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumerosPositivos() {
        Calculdora  calc = new Calculdora();
        int soma = calc.somar(3, 7);


        Assertions.assertEquals(10, soma);
    }


}
