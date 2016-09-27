
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class GuiReader implements MessageReader {
    private String message;
    private String[] tips ={
        "An apple a day keeps the doctor away.",
        "Always brush your teeth in the morning and night.",
        "If you don't have something nice to say, don't say it at all.",
        "Say cheese!",
        "Don't text and drive.",
        "Click it or ticket."
    };
    
    @Override
    public String tipOfDay(){
        int rnd = (int) Math.floor(Math.random() * 5);
        return tips[rnd];
    }
    @Override
    public String welcomeMsg(){
       return "Welcome!";
    }
    
    @Override
    public String readMessage(){
        return JOptionPane.showInputDialog(message);
    }
    
}
