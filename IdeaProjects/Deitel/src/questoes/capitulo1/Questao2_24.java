package questoes.capitulo1;

import java.util.Scanner;

// Realizando cálculos aritméticos
public class Questao2_24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b, c, d, e, menor, maior;

    System.out.print("Enter an integer a: ");
    a = scanner.nextInt();
    menor = a;
    maior = a;

    System.out.print("Enter an integer b: ");
    b = scanner.nextInt();
    if (b >= maior) maior = b;else menor = b;

    System.out.print("Enter an integer c: ");
    c = scanner.nextInt();
    if (c >= maior) maior = c;else menor = c;

    System.out.print("Enter an integer d: ");
    d = scanner.nextInt();
    if (d >= maior) maior = d;else menor = d;

    System.out.print("Enter an integer e: ");
    e = scanner.nextInt();
    if (e >= maior) maior = e;else menor = e;

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
  }
}
