
package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public class ConsoleWriter implements MessageWriter {
   
    @Override
    public void writeMessage(String message){
        System.out.println(message);
    }
}
