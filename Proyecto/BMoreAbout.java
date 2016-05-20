import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class more_about here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BMoreAbout extends Boton
{
    /**
     * Act - lleva al mundo MoreAbout
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            MoreAbout newWorld = new MoreAbout(); 
            Greenfoot.setWorld(newWorld);
        }
    }    
}
