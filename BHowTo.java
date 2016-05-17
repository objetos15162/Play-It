import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class how_to here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BHowTo extends Boton
{
    /**
     * Act - do whatever the how_to wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.mouseClicked(this))
        {
            Ayuda newWorld = new Ayuda();
            Greenfoot.setWorld(newWorld);
        }
        
    }    
}
