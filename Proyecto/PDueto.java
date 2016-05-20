import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que da a escoger el menú para decidir qué ensamble se va a usar
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class PDueto extends Boton
{
    /**
     * Act - llama a la trnasicion y le dice qué escenario cargar, en 
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
