package capitulo2.questoes;

import java.util.Scanner;
// Cálculo aritméticos
public class Questao2_15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter an integer x: ");
    int x = scanner.nextInt();

    System.out.print("Enter an integer y: ");
    int y = scanner.nextInt();

    System.out.println("Soma: " + (x + y ));
    System.out.println("Diferença: "+ ( x - y));
    System.out.println("Produto: "+ (x * y));
    System.out.println("Quociente: " + ( x / y));
  }
}
