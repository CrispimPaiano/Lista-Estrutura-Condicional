import javax.swing.JOptionPane;

public class Exercicio22{
    
    public static void main(String[] args) {
        
        int quantidadeProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de produtos a comprar:"));
        double valorProduto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto a comprar"));
        double dinheiroPagamento = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do dinheiro para compra"));
        double totalProduto = valorProduto*quantidadeProduto;

        if (totalProduto>dinheiroPagamento) {
            JOptionPane.showMessageDialog(null, "Valor da compra: "+totalProduto+"\nSaldo insuficiente: "+(dinheiroPagamento-totalProduto));
        } else {
            JOptionPane.showMessageDialog(null, "Valor da compra: "+totalProduto+"\nTroco: "+(dinheiroPagamento-totalProduto));
        }

    }

}