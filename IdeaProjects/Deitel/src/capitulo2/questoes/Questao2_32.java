package capitulo2.questoes;

import java.util.Scanner;

// Calculando o valor inteiro de um caractere
public class Questao2_32 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c, d, e;
    int maiores = 0; int menores = 0; int igualZero = 0;

    System.out.println("Digite cinco inteiros na sequência: ");

    System.out.print("a: ");
    a = scanner.nextInt();
    if (a > 0) {
      maiores++;
    } else if (a < 0 ){
      menores++;
    } else {
      igualZero++;
    }

    System.out.print("b: ");
    b = scanner.nextInt();
    if (b > 0) {
      maiores++;
    } else if (b < 0 ){
      menores++;
    } else {
      igualZero++;
    }

    System.out.print("c: ");
    c = scanner.nextInt();
    if (c > 0) {
      maiores++;
    } else if (c < 0 ){
      menores++;
    } else {
      igualZero++;
    }


    System.out.print("d: ");
    d = scanner.nextInt();
    if (d > 0) {
      maiores++;
    } else if (d < 0 ){
      menores++;
    } else {
      igualZero++;
    }


    System.out.print("e: ");
    e = scanner.nextInt();
    if (e > 0) {
      maiores++;
    } else if (e < 0 ){
      menores++;
    } else {
      igualZero++;
    }

    System.out.printf("Menores: %d, Igual a Zero: %d, Maiores: %d ",
        menores, igualZero, maiores);

  }

}