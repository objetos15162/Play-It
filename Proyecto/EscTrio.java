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
    private Lineas3 lineas3;
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
       lineas3 = new Lineas3();
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

        addObject(lineas3,353,93);
        
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
    

    
   

