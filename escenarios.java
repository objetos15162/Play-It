import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class escenarios here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class escenarios extends World
{

    /**
     * Constructor for objects of class escenarios.
     * 
     */
    public escenarios()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
      
    }
    private void prepare()
    {
        vidas vidas = new vidas();
        addObject(vidas,574,368);
        vidas.setLocation(570,363);
        vidas vidas2 = new vidas();
        addObject(vidas2,548,368);
        vidas2.setLocation(545,364);
        vidas vidas3 = new vidas();
        addObject(vidas3,525,374);
        vidas3.setLocation(519,363);
        vidas3.setLocation(521,365);
        vidas vidas4 = new vidas();
        addObject(vidas4,500,370);
        vidas4.setLocation(497,365);
        vidas vidas5 = new vidas();
        addObject(vidas5,476,372);
        vidas5.setLocation(473,365);
    }
    
    
    
}
