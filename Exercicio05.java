import javax.swing.JOptionPane;

public class Exercicio05{

    public static void main(String[] args){

        Double numeroPar = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para verificar se é impar"));

        if (numeroPar%2!=0 && numeroPar==0){
            System.out.println("Número impar");
        }else{
            System.out.println("Não é número impar");
        }

    }

}