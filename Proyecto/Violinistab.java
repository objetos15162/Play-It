import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violinista b
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violinistab extends Violinista
{
    /**
     * Act - do whatever the violinistab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public Violinistab(){
        im1=new GreenfootImage("violinista1b.png");
        im2=new GreenfootImage("violinista2b.png");
        im3=new GreenfootImage("violinista3b.png");
        im4=new GreenfootImage("violinista4b.png");
       
        setImage(im1);
    }
    /**
     *  llama a act de violinista para que se mueva
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("z"))
        {
         super.act();
        }
    }   
    
    
}
