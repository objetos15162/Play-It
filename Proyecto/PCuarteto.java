import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que da a escoger el menú para decidir qué ensamble se va a usar
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
