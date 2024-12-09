import javax.swing.*;

public class Maior_número1 {
    public static void main(String[] args) {

        int n1, n2, n3, n4;
        JOptionPane.showMessageDialog(null,
                "Digite 4 números inteiros e saber qual é o maior",
                "Maior_número1", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Maior_número1", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Maior_número1", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Maior_número1", JOptionPane.QUESTION_MESSAGE));
        n4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o quarto número: ",
                "Maior_número1", JOptionPane.QUESTION_MESSAGE));

        if (n1 > n2 && n1 > n3 && n1 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n1),
                    "Maior_número1", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n1 && n2 > n3 && n2 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n2),
                    "v", JOptionPane.INFORMATION_MESSAGE);
        } else if (n3 > n1 && n3 > n2 && n3 > n4) {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n3),
                    "Maior_número1", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, String.format("O maior número entre os 4 é o %d", n4),
                    "Maior_número1", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
