import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main_menu here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BMainMenu extends Boton
{
    /**
     * Act - do whatever the main_menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       if(Greenfoot.mouseClicked(this))
       {
        Menu newWorld = new Menu();
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
