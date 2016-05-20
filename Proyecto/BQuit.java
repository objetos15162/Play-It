import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase botón para detener el juego
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BQuit extends Boton
{
    /**
     * Act - detiene el juego si se da click sobre el botón
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.stop();
        
        }
    }    
}
