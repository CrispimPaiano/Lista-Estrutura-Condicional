import javax.swing.JOptionPane;

public class Exercicio04{

    public static void main(String[] args){

        Double numeroPar = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para verificar se é par"));

        if (numeroPar%2==0 && numeroPar==0){
            System.out.println("Número par");
        }else{
            System.out.println("Não é número par");
        }

    }

}