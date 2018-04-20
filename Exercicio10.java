import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
        
        double retangulo1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado"));
        double retangulo2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado"));
        double retangulo3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado"));
        double retangulo4 = Double.parseDouble(JOptionPane.showInputDialog("Digite o quarto lado"));

        if (retangulo1==retangulo3 && retangulo2==retangulo4 && retangulo1!=retangulo2){
            JOptionPane.showMessageDialog(null,"Os lados podem formar um retângulo");
        } else {
            JOptionPane.showMessageDialog(null,"Os lados podem não formar um retângulo");
        }

    }

}