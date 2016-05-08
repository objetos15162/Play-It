import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esc_cuarteto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class esc_cuarteto extends escenarios
{

    /**
     * Constructor for objects of class esc_cuarteto.
     * 
     */
    public esc_cuarteto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        violistaa violistaa = new violistaa();
        addObject(violistaa,329,228);
        violistaa.setLocation(342,250);
        violinistaa violinistaa = new violinistaa();
        addObject(violinistaa,235,250);
        violinistab violinistab = new violinistab();
        addObject(violinistab,197,285);
        violinistaa.setLocation(270,262);
        cellistab cellistab = new cellistab();
        addObject(cellistab,447,277);

        main_menu main_menu3 = new main_menu();
        addObject(main_menu3,36,387);
        main_menu3.setLocation(28,385);
        lineas4 lineas4 = new lineas4();
        addObject(lineas4,349,101);

        
        violistaa.setLocation(340,272);
        violinistaa.setLocation(247,272);
        violinistab.setLocation(171,280);
        violinistab.setLocation(157,284);
        cello cello2 = new cello();
        addObject(cello2,89,187);
        cello2.setLocation(81,183);
    }
}
