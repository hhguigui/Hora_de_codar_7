import javax.swing.*;

public class Divisão {
    public static void main(String[] args) {


        double n1, n2;

        JOptionPane.showMessageDialog(null,
                "Digite 2 números e depois e dividiremos ",
                "Divisão", JOptionPane.INFORMATION_MESSAGE);

        while (true) {
            n1 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o primeiro número: ",
                    "Divisão", JOptionPane.QUESTION_MESSAGE));
            n2 = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite o segundo número: ",
                    "Divisão", JOptionPane.QUESTION_MESSAGE));

            if (n2 == 0) {
                JOptionPane.showMessageDialog(null,
                        "O segundo número deve ser diferente de zero! Tente novamente.",
                        "Divisão", JOptionPane.ERROR_MESSAGE);
            } else {
                double result = n1 / n2;
                JOptionPane.showMessageDialog(null,
                        String.format("O resultado da divisão é: %.2f", result),
                        "Divisão", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}
