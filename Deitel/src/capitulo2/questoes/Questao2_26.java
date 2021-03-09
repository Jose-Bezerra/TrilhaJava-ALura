package capitulo2.questoes;

import java.util.Scanner;

// Realizando cálculos aritméticos
public class Questao2_26 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b;

    System.out.print("Enter an integer a: ");
    a = scanner.nextInt();

    System.out.print("Enter an integer b: ");
    b = scanner.nextInt();

    if (a % b == 0) {
      System.out.println("O numero " + a + " é múltiplo de " + b + ".");
    } else {
      System.out.println("O numero " + a + " \"Não\" é múltiplo de " + b + ".");
    }

  }

}