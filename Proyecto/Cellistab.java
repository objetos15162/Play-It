import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el cellista b
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Cellistab extends Cellista
{
    /**
     * Act - do whatever the cellistab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cellistab()
    {
        im1=new GreenfootImage("cellista1b.png");
        im2=new GreenfootImage("cellista2b.png");
        im3=new GreenfootImage("cellista3b.png");
        im4=new GreenfootImage("cellista4b.png");
       
        setImage(im1);
    }
    /**
     *  llama a act de cellista para que se mueva
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
