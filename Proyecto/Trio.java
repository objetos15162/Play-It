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
    private long soundStartTimea;
    private long soundStartTimeb;
    private long soundStartTimec;
    private Integer contTP;
    private Integer contTV;
    private Integer contTC;
    private Integer cP;
    private Integer cC;
    private Integer cV;
    private GreenfootSound tempsoundP;
    private GreenfootSound tempsoundC;
    private GreenfootSound tempsoundV;
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
        cP=0;
        cC=0;
        cV=0;
         tempsoundP = null;
         tempsoundC = null;
         tempsoundV = null;
        fillArrays();
    }
   
    /**
     * metodo que toca los sonidos
     */
    public void playSounds() 
    {
        // mientras siga habiendo elementos en el arreglo
        
            tempsoundP = piano.get(cP);
            //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              tempsoundP.play();
              soundStartTimea = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimea != 0 && !tempsoundP.isPlaying()&& cP<contTP-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              soundStartTimea = 0;
              cP++;
          }
          
           //actualiza el archivo que va a abrir
           tempsoundC = cello.get(cC);
           //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              tempsoundC.play();
              soundStartTimeb = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimeb != 0 && !tempsoundC.isPlaying() && cC<contTC-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              soundStartTimeb = 0;
              cC++;
          }
        
           //actualiza el archivo que va a abrir
           tempsoundV = violin.get(cV);
           //si el sonido pasado ya se acabó
          if(soundStartTimec==0)
          {   
              tempsoundV.play();
              soundStartTimec = System.currentTimeMillis();
          }
          // to check for sound stopping
          if (soundStartTimec != 0 && !tempsoundV .isPlaying()&&cV<contTV-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimec;
              soundStartTimec = 0;
              cV++;
          }
          if(cV>=contTV-1)
          {
              cV++;
            }
          
    }
    /**
     * método para parar los sonidos
     */
    public void stopSounds()
    {
       if(tempsoundP.isPlaying())
        {
        tempsoundP.stop();
       }
        if(tempsoundC.isPlaying())
        {
        tempsoundC.stop();
       }
        if(tempsoundV.isPlaying())
        {
        tempsoundV.stop();
       }
    }
    /**
     * Método para rellenar los arreglos con los archivos de sonido
     * en secuencia
     */
    public void fillArrays() 
    {
        //contadores
        int contP=1;
        int contC=1;
        int contV=1;
        
        while(contP!= contTP+1){
            piano.add(new GreenfootSound("tp"+contP+".wav"));
            contP++;
        }
        while(contC!= contTC+1){
            cello.add(new GreenfootSound("tc"+contC+".wav"));
            contC++;
        }
        while(contV!= contTV+1){
            violin.add(new GreenfootSound("tv"+contV+".wav"));
            contV++;
        }
       
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscTrio
     */
    public int getcontTV()
    {
        return contTV;
    }
     /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscTrio
     */
    public int getcontTP()
    {
        return contTP;
    }
     /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscTrio
     */
    public int getcontTC()
    {
        return contTC;
    }
    
}
