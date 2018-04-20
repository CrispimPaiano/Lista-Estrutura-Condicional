import javax.swing.JOptionPane;

public class Exercicio20 {

    public static void main(String[] args) {
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso"));
        double imc = peso/(altura*altura);

        if (imc<10) {
            JOptionPane.showMessageDialog(null,"IMC: Desnutrição Grau V\n"+imc);
        } else if(imc<13){
            JOptionPane.showMessageDialog(null,"IMC: Desnutrição Grau IV\n"+imc); 
        } else if(imc<16){
            JOptionPane.showMessageDialog(null,"IMC: Desnutrição Grau III\n"+imc);
        } else if(imc<17){
            JOptionPane.showMessageDialog(null,"IMC: Desnutrição Grau II\n"+imc);
        } else if(imc<18.5){
            JOptionPane.showMessageDialog(null,"IMC: Desnutrição Grau I\n"+imc); 
        } else if(imc<25){
            JOptionPane.showMessageDialog(null,"IMC: Normal\n"+imc);   
        } else if(imc<30){
            JOptionPane.showMessageDialog(null,"IMC: Pré-obesidade\n"+imc);  
        } else if(imc<35){
            JOptionPane.showMessageDialog(null,"IMC: Obesidade Grau I\n"+imc); 
        } else if(imc<40){
            JOptionPane.showMessageDialog(null,"IMC: Obesidade Grau II\n"+imc);
        } else{
            JOptionPane.showMessageDialog(null,"IMC: Obesidade Grau III\n"+imc); 
        }

    }
    
}