import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase escenarios que contiene los escenarios de los distintos duetos
 * 
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Ensamble extends World
{

    /**
     * Constructor for objects of class escenarios.
     * 
     */
    public Ensamble()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
      
    }
    private void prepare()
    {
        Vida vidas = new Vida();
        addObject(vidas,574,368);
        vidas.setLocation(570,363);
        Vida vidas2 = new Vida();
        addObject(vidas2,548,368);
        vidas2.setLocation(545,364);
        Vida vidas3 = new Vida();
        addObject(vidas3,525,374);
        vidas3.setLocation(519,363);
        vidas3.setLocation(521,365);
        Vida vidas4 = new Vida();
        addObject(vidas4,500,370);
        vidas4.setLocation(497,365);
        Vida vidas5 = new Vida();
        addObject(vidas5,476,372);
        vidas5.setLocation(473,365);
    }
    
    
    
}
