import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que muestra y maneja las pantallas de ayuda
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Ayuda extends KinectWorld
{

    /**
     * Constructor para los objetos de la clase ayuda.
     * 
     */
    private GreenfootImage a1;
    private GreenfootImage aup;
    private GreenfootImage afin;
    private Boton bmore;
    private Boton bplay;
    private Integer cont;
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
        cont = 1;
        a1 = new GreenfootImage("ayuda_carteles1.png");
        aup = new GreenfootImage("ayuda_cartelesuphere.png");
        afin = new GreenfootImage("ayuda_cartelesfin.png");
        bmore = new BMoreAbout();
        bplay= new BPlay();
        setBackground(a1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BMainMenu main_menu = new BMainMenu();
        addObject(main_menu,28,383);
        
    }
    public void act()
    {
        //transicion entre pantallas
    switch(cont)
    {
        case 1: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(aup);
                    cont++;
                }
                
        break;
        case 2:
           if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(afin);
                    addObject(bmore, 200,300);
                    addObject(bplay, 400,300);
                    
                }
                else {
                    if(Greenfoot.isKeyDown("left"))
                {
                  cont--;
                }
        }
        break;
    }
    }
}

