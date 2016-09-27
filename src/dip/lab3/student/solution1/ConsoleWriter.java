
package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public class ConsoleWriter implements MessageWriter {
    
    private String output;
    private String[] tips ={
        "An apple a day keeps the doctor away.",
        "Always brush your teeth in the morning and night.",
        "If you don't have something nice to say, don't say it at all.",
        "Say cheese!",
        "Don't text and drive.",
        "Click it or ticket."
    };
    
    @Override
    public void tipOfDay(){
        int rnd = (int) Math.floor(Math.random() * 5);
        System.out.println(tips[rnd]);
    }
    @Override
    public void welcomeMsg(){
        System.out.println("Welcome!");
    }
    @Override
    public void write(){
        System.out.println(output);
    }
}
