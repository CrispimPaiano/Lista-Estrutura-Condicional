import javax.swing.JOptionPane;

public class Exercicio07{

    public static void main(String[] args){

        int numeroDigitado = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor qualquer para verificar"));

        if (numeroDigitado%2==0 && numeroDigitado!=0){
            System.out.println("Número par");
        }else if(numeroDigitado%2!=0 && numeroDigitado!=0){
            System.out.println("Número impar");
        }else{
            System.out.println("Número neutro");
        }

        if (numeroDigitado>0){
            System.out.println("Número positivo");
        }else if(numeroDigitado<0){
            System.out.println("Número negativo");
        }

        if (numeroDigitado>10){
            System.out.println("Número maior que 10");
        }

        if (numeroDigitado<=50){
            System.out.println("Número menor ou igual a 50");
        }

        if (numeroDigitado<-10){
            System.out.println("Número menor -10");
        }

        if (numeroDigitado>=30){
            System.out.println("Número maoir que 30");
        }

        if (numeroDigitado!=1){
            System.out.println("Número diferente de 1");
        }

    }

}