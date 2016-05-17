import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pianista here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Pianista extends Musico
{
    /**
     * Act - do whatever the pianista wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        if(Greenfoot.isKeyDown("p"))
        {
        super.act();
        Trio t=new Trio();
        t.playSounds();
        }
    }
}
