import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * clase para mostrar el final del juego
 * 
 * @author (Esau & Lilia) 
 * @version (Mayo 2016)
 */
public class EndGame extends World
{
    private Usuario player;
    /**
     * Constructor para la clase, recibe la cantidas de vidas del jugador
     * 
     */
    public EndGame(int vidas)
    {    
        super(600, 400, 1); 
        player = new Usuario();
        player.setPoints(vidas);
    }
    /**
     * Act - actua llevando al mundo donde pide el nombre
     */ 
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Name newWorld = new Name(player);
            Greenfoot.setWorld(newWorld);
        }
    }
    
}
