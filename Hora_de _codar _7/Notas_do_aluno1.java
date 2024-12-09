import javax.swing.JOptionPane;

public class Notas_do_aluno1 {
    public static void main(String[] args) {
        // TODO: Tratamento de erros

        JOptionPane.showMessageDialog(null,
                "digite o números das notas do aluno e veremos se o aluno foi aprovado! ",
                "Notas", JOptionPane.INFORMATION_MESSAGE);

        double[] notas;


        do {

            double media = 0;
            notas = new double[6];

            for (int i = 0; i < notas.length; i++) {
                notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,
                        "Digite a " + (i + 1) + "º nota: ",
                        "Notas", JOptionPane.QUESTION_MESSAGE));

                if (notas[i] < 0 || notas[i] > 10) {
                    JOptionPane.showMessageDialog(null,
                            "A nota deve estar entre 0 e 10! Tente novamente.",
                            "Notas", JOptionPane.ERROR_MESSAGE);
                    // Remove the number from the array
                    i--;
                }
            }

            for (double nota : notas) media += nota;
            System.out.print(media + "," + notas.length);

            media /= 6;

            if (media >= 6.5) {
                JOptionPane.showMessageDialog(null,
                        String.format("Parabéns, voce foi aprovado! Sua média foi de %.2f", media),
                        "Notas", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        String.format("Que pena, voce foi reprovado! Sua média foi de %.2f", media),
                        "Notas", JOptionPane.INFORMATION_MESSAGE);
            }

        } while (JOptionPane.NO_OPTION != JOptionPane.showOptionDialog(null,
                "Deseja calcular novamente?",
                "Notas", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null, null, null));
    }
}