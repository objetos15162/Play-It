import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase abstracta de la que heredan las clases, Dueto, Trio y Cuarteto, asi tenemos la obligacion de implementar los metodos 
 * fillArrays y playSounds que deberan como su nombre lo dice, llenar un ArrayList con cada sonido que se reproducira en el nivel
 * y tambien hacerlo sonar cuando asi le corresponda.
 * 
 * @author (Esaú & Lilia) 
 * @version (may 2016)
 */
public abstract class Sonido extends Actor
{
  public abstract void fillArrays();
  public abstract void playSounds();
}
