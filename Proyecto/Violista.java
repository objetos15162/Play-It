import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para el violista 
 * declara sus imágenes y controla cuándo se mueve
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Violista extends Musico
{
    /**
     * Act - Llama a Act de Musico para el cambio de imagenes y que se mueva
     */
    
     public void act()
     {
         if(Greenfoot.isKeyDown("l"))
         {
            super.act();
         }
     }
}
