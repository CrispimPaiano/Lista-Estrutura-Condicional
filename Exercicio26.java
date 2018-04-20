import javax.swing.JOptionPane;

public class Exercicio26 {

    public static void main(String[] args) {
        
        double valorDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra"));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o percentual desconto recebido"));
        double valorCompra = (valorDesconto*100)/percentualDesconto;

        JOptionPane.showMessageDialog(null, "Valor da compra: "+valorCompra);

    }
    
}