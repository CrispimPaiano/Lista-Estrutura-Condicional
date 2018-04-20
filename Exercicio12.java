import javax.swing.JOptionPane;

public class Exercicio12 {

    public static void main(String[] args) {
        
        Double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        Double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));

        if (numero1>numero2) {
            JOptionPane.showMessageDialog(null, "O primeiro valor é maior: " + numero1);
        } else if(numero1<numero2){
            JOptionPane.showMessageDialog(null, "O segundo valor é maior: " + numero2);
        } else {
            JOptionPane.showMessageDialog(null, "São iguais"); 
        }

    }

}