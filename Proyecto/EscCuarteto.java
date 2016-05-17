import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class esc_cuarteto here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class EscCuarteto extends Escenarios
{

    /**
     * Constructor for objects of class esc_cuarteto.
     * 
     */
    private Instruccion4 insva,insv,insc,insvb;
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
        addObject(violistaa,329,228);
        violistaa.setLocation(342,250);
        Violinistaa violinistaa = new Violinistaa();
        addObject(violinistaa,235,250);
        Violinistab violinistab = new Violinistab();
        addObject(violinistab,197,285);
        violinistaa.setLocation(270,262);
        Cellistab cellistab = new Cellistab();
        addObject(cellistab,447,277);

        BMainMenu main_menu3 = new BMainMenu();
        addObject(main_menu3,36,387);
        main_menu3.setLocation(28,385);

        
        Lineas4 lineas4 = new Lineas4();
        addObject(lineas4,349,101);

        violistaa.setLocation(340,272);
        violinistaa.setLocation(247,272);
        violinistab.setLocation(171,280);
        violinistab.setLocation(157,284);
        Cello cello2 = new Cello();
        addObject(cello2,89,187);
        cello2.setLocation(81,183);
        Viola viola = new Viola();
        addObject(viola,102,125);
        viola.setLocation(87,124);
        Violin violin = new Violin();
        addObject(violin,92,78);
        violin.setLocation(90,77);
        Violin violin2 = new Violin();
        addObject(violin2,91,33);
        violin2.setLocation(92,31);
    }
}
