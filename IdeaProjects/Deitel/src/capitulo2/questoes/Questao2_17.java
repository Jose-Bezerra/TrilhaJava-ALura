package capitulo2.questoes;

import java.util.Scanner;

// Comparando números
public class Questao2_17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x, y, z;
    int menor, maior;
    int soma, produto, media;

    System.out.print("Enter an integer x: ");
    x = scanner.nextInt();
    menor = x;
    maior = x;

    System.out.print("Enter an integer y: ");
    y = scanner.nextInt();
    if (y >= maior) {
      maior = y;
    } else {
      menor = y;
    }

    System.out.print("Enter an integer z: ");
    z = scanner.nextInt();
    if (z >= maior) {
      maior = z;
    } else if (z <= menor) {
      menor = z;
    }

    soma = x + y + z;
    System.out.println("Soma: " + soma);

    produto = x * y * z;
    System.out.println("Produto: " + produto);

    media = soma / 3;
    System.out.println("Média: " + media);

    System.out.println(maior);
    System.out.println(menor);
  }
}
