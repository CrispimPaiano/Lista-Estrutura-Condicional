import javax.swing.JOptionPane;

public class Exercicio01{

    public static void main(String[] args){

        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para verificar se é positivo"));

        if (numeroDigitado>0){
            System.out.println("Número positivo");
        }else if(numeroDigitado<=0){
            System.out.println("Não é número positivo");
        }

    }

}