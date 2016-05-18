import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Botón para irse al menú de piezas para iniciar el juego
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BPlay extends Boton
{
    
    /**
     * Act - lleva al menú de ensambles ya para iniciar el juego si 
     * se da click sobre él
     */
    public void act() 
    {
        // Add your action code here.
       
        if(Greenfoot.mouseClicked(this)){
            Transicion newWorld = new Transicion(1); //1 por que lleva al menú de piezas
          
            Greenfoot.setWorld(newWorld);
        }
        
        
    }    
}
