import javax.swing.JOptionPane;

public class Soma_dos_Maiores {
    public static void main(String[] args) {

        int n1, n2, n3;

        JOptionPane.showMessageDialog(null,
        "Digite 3 números inteiros e somaremos os dois maiores!",
                "Soma dos Maiores", JOptionPane.INFORMATION_MESSAGE);

        n1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));
        n2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));
        n3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o terceiro número: ",
                "Soma dos Maiores", JOptionPane.QUESTION_MESSAGE));

        int somaDosMaiores;

        if (n1 <= n2 && n1 <= n3) {
            somaDosMaiores = n2 + n3;
        } else if (n2 <= n1 && n2 <= n3) {
            somaDosMaiores = n1 + n3;
        } else {
            somaDosMaiores = n1 + n2;
        }

        JOptionPane.showMessageDialog(null, String.format("A soma dos dois maiores é %d", somaDosMaiores),
                "Soma dos Maiores", JOptionPane.INFORMATION_MESSAGE);

    }
}
