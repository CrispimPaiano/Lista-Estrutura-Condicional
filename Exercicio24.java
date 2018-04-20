import javax.swing.JOptionPane;

public class Exercicio24 {

    public static void main(String[] args) {
        
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra"));
        double valorDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do desconto recebido"));
        double descontoValor = (valorDesconto*100)/valorCompra;

        JOptionPane.showMessageDialog(null, "Valor do percentual do recebido: %"+descontoValor);

    }
    
}