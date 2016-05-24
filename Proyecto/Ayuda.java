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
    private GreenfootImage ayuda1;
    private GreenfootImage ayuda2;
    private GreenfootImage ayuda3;
    private GreenfootImage aduet;
    private GreenfootImage atrio;
    private GreenfootImage acuarteto;
    private GreenfootImage aup;
    private GreenfootImage afin;
    private Boton bmore;
    private Boton bplay;
    private Integer cont;
    private Violinistaa violinista;
    private Vida vida1;
    private Vida vida2;
    private Vida vida3;
    
    public Ayuda()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       super(600,400,1);
        cont = 1;
        ayuda1 = new GreenfootImage("ayuda_carteles1.png");
        ayuda2 = new GreenfootImage("ayuda_carteles2.png");
        ayuda3 = new GreenfootImage("ayuda_carteles3.png");
        aduet = new GreenfootImage("ayuda_cartelesduet.png");
        atrio = new GreenfootImage("ayuda_cartelestrio.png");
        acuarteto = new GreenfootImage("ayuda_cartelescuarteto.png");
        aup = new GreenfootImage("ayuda_cartelesuphere.png");
        afin = new GreenfootImage("ayuda_cartelesfin.png");
        bmore = new BMoreAbout();
        violinista= new Violinistaa();
        vida1 = new Vida();
        vida2 = new Vida();
        vida3 = new Vida();
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
        BMainMenu mainmenu = new BMainMenu();
        addObject(mainmenu,28,383);
        
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
                    setBackground(ayuda2);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(ayuda1);
            }
                }
                
        break;
        case 2: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(ayuda3);
                    addObject(violinista,320,270);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(ayuda2);
                removeObject(violinista);
                cont--;
            }
                }
                
        break;
        case 3: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(aduet);
                    
                    removeObject(violinista);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(ayuda3);
                addObject(violinista,320,270);
                cont--;
            }
                }
        case 4: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(atrio);
                    
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(aduet);
                removeObject(violinista);
                cont--;
            }
                }
                      
        break;
        case 5: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(acuarteto);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(atrio);
                cont--;
            }
                }
        case 6: 
         if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(aup);
                    addObject(vida1,570,363);
                    addObject(vida2,545,364);
                    addObject(vida3,521,365);
                    cont++;
                }else {
                    if(Greenfoot.isKeyDown("left"))
                    {
                setBackground(acuarteto);
                removeObject(vida1);
                removeObject(vida2);
                removeObject(vida3);
                cont--;
            }
                }
                
        case 7:
           if(Greenfoot.isKeyDown("right"))
                {
                    Greenfoot.delay(2);
                    setBackground(afin);
                    removeObject(vida1);
                    removeObject(vida2);
                    removeObject(vida3);
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
                  addObject(vida1,570,363);
                  addObject(vida2,545,364);
                  addObject(vida3,521,365);
                }
        }
        break;
    }
    }
}

