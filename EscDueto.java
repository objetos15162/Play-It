import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Crea el escenario para el dueto
 * 
 * @author (Esaú y Lilia) 
 * @version (21.04.2016)
 */
public class EscDueto extends Escenarios
{

    /**
     * Constructor para la clase dueto
     * 
     */
    private Instruccion2 insp,insv;
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
        addObject(main_menu3,43,383);
        main_menu3.setLocation(26,383);

        //addObject(insp,588,55);
        //addObject(insv,588,130);

        Lineas2 lineas2 = new Lineas2();
        addObject(lineas2,354,103);
        lineas2.setLocation(351,93);
        Piano piano = new Piano();
        addObject(piano,88,58);
        piano.setLocation(90,58);


        Violinistab violinistab = new Violinistab();
        addObject(violinistab,371,292);
        violinistab.setLocation(370,267);
        Violin violin5 = new Violin();
        addObject(violin5,95,129);
    }
}
