import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class quit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class quit extends botones
{
    /**
     * Act - do whatever the quit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
        Greenfoot.stop();
        
        }
    }    
}
