import javax.swing.JOptionPane;

public class Exercicio09 {

    public static void main(String[] args) {
        
        double quadrado1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado"));
        double quadrado2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado"));
        double quadrado3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado"));
        double quadrado4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto lado"));

        if (quadrado1==quadrado2 && quadrado2==quadrado3 && quadrado3==quadrado4){
            JOptionPane.showMessageDialog(null,"Os lados podem formar um quadrado");
        } else {
            JOptionPane.showMessageDialog(null,"Os lados podem não formar um quadrado");
        }

    }

}