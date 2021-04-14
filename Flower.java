import ecs100.*;
import java.awt.Color;
/**
 * support class for creating Flower 
 * draws a flower of given size and colour
 * can grow
 *
 * @author Josh Clark
 * @version 13/04/2021
 */
public class Flower
{
    // instance variables
    private double flowerX = -100;      // x position of flower
    private double flowerY = -100;      // y position of flower
    
    private int flowerSize;             // flower size
    private int flowerHeight;           // flower height
    private Color Colour;               // flower colour
    
    private double left;                // left of flower
    private double top;                 // top of flower
    private double bottom;              // bottom of flower

    /**
     * Constructor for objects of class Flower
     */
    public Flower(double x, double y, int size, int stem, Color col)
    {
        // initialise instance variables
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.Colour = col;
        
        // set top left and bottom
        this.setTop();
        this.setLeft();
        this.setBottom();
    }

    /**
     * alternative constructor for flower, without color col param
     * colour set as blue instead so that it can work
     
    public Flower(double x, double y, int size, int stem)
    {
        // initialise instance variables
        this.flowerX = x;
        this.flowerY = y;
        this.flowerSize = size;
        this.flowerHeight = stem;
        this.Colour = Color.blue;
        
        // set top left and bottom
        this.setTop();
        this.setLeft();
        this.setBottom();
    }
    */
    
    /**
     * Set left
     */
    public void setLeft()
    {
        this.left = this.flowerX - this.flowerSize/2.0;
    }
    /**
     * Set top
     */
    public void setTop()
    {
        this.top = this.flowerY - this.flowerSize/2.0;
    }
    /**
     * Set bottom
     */
    public void setBottom()
    {
        this.bottom = this.flowerY + this.flowerHeight/2.0;
    }
    
    /**
     * draw method
     */
    public void draw()
    {
        // draw the stem
        UI.setLineWidth(2);
        UI.setColor(Color.green);
        UI.drawLine(flowerX, flowerY, flowerX, bottom);
        
        // draw flower
        UI.setColor(this.Colour);                           // set colour
        UI.fillOval(left, top, flowerSize, flowerSize);     // draw circle
        UI.sleep(500);                                      // wait
    }
    
    /**
     * erase a rectangle around the flower object
     */
    public void erase()
    {
        UI.eraseRect(left, top, flowerSize+1, bottom+1);    // erase a rectangle around the flower
    }
    
    /**
     * make the flower grow
     */
    public void grow()
    {
        this.erase();           // erase a rectangle around the flower
        this.flowerY -= 10;     // increase the height
        this.flowerSize += 10;  // increase the bulb
        
        this.setTop();
        this.setLeft();
        this.draw();
    }
    
    
}
