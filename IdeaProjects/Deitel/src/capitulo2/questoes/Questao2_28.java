package capitulo2.questoes;

import java.util.Scanner;

// Realizando cálculos aritméticos
public class Questao2_28 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double pi = Math.PI;
    int raio;

    System.out.print("Digite o valor do raio: ");
    raio = scanner.nextInt();

    //Observe o CAST abaixo.
    System.out.printf("O diâmetro do círculo é %.2f%n",(double) (2 * raio));
    System.out.printf("O diâmetro da circunferênia é %.2f%n",(double) (2 * pi * raio));
    System.out.printf("A área da circunferência é %.2f%n",(double) (pi * raio * raio));

  }

}