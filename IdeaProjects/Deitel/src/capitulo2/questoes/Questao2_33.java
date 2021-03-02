package capitulo2.questoes;

import java.util.Scanner;

// Calculando o índice de massa corportal
public class Questao2_33 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int peso, altura, imc;

    System.out.print("Digite seu peso em kg: ");
    peso = scanner.nextInt();
    System.out.print("Digite sua altura: ");
    altura =  (scanner.nextInt());

    imc = peso / (altura * altura);

    if (imc >= 30) {
      System.out.println("Obese");
    } else if (imc >= 25) {
      System.out.println("Overweight");
    } else if (imc >= 18.5) {
      System.out.println("Normal");
    } else {
      System.out.println("Underweight");
    }
  }

}