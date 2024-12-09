import javax.swing.JOptionPane;

public class Notas_do_aluno {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "Digite o números das notas do aluno e veremos se o aluno foi aprovado! ",
                "Notas_do_aluno", JOptionPane.INFORMATION_MESSAGE);

        double[] notas = new double[4];
        double media = 0;

        for (int i = 0; i < 4; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                    "Digite a " + (i + 1) + "º nota: ",
                    "Notas_do_aluno", JOptionPane.QUESTION_MESSAGE));

            if (notas[i] < 0 || notas[i] > 10) {
                JOptionPane.showMessageDialog(null,
                        "A nota deve estar entre 0 e 10! Tente novamente.",
                        "Notas_do_aluno", JOptionPane.ERROR_MESSAGE);
                i--;
            }
        }

        for (int i = 0; i < 4; i++) media += notas[i];

        media /= 4;

        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null,
                    String.format("Parabéns, voce foi aprovado! Sua média foi de %.2f", media),
                    "Notas_do_aluno", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    String.format("Que pena, voce foi reprovado! Sua média foi de %.2f", media),
                    "Notas_do_aluno", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
