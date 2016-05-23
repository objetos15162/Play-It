import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class EndGame here.
 * 
 * @author (Esau & Lilia) 
 * @version (Mayo 2016)
 */
public class EndGame extends World
{
    private Usuario player;
    /**
     * Constructor for objects of class EndGame.
     * 
     */
    public EndGame(int v)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = new Usuario();
        player.setPoints(v);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Name newWorld = new Name(player);
            Greenfoot.setWorld(newWorld);
        }
    }
    
}
