import javax.swing.JOptionPane;

public class Exercicio03{

    public static void main(String[] args){

        double numeroUm = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double numeroDois = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));
        int operacaoMatematico = Integer.parseInt(JOptionPane.showInputDialog("           MENU"
           + "\n1:      somar"
           + "\n2:      subtrair"
           + "\n3:      multiplicar"
           + "\n4:      dividir"));

        if(operacaoMatematico==1){
            JOptionPane.showMessageDialog(null,"O resultado é: "+(numeroUm+numeroDois));
        }else if(operacaoMatematico==2){
            JOptionPane.showMessageDialog(null,"O resultado é: "+(numeroUm-numeroDois));
        }else if(operacaoMatematico==3){
            JOptionPane.showMessageDialog(null,"O resultado é: "+(numeroUm*numeroDois));
        }else if(operacaoMatematico==4){
            JOptionPane.showMessageDialog(null,"O resultado é: "+(numeroUm/numeroDois));
        }else{
            JOptionPane.showMessageDialog(null,"Operacao matematica invalida");
        }      

    }

}