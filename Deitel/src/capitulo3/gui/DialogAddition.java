package capitulo3.gui;

import javax.swing.*;

public class DialogAddition {
    public static void main(String[] args) {

       int soma = 0;
       String number1 = JOptionPane.showInputDialog("Insira um número inteiro: ");
       int numero1 = Integer.parseInt(number1);
       String number2 = JOptionPane.showInputDialog("Insira outro número inteiro: ");
       int numero2 = Integer.parseInt(number2);

       soma = numero1 + numero2;
       String message = String.format("A soma dos números é igual a: %d.", soma);
       JOptionPane.showMessageDialog(null, message);

    }
}
