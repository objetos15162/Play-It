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
    private Violin violin;
    private Cello cello;
    private Piano piano3;
    private Linea linea1;
    private Linea linea2;
    private Linea linea3;
    private Cellistab cellistab2;
    private Violinistaa violinistaa;
    private Pianistaa pianistaa2;
    private Trio t;
    /**
     * Constructor para los objetos, llama a la función prepare
     * 
     */
    public EscTrio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
       
       violin = new Violin();
       cello = new Cello();
       piano3 = new Piano();
       linea1 = new Linea("triopiano.txt",false);
       linea2 = new Linea("trioviolin.txt",false);
       linea3 = new Linea("triocello.txt",true);
       cellistab2 = new Cellistab();
       violinistaa = new Violinistaa();
       pianistaa2 = new Pianistaa();
       
       prepare();
       t= new Trio();
       
                 
    }

    /**
     * Prepara el mundo
     * Crea el pianista, violinista y cellista y los posiciona
     */
    private void prepare()
    {
        addObject(pianistaa2,356,212);
        addObject(violinistaa,181,277);
        addObject(cellistab2,407,273);

        addObject(linea1,353,91);
        addObject(linea2,353,36);
        addObject(linea3,353,149);
        
        addObject(piano3,85,91);
        addObject(cello,93,149);
        addObject(violin,84,36);
    }
    public void act()
    {
        
        int x = t.getJ();
        int i = t.getcontTV();
       if(x<i)
        {
            t.playSounds();

            violinistaa.act();
            pianistaa2.act();
            cellistab2.act();
       }
    }
  }
    

    
   

