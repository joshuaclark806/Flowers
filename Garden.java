import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;
/**
 * Based on the ecs 100 template
 * create some flower objects and make them grow
 * Name: Josh Clark
 * Date: 15/04/2021
 */
public class Garden{
    // instance variables (or fields)
    private Flower f1 = new Flower(100, 200, 20, 50, Color.blue);
    private Flower f2 = new Flower(200, 200, 30, 50, Color.pink);
    private Flower f3 = new Flower(300, 200, 10, 50, Color.red);
    
    /** 
     * code for initialising quit button
    */
    public Garden(){
        UI.initialise();
        UI.addButton("Quit", UI::quit);
        UI.addButton("Grow", this::growGarden);
    }

    /**
     * script to animate drawing of the flowers
     */
    public void growGarden()
    {
        // draw in the flowers
        f1.draw();
        f1.draw();
        f1.draw();
        // grow the flowers
        f1.grow();
        f2.grow();
        f1.grow();
        f3.grow();
    }
    
    /**
     * main method for creating instance of garden
     */
    public static void main(String[] args){
        Garden obj = new Garden();
    }

}

