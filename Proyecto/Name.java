import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Name here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Name extends World
{

    /**
     * Constructor for objects of class Name.
     * 
     */
    
    private GreenfootImage imag2;
    private GreenfootImage imag3;
    private GreenfootImage imag4;
    public Name()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        imag2=new GreenfootImage("m2.png");
        imag3=new GreenfootImage("m3.png");
        imag4=new GreenfootImage("m4.png");
        
        
          
        
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.delay(2);
            setBackground(imag2);
            Greenfoot.delay(2);
            setBackground(imag3);
            Greenfoot.delay(2);
            setBackground(imag4);
            Greenfoot.delay(2);
        Menu newWorld = new Menu();
        Greenfoot.setWorld(newWorld);
        }
    }
}
