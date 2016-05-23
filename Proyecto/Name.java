import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Name here.
 * 
 * @author (Lilia & Esau) 
 * @version (Mayo 2016)
 */
public class Name extends World
{   
    private Usuario player;
    private String name = "";
    /**
     * Constructor for objects of class Name.
     * 
     */
    public Name(Usuario pl)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = pl;
    }
    public void act()
    {
        if(this.player.getName() == ""){
        this.pidePlayer();
    }
        else{ 
          Records aux = new Records();
          aux.addUsuario(player);
          Scores newWorld = new Scores();
          Greenfoot.setWorld(newWorld);
        }
    }
    public void pidePlayer(){
      name = Greenfoot.ask("Please Enter Your Name");
      this.player.setName(name);
    }
    public Usuario getPlayer(){
        return player;
    }
}
