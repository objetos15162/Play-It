import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Esta clase representa al jugador mientras se desarrolla el juego, tiene una instancia String donde se guarda el nombre
 * y una instancia int para los puntos. Esta clase hereda de Actor.
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
public class Usuario  extends Actor
{
    private int puntos;
    private String name;
    /**
     * Constructor: Aqui se inicializa la variable name con caracteres vacios, y puntos de igual manera 0.
     * */
    public Usuario()
    {
      name = "";
      World mundo = getWorld();
      Ensamble miMundo = (Ensamble)mundo;
      puntos = 0;
    }
    /**
     * Metodo act de la clase Usuario
     */
    public void act() 
    {
    }   
    /*
    *@param String, variable que se recibe el cual sera el nombre que se le asignara al Usuario en su
    variable name.
    */
    public void setName(String nombre){
        name = nombre;
    }
    /*
    *@param int, variable que se recibe el cual sera la puntuacion que se le asignara al Usuario en su
    variable puntos.
    */
    public void setPoints(int p){
        puntos = p;
    }
    /*
    *@return String, retorna la variable name, que contiene el nombre del usuario.
    */
    public String getName(){
        return name;
    }
    /*
    *@return int, retorna la variable puntos que contiene los puntos del usuario.
    */
    public int getPoints(){
        return puntos;
    }    

}
