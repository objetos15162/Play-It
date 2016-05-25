import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * En esta clase se hace un acceso a la clase KinectWorld para obtener un "Thumbnail" una miniatura de la imagen que esta recibiendo
 * el kinect en ese momento, al igualarla a una instancia GreenfootImage podemos ponerla dentro de cualquier mundo.
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
public class Thumbnail  extends Actor
{
    public Thumbnail()
    {
    }
    /**
     * Act - Una instancia GreenfootImage para asi igualarla a la imagen que esta recibiendo el Kinect en el momento del act, esto
     * mediante un acceso a la clase KinectWorld, que nos da la oportunidad de retornar una imagen.
     */
    public void act() 
    {
        GreenfootImage img = ((KinectWorld)getWorld()).getThumbnailUnscaled();
        setImage(img);
    }
}
