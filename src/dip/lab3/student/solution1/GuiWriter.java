
package dip.lab3.student.solution1;
import javax.swing.JOptionPane;
/**
 *
 * @author Chris
 */
public class GuiWriter implements MessageWriter {
  
    @Override
    public void writeMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
}
