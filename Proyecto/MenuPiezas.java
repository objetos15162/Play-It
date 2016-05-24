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
    private PDueto pdueto;
    private PTrio ptrio;
    private PCuarteto pcuarteto;
    private BMainMenu mainmenu;
    
    
    public MenuPiezas()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400,1);
        ima1 = new GreenfootImage("choose.png");
        pdueto = new PDueto();
        mainmenu = new BMainMenu();
        ptrio = new PTrio();
        pcuarteto = new PCuarteto();
        
        prepare();
    }
    
    public void prepare()
    {
        getBackground().drawImage(ima1,75,0);
        
        addObject(pdueto,105,264);
        
        addObject(ptrio,294,264);
        
        addObject(pcuarteto,482,264);
        addObject(mainmenu,27,384);
        
    }
    
}
