
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
    public void doRead(){
        
    }
    
    public void doWrite(){
        
    }
    private String[] tips ={
        "An apple a day keeps the doctor away.",
        "Always brush your teeth in the morning and night.",
        "If you don't have something nice to say, don't say it at all.",
        "Say cheese!",
        "Don't text and drive.",
        "Click it or ticket."
    };
    
    public void tipOfDay(){
        int rnd = (int) Math.floor(Math.random() * 5);
        System.out.println(tips[rnd]);
    }
    
    public void welcomeMsg(){
        System.out.println("Welcome!");
    }
}
