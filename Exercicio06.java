import javax.swing.JOptionPane;

public class Exercicio06{

    public static void main(String[] args){

        Double numeroDigitado = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para verificar se é número um"));

        if (numeroDigitado!=1){
            System.out.println("Número diferente de um");
        }else{
            System.out.println("Número um");
        }

    }

}