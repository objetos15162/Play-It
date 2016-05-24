import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * clase que controla los detectores del juego
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Detector extends GameControl
{
    private Integer bandera = 0;
    public Detector()
    {
     
    }
    /**
     * Act - revisa y hace que las instrucciones desaparezcan si detecta una
     */
    public void act() 
    {
        World mundo = getWorld();
         Ensamble miMundo = (Ensamble)mundo;
      if(this.isTouching(Instruccion2.class))
      {
          removeTouching(Instruccion2.class);
          bandera=1;
          /*if(Greenfoot.isKeyDown("t")&&!miMundo.getVidas().isEmpty()){
              
              miMundo.removeVida();
            }
           */ //testing the method
        }else {
        bandera=0;
        }
        if(miMundo.getVidas().isEmpty())
        {
            Greenfoot.delay(5);
            EndGame end = new EndGame(0);
            Greenfoot.setWorld(end);
        }
    }
    /**
     * metodo para saber si hay una instruccion o no tocando al detector
     */ 
    public boolean detectorTouches()
    {
        if(this.isTouching(Instruccion2.class))
        {
            return true;
        }
        return false;

    }
}
