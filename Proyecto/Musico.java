import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Maneja todos los músicos y sus movimientos
 * 
 * @author (Lilia & Esaú) 
 * @version (may 2016)
 */
public class Musico extends Actor
{
    
    public GreenfootImage im1;
    public GreenfootImage im2;
    public GreenfootImage im3;
    public GreenfootImage im4;
    private Integer mov=1; //controla en cuál de las 4 imágenes va para el movimiento
    private Integer dir=1; //hacia dónde se mueven los brazos, controla la secuencia de imágenes
    public Musico()
    {
        
    }
    /**
     * cambia las imagenes para hacer la animación de los musicos
     * dir muestra si van de ida o vuelta
     * mov muestra en qué etapa del movimiento va
     */
    public void musiciansMove()
    {
        if(dir==1)
        {
        switch(mov)
        {
        case 1:
            setImage(im2);
            mov++;
        break;
        case 2:
            setImage(im3);
            mov++;
        break;
        case 3:
            setImage(im4);
            mov++;
        break;
        case 4:
            dir=0;
        break;
        
        }
       }else{
        switch(mov)
        {
        case 1:
            dir=1;
        break;
        case 2:
            setImage(im1);
            mov--;
        break;
        case 3:
            setImage(im2);
            mov--;
        break;
        case 4:
            setImage(im3);
            mov--;
        break;
        
        }
    }
    }
}
