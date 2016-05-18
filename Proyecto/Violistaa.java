import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violista a
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violistaa extends Violista
{
    /**
     * Act - do whatever the violistaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Violistaa()
    {
        im1=new GreenfootImage("violista1a.png");
        im2=new GreenfootImage("violista2a.png");
        im3=new GreenfootImage("violista3a.png");
        im4=new GreenfootImage("violista4a.png");
       
        setImage(im1);
    }
    /**
     *  llama a act de violista para que se mueva
     */
    public void act() 
    {
        // Add your action code here.
        super.act();
    }    
}
