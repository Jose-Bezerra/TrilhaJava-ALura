package capitulo2.questoes;

// Cálculo de expressões com base na ordem de precedência.
public class Questao2_13 {

  public static void main(String[] args) {
    int x = 7 + 3 * 6 / 2 - 1;
    System.out.println(x);// 15

    x = 2 % 2 + 2 * 2 - 2 / 2;
    System.out.println(x);// 3

    x = (3 * 9 * (3 + (9 * 3 / (3))));
    System.out.println(x); // 324
  }

}
