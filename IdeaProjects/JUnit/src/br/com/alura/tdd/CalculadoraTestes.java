package br.com.alura.tdd;

public class CalculadoraTestes {
    public static void main(String[] args) {
        Calculdora calc = new Calculdora();
        int soma = 0;

        soma = calc.somar(3, 7);
        System.out.println(soma);

        soma = calc.somar(3, 0);
        System.out.println(soma);

        soma = calc.somar(0, 0);
        System.out.println(soma);

        soma = calc.somar(3, -1);
        System.out.println(soma);

    }
}
