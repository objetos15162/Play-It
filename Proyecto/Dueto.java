import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * clase de sonidos para el dueto, genera los arreglos de sonido y se encarga de
 * su reproducción
 * 
 * @author (EsauBz) 
 * @version (may 2016)
 */
public class Dueto extends Sonido
{
    private ArrayList<GreenfootSound> piano;
    private ArrayList<GreenfootSound> violin;
    private long soundStartTime;
    private Integer contDP;
    private Integer contDV;
    private long soundStartTimea;
    private long soundStartTimeb;
    private long soundStartTimec;
    private Integer contV;
    private Integer contP;
     private GreenfootSound tempsoundP = null;
     private GreenfootSound tempsoundV = null;
     /**
      * constructor para Dueto
      */
    public Dueto()
    {
        contDP=34;
        contDV=30;
        soundStartTimea = 0;
        soundStartTimeb=0;
        soundStartTimec=0;
        contV = 0;
        contP=0;
        piano = new ArrayList();
        violin = new ArrayList();
        soundStartTime = 0;
        fillArrays();
    }   
    public void playSounds()
    {
        // mientras siga habiendo elementos en el arreglo
        
        tempsoundP = piano.get(contP);
        //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              tempsoundP.play();
              soundStartTimea = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimea != 0 && !tempsoundP.isPlaying())
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              //System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimea = 0;
              contP++;
          }
          if(contP>=contDP-1)
          {
              contP++;
            }
          
           //actualiza el archivo que va a abrir
        tempsoundV = violin.get(contV);
        //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              tempsoundV.play();
              soundStartTimeb = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimeb != 0 && !tempsoundV.isPlaying() && contV<contDV-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              //System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimeb = 0;
              tempsoundV++;
          }
          
    
    }  
    /**
     * metodo para parar los sonidos
     */
    public void stopSounds()
    {
        if(tempsoundP.isPlaying())
        {
        tempsoundP.stop();
       }
        if(tempsoundV.isPlaying())
        {
        tempsoundV.stop();
       }
        
    }
    /**
     * metodo para rellenar los arrelgos con los archivos de sonido
     */
    public void fillArrays() {
        int cP=1;
        int cV=1;
        while(cP!=contDP+1){
            piano.add(new GreenfootSound("dp"+cP+".wav"));
            cP++;
        }
        while(cV!=contDV+1){
            violin.add(new GreenfootSound("dv"+cV+".wav"));
            cV++;
        }
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscDueto
     */
     public int getP()
    {
        return contP;
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscDueto
     */
    public int getV()
    {
        return contV;
    }
    
  
}
