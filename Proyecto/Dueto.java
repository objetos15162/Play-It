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
    private long soundStartTimea,soundStartTimeb,soundStartTimec;
    
    public Dueto()
    {
        contDP=34;
        contDV=30;
        soundStartTimea = 0;
        soundStartTimeb=0;
        soundStartTimec=0;
        piano = new ArrayList();
        violin = new ArrayList();
        soundStartTime = 0;
        fillArrays();
    }
    public void act() 
    {
        // Add your action code here.
        
    }    
    public void playSounds()
    {
        // mientras siga habiendo elementos en el arreglo
        Integer j = 0,l=0;
        GreenfootSound m = null;
        GreenfootSound n = null;
      
        int band = 0;
        
          
               while(j<contDP){
        m = piano.get(j);
        //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              m.play();
              soundStartTimea = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimea != 0 && !m.isPlaying())
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimea = 0;
              j++;
          }
          
           //actualiza el archivo que va a abrir
        n = violin.get(l);
        //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              n.play();
              soundStartTimeb = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimeb != 0 && !n.isPlaying() && l<contDV-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimeb = 0;
              l++;
          }
        
    
        }
        
        
    
    }  
    public void fillArrays() {
        int y=1;
        int z=1;
        while(y!=contDP+1){
            piano.add(new GreenfootSound("dp"+y+".wav"));
            y++;
        }
        while(z!=contDV+1){
            violin.add(new GreenfootSound("dv"+z+".wav"));
            z++;
        }
    }
    public int getcontDP()
    {
        return contDP;
    }
    public int getcontDV()
    {
        return contDV;
    }
}
