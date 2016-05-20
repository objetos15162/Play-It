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
    private GreenfootImage ima1;
    private PDueto p_dueto;
    private PTrio p_trio;
    private PCuarteto p_cuarteto;
    private BMainMenu main_menu;
    
    
    public MenuPiezas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400,1);
        ima1 = new GreenfootImage("choose.png");
        p_dueto = new PDueto();
        main_menu = new BMainMenu();
        p_trio = new PTrio();
        p_cuarteto = new PCuarteto();
        
        prepare();
    }
    
    public void prepare()
    {
        getBackground().drawImage(ima1,75,0);
        
        addObject(p_dueto,105,264);
        
        addObject(p_trio,294,264);
        
        addObject(p_cuarteto,482,264);
        addObject(main_menu,27,384);
        
    }
    
}
