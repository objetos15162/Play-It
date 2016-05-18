import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el dueto
 * 
 * @author (Esaú y Lilia) 
 * @version (21.04.2016)
 */
public class EscDueto extends Ensamble
{

    /**
     * Constructor para la clase dueto
     * 
     */
    private Instruccion2 insp;
    private Instruccion2 insv;
    public EscDueto()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //insv=new Instruccion2("duetoviolin.txt");
        //insp=new Instruccion2("duetopiano.txt");
        
        prepare();
    }

    /**
     * Crea los objetos y botones necesarios 
     */
    private void prepare()
    {
        Pianistaa pianistaa = new Pianistaa();
        addObject(pianistaa,256,208);

        BMainMenu main_menu3 = new BMainMenu();
        addObject(main_menu3,26,383);
            //nn lineas
        //addObject(insp,588,55);
        //addObject(insv,588,130);

        Lineas2 lineas2 = new Lineas2();
        addObject(lineas2,351,93);
        Piano piano = new Piano();
        addObject(piano,90,58);


        Violinistab violinistab = new Violinistab();
        addObject(violinistab,370,267);
        Violin violin5 = new Violin();
        addObject(violin5,95,129);
    }
}
