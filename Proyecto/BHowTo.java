import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para llevar a las instrucciones del juego
 * llama a la clase ayuda
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BHowTo extends Boton
{
    /**
     * Act - si se da click en el botón, lleva a las pantallas de ayuda
     * 
     */
    public void act() 
    {
        // Add your action code here.
         if(Greenfoot.mouseClicked(this)){
            Ayuda newWorld = new Ayuda();
            Greenfoot.setWorld(newWorld);
        }
        
    }    
}
