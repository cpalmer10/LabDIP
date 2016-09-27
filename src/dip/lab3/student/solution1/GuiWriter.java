
package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public class GuiWriter extends RandomWriter implements Writer {
    
    private String output;
    
    @Override
    public void write(){
        System.out.println(output);
    }
}
