import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class detectores here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Detector extends GameControl
{
    /**
     * Act - do whatever the detectores wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private List<Musico> m;
    private Integer x = 0;
    public Detector()
    {
     
    }
    public void act() 
    {
        World mundo = getWorld();
         Ensamble miMundo = (Ensamble)mundo;
      if(this.isTouching(Instruccion2.class))
      {
          removeTouching(Instruccion2.class);
          x=1;
          //m = miMundo.getObjects(Musico.class);
          if(Greenfoot.isKeyDown("t")&&!miMundo.getVidas().isEmpty()){
              
              miMundo.removeVida();
            }
           
        }else {
        x=0;
        }
        if(miMundo.getVidas().isEmpty())
        {
            Greenfoot.delay(5);
            EndGame e = new EndGame(0);
            Greenfoot.setWorld(e);
        }
    }
    public boolean detectorTouches()
    {
<<<<<<< HEAD
       
        return x;
=======
        if(this.isTouching(Instruccion2.class))
        {
            return true;
        }
        return false;
>>>>>>> origin/master
    }
}
