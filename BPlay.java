import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class play here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BPlay extends Boton
{
    /**
     * Act - do whatever the play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BPlay()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
       
        if(Greenfoot.mouseClicked(this))
        {
            Transicion newWorld = new Transicion(1);
          
            Greenfoot.setWorld(newWorld);
        }
        
        
    }    
}
