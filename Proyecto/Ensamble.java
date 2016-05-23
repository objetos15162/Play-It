import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Clase escenarios que contiene los escenarios de los distintos duetos
 * 
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Ensamble extends KinectWorld
{
     private BMainMenu main_menu3;
     private Vida vidas1; 
     private Vida vidas2;
     private Vida vidas3;
     private Vida vidas4;
     private Vida vidas5;
     private ArrayList<Vida> vidas;
     private GreenfootImage imag1;
     //***********************************************//
    private long leftHandUp;
    private long rightHandUp;
    private static final int THUMBNAIL_WIDTH = 80;
    private static final int THUMBNAIL_HEIGHT = 60;
    /**
     * Constructor for objects of class Ensamble
     * 
     */
    public Ensamble()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(THUMBNAIL_WIDTH, THUMBNAIL_HEIGHT, 1.0, false);
        final int width = getWidth();
        final int height = getHeight();
        addObject(new Thumbnail(), width - THUMBNAIL_WIDTH/2, height - THUMBNAIL_HEIGHT/2);
        main_menu3 = new BMainMenu();
       vidas1 = new Vida();
       vidas2 = new Vida();
       vidas3 = new Vida();
       vidas4 = new Vida();
       vidas5 = new Vida();
       vidas = new ArrayList<Vida>();
       imag1 = new GreenfootImage("end_game.png");
        prepare();
      fillArrayVidas();
    }
    public void act()
    {
        super.act();
    }
    private void prepare()
    {
        
        addObject(vidas1,574,368);
        vidas1.setLocation(570,363);
        
        addObject(vidas2,548,368);
        vidas2.setLocation(545,364);
        
        addObject(vidas3,525,374);
        vidas3.setLocation(521,365);
       
        addObject(vidas4,500,370);
        vidas4.setLocation(497,365);
        
        addObject(vidas5,473,365);
        addObject(main_menu3,28,385);
    }
    /**
     * método para rellenar el arreglo de vidas con las vidas
     */
    private void fillArrayVidas()
    {   
        vidas.add(vidas1);
        vidas.add(vidas2);
        vidas.add(vidas3);
        vidas.add(vidas4);
        vidas.add(vidas5);
    }
    /**
     * método para regresar vidas
     */
    public ArrayList<Vida> getVidas()
    {
        return vidas;
    }
    /**
     * método para remover una vida
     */
    public void removeVida()
    {
        Vida v;
        v= vidas.get(vidas.size()-1);
        removeObject(v);
        vidas.remove(v);
        
    }
    
    
}
