import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * Clase que maneja la parte del trío
 * 
 * @author Lilia y Esaú 
 * @version (11.04.2016)
 */
public class EscTrio extends Ensamble
{

    /**
     * Constructor para los objetos, llama a la función prepare
     * 
     */
    private Instruccion3 insp;
    private Instruccion3 insv;
    private Instruccion3 insc;
    
    public EscTrio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       insp=new Instruccion3("triopiano.txt");
       insc=new Instruccion3("triocello.txt");
       insv=new Instruccion3("trioviolin.txt");
       
       prepare();
                 
    }

    /**
     * Prepara el mundo
     * Crea el pianista, violinista y cellista y los posiciona
     */
    private void prepare()
    {
        Pianistaa pianistaa2 = new Pianistaa();
        addObject(pianistaa2,356,212);
        
        Violinistaa violinistaa = new Violinistaa();
        addObject(violinistaa,181,277);
        
        Cellistab cellistab2 = new Cellistab();
        addObject(cellistab2,407,273);

        BMainMenu main_menu2 = new BMainMenu();
        addObject(main_menu2,26,385);

        addObject(insv,588,37);
        addObject(insp,588,92);
        addObject(insc,588,148);

        Lineas3 lineas3 = new Lineas3();
        addObject(lineas3,353,93);
        
        Piano piano3 = new Piano();
        addObject(piano3,85,91);
        
        Cello cello = new Cello();
        addObject(cello,93,149);

        Violin violin = new Violin();
        addObject(violin,84,36);
    }

    
   
}
