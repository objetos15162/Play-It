import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EndGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndGame extends World
{

    /**
     * Constructor for objects of class EndGame.
     * 
     */
    private Usuario player;
    public EndGame(int v)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Usuario();
        //Name miMundo 
        //player= getPlayer();
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Scores newWorld = new Scores();
            Greenfoot.setWorld(newWorld);
        }
    }
    
}
