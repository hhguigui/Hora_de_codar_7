import javax.swing.*;

public class Media {
    public static void main(String[] args) {


        double media = 0;
        int[] numbers = new int[10];


        JOptionPane.showMessageDialog(null,
                "Digite 10 números inteiros para calcular a média! ",
                "Média", JOptionPane.INFORMATION_MESSAGE);

        for (int Gui = 0; Gui < 10; Gui++) {
            numbers[Gui] = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Digite o " + (Gui + 1) + " número: ",
                    "Média", JOptionPane.QUESTION_MESSAGE));


            if (numbers[Gui] < 0) {
                JOptionPane.showMessageDialog(null,
                        "O número deve ser positivo! Tente novamente.",
                        "Média", JOptionPane.ERROR_MESSAGE);

                Gui--;
            }
        }

        for (int i = 0; i < 10; i++) media += numbers[i];

        media /= 10;


        JOptionPane.showMessageDialog(null,
                String.format("A média dos numeros digitados é: %.2f", media),
                "Média", JOptionPane.INFORMATION_MESSAGE);
    }
}
