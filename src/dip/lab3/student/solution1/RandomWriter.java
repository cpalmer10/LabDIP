/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Chris
 */
public abstract class RandomWriter {
    private String[] tips ={
        "An apple a day keeps the doctor away.",
        "Always brush your teeth in the morning and night.",
        "If you don't have something nice to say, don't say it at all.",
        "Say cheese!",
        "Don't text and drive.",
        "Click it or ticket."};
    public void tipOfDay(){
        int rnd = (int) Math.floor(Math.random() * 5);
        System.out.println(tips[rnd]);
    }
    public void welcomeMsg(){
        System.out.println("Welcome!");
    }
    
}
