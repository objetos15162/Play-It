import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Esta clase representa a un mundo donde se le pide el nombre al usuario. Finalmente lleva al mundo Scores que proyectara las mejores
 * 4 puntuaciones del juego.
 * @author (Lilia & Esau) 
 * @version (Mayo 2016)
 */
public class Name extends World
{   
    private Usuario player;
    private String name = "";
    /**
     * 
     * Manda llamar a la super clase para construir un mundo de 600x400 .
     */
    public Name(Usuario pl)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        player = pl;
    }
    /*
    *Dentro de su metodo act, si es que el nombre del jugador esta en caracteres vacios, se pide el nombre. Si no esta en carateres
    vacios se agrega a la lista de los jugadores y se manda llamar a un mundo Scores.
    */
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
    /*
    * Este metodo utiliza el metodo ask que genera una pantalla donde se puede pedir un string, en este caso se pregunta por el nombre
    y se le asigna a la variable name.
    */
    public void pidePlayer(){
      name = Greenfoot.ask("Please Enter Your Name");
      this.player.setName(name);
    }
    /*
    *Este metodo nos permite acceder al Usuario, aqui llamado player que se le acaba de asignar el nombre.
    */
    public Usuario getPlayer(){
        return player;
    }
}
