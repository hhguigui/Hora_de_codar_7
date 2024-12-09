import javax.swing.*;

public class Geometria {
    public static void main(String[] args) {
        String[] options = {
                "Retângulo",
                "Quadrado",
                "Trapezio",
                "Círculo",
                "Triangulo",
                "Losango",
                "Paralelogramo",
        };

        JOptionPane.showMessageDialog(null,
                "Bem vindo ao mundo geometrico!");



        JComboBox<String> comboBoxOptions = new JComboBox<>(options);


        int result = JOptionPane.showConfirmDialog(null,
                comboBoxOptions,
                "Escolha uma forma geométrica:",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            String selectedShapeOpt = (String) comboBoxOptions.getSelectedItem();

            if (selectedShapeOpt.equals("Retângulo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do retângulo?",
                        "Retângulo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do retângulo?",
                        "Retângulo", JOptionPane.QUESTION_MESSAGE));

                double area = areaRetangulo(altura, base);

                JOptionPane.showMessageDialog(null,
                        "O retângulo tem uma area de " + area + " unidades quadradas!",
                        "Retângulo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Quadrado")) {
                double lado = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual o lado do quadrado?",
                        "Quadrado", JOptionPane.QUESTION_MESSAGE));

                double area = areaQuadrado(lado);

                JOptionPane.showMessageDialog(null,
                        "O quadrado tem uma area de " + area + " unidades quadradas!",
                        "Quadrado", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Trapezio")) {
                double baseMaior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base maior do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                double baseMenor = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base menor do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do trapezio?",
                        "Trapezio", JOptionPane.QUESTION_MESSAGE));

                double area = areaTrapezio(baseMaior, baseMenor, altura);

                JOptionPane.showMessageDialog(null,
                        "O trapezio tem uma area de " + area + " unidades quadradas!",
                        "Trapezio", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Círculo")) {
                double raio = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual o raio do círculo?",
                        "Círculo", JOptionPane.QUESTION_MESSAGE));

                double area = areaCirculo(raio);

                JOptionPane.showMessageDialog(null,
                        "O círculo tem uma area de " + area + " unidades quadradas!",
                        "Círculo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Triangulo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do triangulo?",
                        "Triangulo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do triangulo?",
                        "Triangulo", JOptionPane.QUESTION_MESSAGE));


                double area = areaTriangulo(base, altura);

                JOptionPane.showMessageDialog(null,
                        "O triangulo tem uma area de " + area + " unidades quadradas!",
                        "Triangulo", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Losango")) {
                double diagonalMaior = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a diagonal maior do losango?",
                        "Losango", JOptionPane.QUESTION_MESSAGE));

                double diagonalMenor = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a diagonal menor do losango?",
                        "Losango", JOptionPane.QUESTION_MESSAGE));

                double area = areaLosango(diagonalMaior, diagonalMenor);

                JOptionPane.showMessageDialog(null,
                        "O losango tem uma area de " + area + " unidades quadradas!",
                        "Losango", JOptionPane.INFORMATION_MESSAGE);
            }

            if (selectedShapeOpt.equals("Paralelogramo")) {
                double base = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a base do paralelogramo?",
                        "Paralelogramo", JOptionPane.QUESTION_MESSAGE));

                double altura = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Qual a altura do paralelogramo?",
                        "Paralelogramo", JOptionPane.QUESTION_MESSAGE));

                double area = areaRetangulo(altura, base);

                JOptionPane.showMessageDialog(null,
                        "O paralelogramo tem uma area de " + area + " unidades quadradas!",
                        "Paralelogramo", JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Cancelou");

            System.out.println("Cancelou");
        }

    }

    public static double areaRetangulo(double h, double b) {
        return h * b;
    }

    public static double areaQuadrado(double l) {
        return Math.pow(l, 2);
    }

    public static double areaLosango(double d1, double d2) {
        return (d1 * d2) / 2;
    }

    public static double areaTrapezio(double b1, double b2, double h) {
        return ((b1 + b2) * h) / 2;
    }

    public static double areaTriangulo(double b, double h) {
        return (b * h) / 2;
    }

    public static double areaCirculo(double r) {
        return Math.PI * Math.pow(r, 2);
    }
}