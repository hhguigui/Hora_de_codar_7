import javax.swing.*;

public class Qual_seu_nome {
    public static void main(String[] args) {

        String userName = JOptionPane.showInputDialog(null,
                "Qual o seu nome?");

        int useridad = Integer.parseInt(JOptionPane.showInputDialog(null,
                String.format("Qual a sua idade?", userName)));

        JOptionPane.showMessageDialog(null,
                String.format("Seu nome é %s e sua idade é %d anos.", userName, useridad));
    }
}
