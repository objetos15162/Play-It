import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para llevar al usuario a los créditos del programa
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class About extends Boton
{
    /**
     * Act - si se le da click, se va a la pantalla de Crédito
     */
    public void act() 
    {
        //si el mouse hace click...
        if(Greenfoot.mouseClicked(this)){
            Credito newWorld = new Credito();
          
            Greenfoot.setWorld(newWorld);
        }
    }    
}
