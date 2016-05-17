import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Menú principal del juego
 * 
 * @author (Lilia y Esaú) 
 * @version (11.04.2016)
 */
public class Menu extends World
{

    /**
     * Constructor para los elementos del Menú
     * 
     */
    
    private Boton play,about,howt;
    private GreenfootImage ima1;
    /**
     * Constructor del Menú
     * 
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(600, 400, 1); 
        ima1=new GreenfootImage("m4.png");
        setBackground(ima1);
        prepare();
    }
       /**
     * actúa
     * 
     * 
     */
    public void act()
    {
       

    }
    
    /**
     * Prepara el menú colocando los botones necesarios
     * 
     */
    private void prepare()
    {
        About about = new About();
        addObject(about,488,272);
        BHowTo how_to = new BHowTo();
        addObject(how_to,120,273);
        BPlay play = new BPlay();
        addObject(play,303,274);

        BQuit quit = new BQuit();
        addObject(quit,34,33);
        quit.setLocation(27,30);
    }
}
