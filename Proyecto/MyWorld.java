import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase principal, muestra el inicio del juego.
 * 
 * @author (Lilia y Esaú) 
 * @version (11.04.2016)
 */
public class MyWorld extends World
{
    private GreenfootImage imag1;
   private GreenfootImage imag2;
    private GreenfootImage imag3;
    private GreenfootImage imag4;
     /**
     * Constructor para los objetos
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
          
        imag1=new GreenfootImage("m1.png");
        imag2=new GreenfootImage("m2.png");
        imag3=new GreenfootImage("m3.png");
        imag4=new GreenfootImage("m4.png");
        setBackground(imag1);
          
    }
    private void makeAnimation(){
            Greenfoot.delay(2);
            setBackground(imag2);
            Greenfoot.delay(2);
            setBackground(imag3);
            Greenfoot.delay(2);
            setBackground(imag4);
            Greenfoot.delay(2);
    }
    /**
     * usa las imágenes creadas en el constructor para hacer la transición entre
     * la pantalla principal para después llamar al menú principal.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            this.makeAnimation();
            Menu newWorld = new Menu();
            Greenfoot.setWorld(newWorld);
        }
    }   
}
