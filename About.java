import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class about here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class About extends Boton
{
    /**
     * Act - do whatever the about wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Credito newWorld = new Credito();
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
