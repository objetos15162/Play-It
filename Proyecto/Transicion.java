import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase esta encargada de generar una animacion en la que el escenario hace una transicion hacia otro mundo,
 * para decidir hacia donde se dirige tiene una variable int que mediante un switch eligira el escenario correspondiente, 
 * este int se recibe como parametro en el constructor.Esta clase hereda de World
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Transicion extends World
{

    /**
     * Constructor for objects of class transicion.
     * 
     */
    private GreenfootImage ima1;
    private GreenfootImage ima2;
    private GreenfootImage ima3;
    private GreenfootImage ima4;
    private GreenfootImage ima5;
    private GreenfootImage ima6;
    private Integer  delay; // tiempo que espera para hacer la transicion más suave
    private Integer  scene; //varble para escoger qué escenario se abre
    
    /**
     * @param int sce que ayudará a definir qué mundo se abre 
     * después de la transición.
     * instancias de GreenfootImage que ayudan a generar la animacion.
     * se manda llamar al contructor de la super clase World
     */
    public Transicion(int sce)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        scene = sce;
        delay = 3;
        ima1 = new GreenfootImage("m4.png");
        ima2 = new GreenfootImage("e2.png");
        ima3 = new GreenfootImage("e3.png");
        ima4 = new GreenfootImage("e4.png");
        ima5 = new GreenfootImage("e5.png");
        ima6 = new GreenfootImage("e6.png");

        
    }
    /**
     * Cuando se llama transicion por un objeto o clase, este cambia entre sus instancias GreenfootImage para
     * generar la animacion, seguido analiza la variable sce mediante un switch, en el caso 1 llama 
     * a las piezas (ensambles) disponibles
     * la opcion 2 abre un dueto
     * la opcion 3 abre el trio
     * la opcion 4 abre el cuarteto
     */
    public void act()
    {
           //cambio de imágenes
            setBackground(ima1);
            Greenfoot.delay(delay);
            setBackground(ima2);
            Greenfoot.delay(delay);
            setBackground(ima3);
            Greenfoot.delay(delay);
            setBackground(ima4);
            Greenfoot.delay(delay);
            setBackground(ima5);
            Greenfoot.delay(delay);
            setBackground(ima6);
            Greenfoot.delay(delay);
            switch(scene)
           {
              case 1:
             MenuPiezas newWorld = new MenuPiezas();
             Greenfoot.setWorld(newWorld);
               break;
              case 2: 
             EscDueto newW = new EscDueto();
             Greenfoot.setWorld(newW);
               break;
             case 3: 
             EscTrio newoW = new EscTrio();
             Greenfoot.setWorld(newoW);
               break;
             case 4: 
             EscCuarteto newaW = new EscCuarteto();
             Greenfoot.setWorld(newaW);
               break;
           }
            
    }
}
