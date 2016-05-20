import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * clase de sonidos para el trio, genera los arreglos de sonido y se encarga de
 * su reproducción
 * 
 * @author (LiliaC) 
 * @version (may 2016)
 */
public class Trio extends Sonido
{
    private ArrayList<GreenfootSound> piano;
    private ArrayList<GreenfootSound> cello;
    private ArrayList<GreenfootSound> violin;
    private long soundStartTime;
    /**
     * constructor de la clase Trio
     */
    public Trio()
    {
        piano = new ArrayList();
        cello = new ArrayList();
        violin = new ArrayList();
        soundStartTime = 0;
        fillArrays();
    }
    /**
     * 
     */
    public void act() 
    {
        // Add your action code here.
        while(Greenfoot.isKeyDown("space"))
        {
            playSounds();
        }
    }
    /**
     * 
     */
    public void playSounds() 
    {
        // mientras siga habiendo elementos en el arreglo
        Integer j = 0;
        GreenfootSound m = null;
       while(j<26){
           //actualiza el archivo que va a abrir
        m = piano.get(j);
        //si el sonido pasado ya se acabó
          if(soundStartTime==0)
          {   
              m.play();
              soundStartTime = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTime != 0 && !m.isPlaying())
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTime;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTime = 0;
              j++;
          }
   
        }
    
    }  
    /**
     * Método para rellenar los arreglos con los archivos de sonido
     * en secuencia
     */
    public void fillArrays() 
    {
        //contadores
        int x=1;
        int y=1;
        int z=1;
        
        while(x!=27){
            piano.add(new GreenfootSound("tp"+x+".wav"));
            x++;
        }
        while(y!=28){
            cello.add(new GreenfootSound("tc"+y+".wav"));
            y++;
        }
        while(z!=36){
            violin.add(new GreenfootSound("tv"+z+".wav"));
            z++;
        }
       
    }
}
