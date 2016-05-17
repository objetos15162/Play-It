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
    private ArrayList<GreenfootSound> piano,cello,violin;
    private Integer j=0;
    private GreenfootSound m;
     private long soundStartTime=0;
    public Trio()
    {
        piano=new ArrayList();
        cello=new ArrayList();
        violin=new ArrayList();
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
    
    }  
    private void fillArrays() 
    {
        int x=1;
        int y=1;
        int z=1;
        
        while(x!=27){
            piano.add(new GreenfootSound("tp"+x+".wav"));
            System.out.println("tp"+x+".wav");
            x++;
        }
        while(y!=28){
            cello.add(new GreenfootSound("tc"+y+".wav"));
            System.out.println("tc"+x+".wav");
            y++;
        }
        while(z!=36){
            violin.add(new GreenfootSound("tv"+z+".wav"));
            System.out.println("tv"+z+".wav");
            z++;
        }
       
    }
}
