import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el dueto
 * 
 * @author (Esaú y Lilia) 
 * @version (21.04.2016)
 */
public class esc_dueto extends escenarios
{

    /**
     * Constructor para la clase dueto
     * 
     */
    public esc_dueto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        prepare();
    }

    /**
     * Crea los objetos y botones necesarios 
     */
    private void prepare()
    {
        pianistaa pianistaa = new pianistaa();
        addObject(pianistaa,256,208);
        cellistab cellistab = new cellistab();
        addObject(cellistab,388,251);
        main_menu main_menu3 = new main_menu();
        addObject(main_menu3,43,383);
        main_menu3.setLocation(26,383);

        lineas2 lineas2 = new lineas2();
        addObject(lineas2,354,103);
        lineas2.setLocation(351,93);
        piano piano = new piano();
        addObject(piano,88,58);
        piano.setLocation(90,58);
        cello cello = new cello();
        addObject(cello,81,135);
        cello.setLocation(79,128);
        cello.setLocation(87,123);
    }
}
