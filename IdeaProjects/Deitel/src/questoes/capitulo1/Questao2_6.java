package questoes.capitulo1;

import java.util.Scanner;

//Calcula o produto de três inteiros.
public class Questao2_6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x, y, z, result;

    System.out.println("Enter first integer: ");
    x = input.nextInt();
    System.out.println("Enter second integer: ");
    y = input.nextInt();
    System.out.println("Enter third integer: ");
    z = input.nextInt();

    result = x * y * z;
    System.out.printf("Product is %d%n", result);


  }

}
