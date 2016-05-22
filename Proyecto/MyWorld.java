import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase principal, muestra el inicio del juego.
 * 
 * @author (Lilia y Esaú) 
 * @version (11.04.2016)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor para los objetos
     * 
     */
    //violinista v=new violinista();
    private GreenfootImage imag1;
   
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
          
        imag1=new GreenfootImage("m1.png");
        
        setBackground(imag1);
          
    }
    /**
     * usa las imágenes creadas en el constructor para hacer la transición entre
     * la pantalla principal para después llamar al menú principal.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            
            
            Name newWorld = new Name();
            Greenfoot.setWorld(newWorld);
        }
    }   
}
