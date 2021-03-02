package capitulo2.questoes;

import java.util.Scanner;

// Calculando o valor inteiro de um caractere
public class Questao2_30 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite um número com 05 dígitos: ");
    int inteiro = scanner.nextInt();

    int dezenaMilhar = inteiro / 10000;
//    System.out.println(dezenaMilhar);

    int milhar = (inteiro % 10000) / 1000;
//    System.out.println(milhar);

    int centenas = (inteiro % 1000) / 100;
//    System.out.println(centena);

    int dezenas = (inteiro % 100) / 10;
//    System.out.println(dezenas);

    int unidades = (inteiro % 10) / 1;
//    System.out.println(unidades);

    System.out.println(dezenaMilhar + " " + milhar + " " + centenas + " " +
        dezenas + " " + unidades);

  }

}