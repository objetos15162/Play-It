import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * clase que lleva a más informacion sobre la música de cámara
 * 
 * @author (EsauBz & Lilia) 
 * @version (Mayo 2016)
 */
public class MoreAbout extends World 
{
/**
     * Constructor
     * 
     */
     BMainMenu mainmenu;
    public MoreAbout()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        mainmenu = new BMainMenu();
        prepare();
    }

    /**
     * Prepara el mundo
     */
    private void prepare()
    {
        
        addObject(mainmenu,23,383);
    }
}
