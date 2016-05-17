import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import javax.sound.sampled.*;
/**
 * Write a description of class Trio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trio extends Pieza
{
    private ArrayList<GreenfootSound> piano;
    private Integer j=0;
    private GreenfootSound m;
     private long soundStartTime=0;
    public Trio()
    {
        piano=new ArrayList();
        fillArrays();
    }
    public void act() 
    {
        // Add your action code here.
        while(Greenfoot.isKeyDown("space"))
        {
            playSounds();
        }
    }
    public void playSounds() 
    {
        // mientras siga habiendo elementos en el arreglo
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
        /*int i=1,j=0;
        GreenfootSound x=null;
        Boolean c;
        while(x.isPlaying()||piano.get(j)!=null){
            if(i==1){
                System.out.println(piano.get(j));
                System.out.println(x.toString());
                x=new GreenfootSound(piano.get(j));
                x.play();
        
                if(x.isPlaying()){
                    i=0;
                }else{
                    i=1;
                }
            }
        }*/
    
    }  
    private void fillArrays() 
    {
        int x=1;
       
        while(x!=27){
            piano.add(new GreenfootSound("tp"+x+".wav"));
            System.out.println("tp"+x+".wav");
            x++;
        }
       
    }
}
