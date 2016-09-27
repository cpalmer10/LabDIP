
package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public class MessageManager {
    private MessageReader reader;
    private MessageWriter writer;
    
    
    public MessageManager(MessageReader reader, MessageWriter writer){
        this.reader = reader;
        this.writer = writer;
    }
    
    public void doMessage(){
        writer.writeMessage(reader.readMessage());
    }
    
}
    
    
   
