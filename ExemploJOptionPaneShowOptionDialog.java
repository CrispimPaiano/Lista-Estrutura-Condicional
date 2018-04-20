import javax.swing.JOptionPane;

public class ExemploJOptionPaneShowOptionDialog{
    
    public static void main(String[] args) {
        
        int opcao = JOptionPane.showOptionDialog(
            null, 
            "Selecione o menu desejado", //messagem de texto
            "MENU DO SISTEMA", //título
            0, //opcao sim
            JOptionPane.WARNING_MESSAGE, //icone 
            null, 
            new Object[]{ //botões
                "Cadastro", "Edição", "Lista" //Opções
            },
            "Edição"
        );
 

        if(opcao == 1){
            JOptionPane.showMessageDialog(null, "Edição selecionada");
        }else if(opcao == 0){
            JOptionPane.showMessageDialog(null, "Cadastro selecionado");
        }else {
            JOptionPane.showMessageDialog(null, "Lista selecionada");
        }
    }

}