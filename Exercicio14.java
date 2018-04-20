import javax.swing.JOptionPane;

public class Exercicio14 {

    public static void main(String[] args) {
        
        Double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        Double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        Double numero3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro valor:"));

        if ((numero1<=numero2) && (numero2<=numero3)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 +" "+ numero2 +" "+ numero3);
        } else if ((numero1<=numero3) && (numero2>=numero3)){
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero1 +" "+ numero3 +" "+ numero2);
        } else if ((numero2<=numero1) && (numero1<=numero3)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero2 +" "+ numero1 +" "+ numero3);
        } else if ((numero2<=numero3) && (numero1>=numero3)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero2 +" "+ numero3 +" "+ numero1);
        } else if ((numero3<=numero1) && (numero1<=numero2)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero3 +" "+ numero1 +" "+ numero2);
        } else if ((numero3<=numero1) && (numero3<=numero2)) {
            JOptionPane.showMessageDialog(null, "Ordem crescente: " + numero3 +" "+ numero2 +" "+ numero1);
        }
    }

}