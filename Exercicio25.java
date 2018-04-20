import javax.swing.JOptionPane;

public class Exercicio25 {

    public static void main(String[] args) {
        
        double valorCompra = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da compra"));
        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o percentual desconto recebido"));
        double descontoValor = (valorCompra/100)*percentualDesconto;

        JOptionPane.showMessageDialog(null, "Valor do desconto recebido: "+descontoValor);

    }
    
}