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
    private Integer contCVa;
    private Integer contCVb;
    private Integer contCV;
    private Integer contCC;
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
        contCVa = 21;
        contCVb = 22;
        contCV = 24;
        contCC = 20;
        soundStartTime = 0;
        fillArrays();
    }  
     public void playSounds(){
    
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
        while(x!=contCVb+1){
            violin2.add(new GreenfootSound("cvb"+x+".wav"));
            x++;
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
}
