import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escenario here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Escenario extends World
{

    /**
     * Constructor for objects of class Escenario.
     * 
     */
    
    private Integer x=3;
    
    public Escenario()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
}
  
    
    private void prepare()
    {


        Violistaa violistaa = new Violistaa();
        addObject(violistaa,253,238);
        Violinistab violinistab = new Violinistab();
        addObject(violinistab,106,256);
        Violinistaa violinistaa = new Violinistaa();
        addObject(violinistaa,198,278);
        
        Cellistab cellistab = new Cellistab();
        addObject(cellistab,420,253);
        cellistab.setLocation(400,239);
        cellistab.setLocation(408,232);
        cellistab.setLocation(410,238);
}
    
}
