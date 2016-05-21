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
    private long soundStartTimea,soundStartTimeb,soundStartTimec;
    private Integer contTP;
    private Integer contTV;
    private Integer contTC;
    /**
     * constructor de la clase Trio
     */
    public Trio()
    {
        piano = new ArrayList();
        cello = new ArrayList();
        violin = new ArrayList();
        soundStartTimea = 0;
        soundStartTimeb=0;
        soundStartTimec=0;
        contTP = 26;
        contTC = 27;
        contTV = 35;
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
        Integer j = 0,k=0,l=0;
        GreenfootSound m = null;
        GreenfootSound n = null;
        GreenfootSound o = null;
        int band = 0;
           
        while(l<contTV)
        {
            m = piano.get(j);
            //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              m.play();
              soundStartTimea = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimea != 0 && !m.isPlaying()&& j<contTP-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimea = 0;
              j++;
          }
          
           //actualiza el archivo que va a abrir
           n = cello.get(k);
           //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              n.play();
              soundStartTimeb = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimeb != 0 && !n.isPlaying() && k<contTC-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimeb = 0;
              k++;
          }
        
        
           //actualiza el archivo que va a abrir
           o = violin.get(l);
           //si el sonido pasado ya se acabó
          if(soundStartTimec==0)
          {   
              o.play();
              soundStartTimec = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimec != 0 && !o.isPlaying())
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimec;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimec = 0;
              l++;
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
        
        while(x!= contTP+1){
            piano.add(new GreenfootSound("tp"+x+".wav"));
            x++;
        }
        while(y!= contTC+1){
            cello.add(new GreenfootSound("tc"+y+".wav"));
            y++;
        }
        while(z!= contTV+1){
            violin.add(new GreenfootSound("tv"+z+".wav"));
            z++;
        }
       
    }
    public int getcontTV()
    {
        return contTV;
    }
    public int getcontTP()
    {
        return contTP;
    }
    public int getcontTC()
    {
        return contTC;
    }
}
