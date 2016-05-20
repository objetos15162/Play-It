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
    /**
     * Act - do whatever the Dueto wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        piano = new ArrayList();
        violin = new ArrayList();
        soundStartTime = 0;
        fillArrays();
    }    
    public void playSounds(){
    
    }
    public void fillArrays() {
    
    }
}
