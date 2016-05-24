import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * clase de sonidos para el cuarteto, genera los arreglos de sonido y se encarga de
 * su reproducción
 * 
 * @author (EsauBZ) 
 * @version (may 2016)
 */
public class Cuarteto extends Sonido
{
    private ArrayList<GreenfootSound> cello;
    private ArrayList<GreenfootSound> violin1;
    private ArrayList<GreenfootSound> violin2;
    private ArrayList<GreenfootSound> viola;
    private long soundStartTimea;
    private long soundStartTimeb;
    private long soundStartTimec;
    private long soundStartTimed;
    private Integer contCVa;
    private Integer contCVb;
    private Integer contCV;
    private Integer contCC;
    private GreenfootSound tempsoundC = null;
    private GreenfootSound tempsoundV = null;
    private GreenfootSound tempsoundV1 = null;
    private GreenfootSound tempsoundV2 = null;
    private  Integer contV2 = 0;
    private  Integer contC = 0;
    private  Integer contV=0;
    private  Integer contV1=0;
    /**
     * Act - do whatever the Cuarteto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cuarteto()
    {
        violin1 = new ArrayList();
        violin2 = new ArrayList();
        viola = new ArrayList();
        cello = new ArrayList();
        contCVa = 21;
        contCVb = 22;
        contCV = 24;
        contCC = 20;
        Integer contV2 = 0;
        Integer contC = 0;
        Integer contV=0;
        Integer contV1=0;
        soundStartTimea = 0;
        soundStartTimeb=0;
        soundStartTimec=0;
        soundStartTimed=0;
        fillArrays();
    }
    /**
     * métod que reproduce los sonidos de manera simultánea y controla que no se sobrepongan
     */
     public void playSounds()
     {
        tempsoundC = cello.get(contC);
        //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              tempsoundC.play();
              soundStartTimea = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimea != 0 && !tempsoundC.isPlaying()&& contC<contCC-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              soundStartTimea = 0;
              contC++;
          }
          
        tempsoundV = viola.get(contV);
        //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              tempsoundV.play();
              soundStartTimeb = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimeb != 0 && !tempsoundV.isPlaying()&&contV<contCV-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              soundStartTimeb = 0;
              contV++;
          }
          if(contV>=contCV-1)
          {
              contV++;
            }
           //actualiza el archivo que va a abrir
        tempsoundV1 = violin1.get(contV1);
        //si el sonido pasado ya se acabó
          if(soundStartTimec==0)
          {   
              tempsoundV1.play();
              soundStartTimec = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimec != 0 && !tempsoundV1.isPlaying()&&contV1<contCVa-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimec;
              soundStartTimec = 0;
              contV1++;
          }  
         tempsoundV2 = violin2.get(contV2);
        //si el sonido pasado ya se acabó
          if(soundStartTimed==0)
          {   
              tempsoundV2.play();
              soundStartTimed = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimed != 0 && !tempsoundV2.isPlaying()&& contV2<contCVb-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimed;
              soundStartTimed = 0;
              contV2++;
          }
   
    /**
     * Métod que rellena los arreglos de sonidos
     */
    }
    public void fillArrays() {
        int cV1=1;
        int cV2=1;
        int cV=1;
        int cC=1;
        while(cV1!=contCVa+1){
            violin1.add(new GreenfootSound("cva"+cV1+".wav"));
            cV1++;
        }
        while(cV2!=contCVb+1){
            violin2.add(new GreenfootSound("cvb"+cV2+".wav"));
            cV2++;
        }
        while(cV!=contCV+1){
            viola.add(new GreenfootSound("c"+cV+".wav"));
            cV++;
        }
        while(cC!=contCC+1){
            cello.add(new GreenfootSound("cc"+cC+".wav"));
            cC++;
        }
    }
    /**
     * methode que controla que los sonidos dejen de reproducirse a tiempo.
     */
    public void stopSounds()
    {
        if(tempsoundC.isPlaying())
        {
        tempsoundC.stop();
       }
        if(tempsoundV.isPlaying())
        {
        tempsoundV.stop();
       }
        if(tempsoundV1.isPlaying())
        {
        tempsoundV1.stop();
       }
        if(tempsoundV2.isPlaying())
        {
        tempsoundV2.stop();
       }
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getV2()
    {
        return contV2;
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getC()
    {
        return contC;
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getV()
    {
        return contV;
    }
    /**
     * method that returns the place where the sounds are at the moment in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getV1()
    {
        return contV1;
    }
     /**
     * method that returns the place where the sounds end in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getcontTV()
    {
        return contTV;
    }
    /**
     * method that returns the place where the sounds end in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getcontTP()
    {
        return contTP;
    }
    /**
     * method that returns the place where the sounds end in order to see if they continue playing
     * this is controlled by the class EscCuarteto
     */
    public int getcontTC()
    {
        return contTC;
    }
}
