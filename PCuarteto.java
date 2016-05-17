import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p_cuarteto here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PCuarteto extends BotonMenu
{
    /**
     * Act - do whatever the p_cuarteto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Transicion newWorld = new Transicion(4);
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
