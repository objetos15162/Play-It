import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    private Boolean touch;
    public Detector()
    {
        touch = false;
    }
    public void act() 
    {
      if(this.isTouching(Instruccion2.class))
      {
          removeTouching(Instruccion2.class);
        }
    }
    
}
