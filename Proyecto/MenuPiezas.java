import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Muestra el menú de las piezas para jugar
 * 
 * @author (Lilia & Esaú) 
 * @version (april & may 2016)
 */
public class MenuPiezas extends World
{

    /**
     * Constructor para la clase menu_piezas.
     * 
     */
    public MenuPiezas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    public void act()
    {
        /*Escenario n_w = new Escenario();
        Greenfoot.setWorld(n_w);*/
    }
    
    public void prepare()
    {

        PDueto p_dueto = new PDueto();
        addObject(p_dueto,105,264);
        PTrio p_trio = new PTrio();
        addObject(p_trio,294,264);
        PCuarteto p_cuarteto = new PCuarteto();
        addObject(p_cuarteto,482,264);
       
        Choose choose = new Choose();
        addObject(choose,298,71);
        
        BMainMenu main_menu = new BMainMenu();
        addObject(main_menu,27,384);
        
    }
}
