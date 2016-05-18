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
    private Instruccion4 insva;
    private Instruccion4 insv;
    private Instruccion4 insc;
    private Instruccion4 insvb;
    public EscCuarteto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //insva=new Instruccion2("cuartetoviolina.txt");
        //insvb=new Instruccion2("cuartetoviolinb.txt");
        //insc=new Instruccion2("cuartetocello.txt");
        //insv=new Instruccion2("cuartetoviola.txt");
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Violistaa violistaa = new Violistaa();
        addObject(violistaa,340,272);
        Violinistaa violinistaa = new Violinistaa();
        addObject(violinistaa,247,272);
        Violinistab violinistab = new Violinistab();
        addObject(violinistab,157,284);
        Cellistab cellistab = new Cellistab();
        addObject(cellistab,447,277);

        BMainMenu main_menu3 = new BMainMenu();
        addObject(main_menu3,28,385);

        Lineas4 lineas4 = new Lineas4();
        addObject(lineas4,349,101);

        Cello cello2 = new Cello();
        addObject(cello2,81,183);
        Viola viola = new Viola();
        addObject(viola,87,124);
        Violin violin = new Violin();
        addObject(violin,90,77);
        Violin violin2 = new Violin();
        addObject(violin2,92,31);
    }
}
