import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * botón que lleva a más sobre la música de cámara
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class BMoreAbout extends Boton
{
    /**
     * Act - lleva al mundo MoreAbout
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            MoreAbout newWorld = new MoreAbout(); 
            Greenfoot.setWorld(newWorld);
        }
    }    
}
