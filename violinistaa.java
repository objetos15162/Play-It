import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class violinistaa here.
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violinistaa extends Violinista
{
    /**
     * Act - do whatever the violinistaa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Violinistaa()
    {
        im1=new GreenfootImage("violinista1.png");
        im2=new GreenfootImage("violinista2.png");
        im3=new GreenfootImage("violinista3.png");
        im4=new GreenfootImage("violinista4.png");
       
        setImage(im1);
    }
    /**
     * llama a act de violinista para que se mueva
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("x"))
        {
        super.act();
        }
    }    
}
