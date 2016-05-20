import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * botón para regresar al menú principal
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BMainMenu extends Boton
{
    /**
     * Act - si se da click en él, se manda al menú principal
     */
    public void act() 
    {
   
       if(Greenfoot.mouseClicked(this)){
           Menu newWorld = new Menu();
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
