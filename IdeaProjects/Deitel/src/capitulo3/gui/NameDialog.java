package capitulo3.gui;

import javax.swing.*;

public class NameDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Qual o seu nome?");

        String message = String.format("Seja bem-vindo(a), %s, à programação Java!", name);

        JOptionPane.showMessageDialog(null, message);

    }
}
