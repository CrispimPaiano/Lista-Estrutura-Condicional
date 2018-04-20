import javax.swing.JOptionPane;

public class Exercicio16{

    public static void main(String[] args){

        double temperatura = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura do ambiente"));
        int escalaOrigem = Integer.parseInt(JOptionPane.showInputDialog("Digite a escala de temperatura origem: "
            +"\n1      |Celsius"
            +"\n2      |Farenheit"
            +"\n3      |Kelvin"));
        int escalaDestino = Integer.parseInt(JOptionPane.showInputDialog("Digite a escala de temperatura destino"
            +"\n1      |Celsius"
            +"\n2      |Farenheit"
            +"\n3      |Kelvin"));
        
        if (escalaOrigem==escalaDestino) {
            JOptionPane.showMessageDialog(null, "Mesma escala de temperatura");
        } else if ((escalaOrigem==1) && (escalaDestino==2)){
            JOptionPane.showMessageDialog(null, "Celsius para Farenheit: " + ((1.8*temperatura)+32));
        } else if ((escalaOrigem==1) && (escalaDestino==3)){
            JOptionPane.showMessageDialog(null, "Celsius para Kelvin: " + (temperatura+273));            
        } else if ((escalaOrigem==2) && (escalaDestino==1)){
            JOptionPane.showMessageDialog(null, "Farenheit para Celsius: " + ((temperatura-32)/1.8));         
        } else if ((escalaOrigem==2) && (escalaDestino==3)){
            JOptionPane.showMessageDialog(null, "Farenheit para Kelvin: " + (5/9*(temperatura-32)+273));          
        } else if ((escalaOrigem==3) && (escalaDestino==1)){
            JOptionPane.showMessageDialog(null, "Kelvin para Celsius: " + (temperatura-273));           
        } else if ((escalaOrigem==3) && (escalaDestino==2)){
            JOptionPane.showMessageDialog(null, "Kelvin para Farenheit: " + ((((temperatura-273)*9/5)+32)));            
        }

    }

}