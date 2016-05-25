import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa a un boton que si es presionado nos generara una clase Transicion que le pasa a su constructor el numero 2
 * indicando que nos llevara al mundo del Dueto.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PDueto extends Boton
{
    /**
     * Act - llama a la transicion y le dice qué escenario cargar, en 
     * este caso es el del dueto
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){
            Transicion newWorld = new Transicion(2);//2 porque va a cargar EscDueto
            Greenfoot.setWorld(newWorld);  
        }
    }    
}
