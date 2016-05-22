import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el cuarteto
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class EscCuarteto extends Ensamble
{

    /**
     * Constructor for objects of class esc_cuarteto.
     * 
     */
    private Violistaa violistaa;
    private Violinistaa violinistaa;
    private Violinistab violinistab;
    private Cellistab cellistab;
    private Lineas4 lineas4;
    private Cello cello2;
    private Viola viola;
    private Violin violin;
    private Violin violin2;
    private Cuarteto c;
    public EscCuarteto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //insva=new Instruccion2("cuartetoviolina.txt");
        //insvb=new Instruccion2("cuartetoviolinb.txt");
        //insc=new Instruccion2("cuartetocello.txt");
        //insv=new Instruccion2("cuartetoviola.txt");
        violistaa = new Violistaa();
        violinistaa = new Violinistaa();
        violinistab = new Violinistab();
        cellistab = new Cellistab();
        lineas4 = new Lineas4();
        cello2 = new Cello();
        viola = new Viola();
        violin = new Violin();
        violin2 = new Violin();
        c= new Cuarteto();
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(violistaa,340,272);
       
        addObject(violinistaa,247,272);
       
        addObject(violinistab,157,284);
        addObject(cellistab,447,277);
        addObject(lineas4,349,101);
        addObject(cello2,81,183);
        
        addObject(viola,87,124);
        
        addObject(violin,90,77);
        
        addObject(violin2,92,31);
    }
    public void act()
    {
           int x = c.getI();
        int i = c.getcontCV();
       while(x<i)
        {
            c.playSounds();
            violinistab.act();
            violinistaa.act();
            cellistab.act();
            violistaa.act();
       }
    
    }
}
