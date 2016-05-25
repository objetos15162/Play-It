import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *  Esta clase representa a un boton que si es presionado nos generara una clase Transicion que le pasa a su constructor el numero 4
 * indicando que nos llevara al mundo del Cuarteto.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PCuarteto extends Boton
{
    /**
     * Act - llama a la trnasicion y le dice qué escenario cargar, en 
     * este caso es el del cuarteto
     */
    public void act() 
    {
        
        if(Greenfoot.mouseClicked(this)){
            Transicion newWorld = new Transicion(4); //4 porque llama al EscCuarteto
            Greenfoot.setWorld(newWorld);
        }
    }    
}
