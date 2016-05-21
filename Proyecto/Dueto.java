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
    public Dueto()
    {
        contDP=34;
        contDV=30;
    }
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
        int y=1;
        int z=1;
        while(y!=contDP+1){
            piano.add(new GreenfootSound("tc"+y+".wav"));
            y++;
        }
        while(z!=contDV+1){
            violin.add(new GreenfootSound("tv"+z+".wav"));
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
