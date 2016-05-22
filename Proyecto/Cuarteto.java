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
    private long soundStartTimea,soundStartTimeb,soundStartTimec, soundStartTimed;;
    private Integer contCVa;
    private Integer contCVb;
    private Integer contCV;
    private Integer contCC;
    private  Integer i=0,j = 0,k=0,l=0;
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
        soundStartTimea = 0;
        soundStartTimeb=0;
        soundStartTimec=0;
        soundStartTimed=0;
        fillArrays();
    }
    public void act() 
    {
        // Add your action code here.
        
    }  
     public void playSounds(){
        
        GreenfootSound m = null;
        GreenfootSound n = null;
        GreenfootSound o = null;
        GreenfootSound p = null;
        
        m = cello.get(j);
        //si el sonido pasado ya se acabó
          if(soundStartTimea==0)
          {   
              m.play();
              soundStartTimea = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimea != 0 && !m.isPlaying()&& j<contCC-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimea;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimea = 0;
              j++;
          }
          
           //actualiza el archivo que va a abrir
        n = viola.get(k);
        //si el sonido pasado ya se acabó
          if(soundStartTimeb==0)
          {   
              n.play();
              soundStartTimeb = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimeb != 0 && !n.isPlaying()&&k<contCV-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimeb;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimeb = 0;
              k++;
          }
          
        
        
           //actualiza el archivo que va a abrir
        o = violin1.get(l);
        //si el sonido pasado ya se acabó
          if(soundStartTimec==0)
          {   
              o.play();
              soundStartTimec = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimec != 0 && !o.isPlaying()&&l<contCVa-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimec;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimec = 0;
              l++;
          }  
         p = violin2.get(i);
        //si el sonido pasado ya se acabó
          if(soundStartTimed==0)
          {   
              p.play();
              soundStartTimed = System.currentTimeMillis();
          }
        // to check for sound stopping
          if (soundStartTimed != 0 && !p.isPlaying()&& i<contCVb-1)
          {
              long elapsedTime = System.currentTimeMillis()-soundStartTimed;
              System.out.println("The sound took "+(elapsedTime/1000)+" seconds to play.");
              soundStartTimed = 0;
              i++;
          }
   
    
    }
    public void fillArrays() {
        int w=1;
        int x=1;
        int y=1;
        int z=1;
        while(x!=contCVa+1){
            violin1.add(new GreenfootSound("cva"+x+".wav"));
            x++;
        }
        while(w!=contCVb+1){
            violin2.add(new GreenfootSound("cvb"+w+".wav"));
            w++;
        }
        while(y!=contCV+1){
            viola.add(new GreenfootSound("cv"+y+".wav"));
            y++;
        }
        while(z!=contCC+1){
            cello.add(new GreenfootSound("cc"+z+".wav"));
            z++;
        }
    }
    public int getcontCVa()
    {
        return contCVa;
    }
    public int getcontCVb()
    {
        return contCVb;
    }
    public int getcontCV()
    {
        return contCV;
    }
    public int getcontCC()
    {
        return contCC;
    }
    public int getI()
    {
        return i;
    }
    public int getJ()
    {
        return j;
    }
    public int getK()
    {
        return k;
    }
    public int getL()
    {
        return l;
    }
}
