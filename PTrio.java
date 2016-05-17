import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p_trio here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PTrio extends BotonMenu
{
    /**
     * Act - do whatever the p_trio wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this))
        {
            Transicion newWorld = new Transicion(3);
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
