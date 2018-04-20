import javax.swing.JOptionPane;

public class Exercicio21 {

    public static void main(String[] args) {
        
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro lado do triângulo"));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo lado do triângulo"));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro lado do triângulo"));

        if (ladoA==ladoB && ladoB==ladoC) {
            JOptionPane.showMessageDialog(null,"Triângulo equilátero: os três lados são iguais");
        } else if(ladoA==ladoB||ladoB==ladoC||ladoA==ladoC){
            JOptionPane.showMessageDialog(null,"Triângulo isósceles: dois lados são iguais"); 
        } else {
            JOptionPane.showMessageDialog(null,"Triângulo escaleno: três lados são diferentes");
        }

    }
    
}