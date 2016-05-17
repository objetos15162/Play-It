import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu_piezas here.
 * 
 * @author (Lilia & Esaú) 
 * @version (april & may 2016)
 */
public class MenuPiezas extends World
{

    /**
     * Constructor for objects of class menu_piezas.
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
        addObject(p_dueto,123,208);
        PTrio p_trio = new PTrio();
        addObject(p_trio,304,198);
        PCuarteto p_cuarteto = new PCuarteto();
        addObject(p_cuarteto,494,196);

        p_dueto.setLocation(105,268);
        p_cuarteto.setLocation(482,264);
        p_trio.setLocation(294,266);
        Choose choose = new Choose();
        addObject(choose,310,87);
        choose.setLocation(303,71);
        choose.setLocation(298,71);
        BMainMenu main_menu = new BMainMenu();
        addObject(main_menu,31,390);
        main_menu.setLocation(27,384);
    }
}
