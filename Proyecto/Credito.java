import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * muestra los créditos
 * 
 * @author (Lilia y Esaú) 
 * @version (11.04.2016)
 */
public class Credito extends World
{

    /**
     * Constructor for objects of class credits.
     * 
     */
    private BMainMenu main_menu;
    public Credito()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
         main_menu = new BMainMenu();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(main_menu,23,383);
    }
}
