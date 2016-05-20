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
    private long soundStartTime;
    /**
     * Act - do whatever the Cuarteto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        violin1 = new ArrayList();
        violin2 = new ArrayList();
        viola = new ArrayList();
        cello = new ArrayList();
        soundStartTime = 0;
        fillArrays();
    }  
     public void playSounds(){
    
    }
    public void fillArrays() {
    
    }
}
