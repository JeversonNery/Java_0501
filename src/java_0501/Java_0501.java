
package java_0501;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0501 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cep = JOptionPane.showInputDialog(null, "Informe seu CEP (só números): ");
        
        JOptionPane.showMessageDialog(null, cep.substring(0, 5) + "-" + cep.subSequence(5, 8));
    }
    
}
