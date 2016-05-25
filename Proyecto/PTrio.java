import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa a un boton que si es presionado nos generara una clase Transicion que le pasa a su constructor el numero 3
 * indicando que nos llevara al mundo del Trio.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PTrio extends Boton
{
    /**
     * Act - llama a la transicion y le dice qué escenario cargar, en 
     * este caso es el del trio
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Transicion newWorld = new Transicion(3); // para cargar el EscTrio
            Greenfoot.setWorld(newWorld);
        }
    }    
}
