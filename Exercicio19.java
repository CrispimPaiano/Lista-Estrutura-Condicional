import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {
        
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite seu saldo"));
        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor depositado na conta"));
        double parcelaEmprestimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do emprestimo da parcela"));
        double valorSaques = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do seu saque"));
        double Totalsaldo = (saldo+valorDeposito)-(parcelaEmprestimo+valorSaques); 

        if (Totalsaldo>0){
            JOptionPane.showMessageDialog(null,"STATUS:"+"\nsaldo positivo:\n"+Totalsaldo);
        } else if (Totalsaldo<0){
            JOptionPane.showMessageDialog(null,"STATUS:"+"\nsaldo negativo:\n"+Totalsaldo);
        } else{
            JOptionPane.showMessageDialog(null,"STATUS:"+"\nsaldo neutro:\n"+Totalsaldo);
        }

    }
    
}