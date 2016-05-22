import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que muestra y maneja las pantallas de ayuda
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Ayuda extends World
{

    /**
     * Constructor para los objetos de la clase ayuda.
     * 
     */
    private GreenfootImage a1;
    private GreenfootImage a2;
    private GreenfootImage a3;
    private GreenfootImage aup;
    private GreenfootImage afin;
    private Boton bmore;
    private Boton bplay;
    private Integer cont;
    private Violinistaa v;
    private Vida v1;
    private Vida v2;
    private Vida v3;
    
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(600,400,1);
        cont = 1;
        a1 = new GreenfootImage("ayuda_carteles1.png");
        a2 = new GreenfootImage("ayuda_carteles2.png");
        a3 = new GreenfootImage("ayuda_carteles3.png");
        aup = new GreenfootImage("ayuda_cartelesuphere.png");
        afin = new GreenfootImage("ayuda_cartelesfin.png");
        bmore = new BMoreAbout();
        v= new Violinistaa();
        v1 = new Vida();
        v2 = new Vida();
        v3 = new Vida();
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
                    setBackground(a2);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(a1);
            }
                }
                
        break;
        case 2: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(a3);
                    addObject(v,320,270);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(a2);
                removeObject(v);
                cont--;
            }
                }
                
        break;
        case 3: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(aup);
                    addObject(v1,570,363);
                    addObject(v2,545,364);
                    addObject(v3,521,365);
                    removeObject(v);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(a3);
                addObject(v,320,270);
                removeObject(v1);
                removeObject(v2);
                removeObject(v3);
                cont--;
            }
                }
                
        break;
        case 4:
           if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(afin);
                    removeObject(v1);
                    removeObject(v2);
                    removeObject(v3);
                    addObject(bmore, 200,300);
                    addObject(bplay, 400,300);
                    
                }
                else {
                    if(Greenfoot.isKeyDown("left"))
                {
                  cont--;
                  removeObject(bmore);
                  removeObject(bplay);
                  setBackground(aup);
                  addObject(v1,570,363);
                  addObject(v2,545,364);
                  addObject(v3,521,365);
                }
        }
        break;
    }
    }
}

