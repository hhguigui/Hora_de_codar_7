import javax.swing.*;

public class Media1 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros;

        int n1, n2;
        int[] numbers = null;
        int sum = 0;

        JOptionPane.showMessageDialog(null,
                "Digite 2 números inteiros para calcularemos a média dos numeros",
                "Média 1", JOptionPane.INFORMATION_MESSAGE);


        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Média 1", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número, que deverá ser maior que o primeiro: ",
                "Média 1", JOptionPane.QUESTION_MESSAGE));

        if (n2 > n1) {
            for (int Gui = n1; Gui <= n2; Gui++) {
                numbers = new int[n2 - n1 + 1]; // cria um array com o tamanho da diferença entre os dois numeros
                numbers[Gui - n1] = Gui; // adiciona o numero no array
                sum += Gui; // soma o numero
            }
            double media = (double) sum / numbers.length;
            System.out.println(media + "," + sum + "," + numbers.length);
            JOptionPane.showMessageDialog(null, String.format("A média dos números entre %d e %d é %.2f", n1, n2, media),
                    "Média 1", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(null, "O segundo número deverá ser maior que o primeiro!",
                    "Média 1", JOptionPane.ERROR_MESSAGE);
        }


    }
}
