import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class ExemploJOptionICone{
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, 
            "Olá Mundo",
            "Sistema da vovó",
            JOptionPane.WARNING_MESSAGE,
            new ImageIcon(
                ExemploJOptionICone.class.getResource("/imagens/dragon.png")
            )
        );

    }
}