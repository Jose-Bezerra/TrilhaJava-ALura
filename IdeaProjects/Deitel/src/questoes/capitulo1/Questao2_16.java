package questoes.capitulo1;

import java.util.Scanner;

// Comparando números
public class Questao2_16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x, y;

    System.out.print("Enter an integer x: ");
    x = scanner.nextInt();

    System.out.print("Enter an integer y: ");
    y = scanner.nextInt();

    if (x > y) {
      System.out.println("x is larger than y");
    } else if (x < y) {
      System.out.println("x is less than y");
    } else {
      System.out.println("Thes numbers are equal");
    }
  }
}
