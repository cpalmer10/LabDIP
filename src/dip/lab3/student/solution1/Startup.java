package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public class Startup {
    public static void main(String[] args) {
        MessageReader reader = new ConsoleReader();
        MessageWriter writer = new ConsoleWriter();
        MessageManager mgr = new MessageManager(reader, writer);
        
        //mgr.doRead();
        //mgr.doWrite();
        mgr.doMessage();
        
        //String message = 
    }
}
