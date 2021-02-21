package questoes.capitulo1;

import java.util.Scanner;

// Calculando o crescimento demográfico mundial.
//Fonte: https://www.worldometers.info/demographics/world-demographics/
public class Questao2_34 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long populacaoMundial;
    long estimativaPopulacaoMundial;
    int anos;

    System.out.println("Fonte: https://www.worldometers.info/demographics/world-demographics/");
    System.out.print("Com base na fonte acima informe a população mundial: ");
    populacaoMundial = scanner.nextLong();
    System.out.println("Calcularemos uma estimativa da populaçao mem 1, 2, 3 anos...");
    System.out.print("Informe a estimativa em anos: ");
    anos = scanner.nextInt();

    estimativaPopulacaoMundial = (long) (((populacaoMundial * 0.0105)  * anos) + populacaoMundial);
    System.out.println(estimativaPopulacaoMundial);
  }
}