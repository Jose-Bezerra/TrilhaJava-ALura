package capitulo2.questoes;

import java.util.Scanner;

// Realizando cálculos aritméticos
public class Questao2_25 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a;

    System.out.print("Enter an integer a: ");
    a = scanner.nextInt();

    if (a % 2 == 0) {
      System.out.println("O numero digitado é par!");
    } else {
      System.out.println("O número digitado é ímpar");
    }

  }

}