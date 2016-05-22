import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Usuario here.
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
public class Usuario  extends Actor
{
    private String puntos;
    private String name;
    public Usuario()
    {
      name = "";
      puntos = "";
    }
    /**
     * Act - do whatever the Usuario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     *
    public void act() 
    {
        nombre="";
        puntos=0;
    }  */  

    public void setName(String nombre){
        name = nombre;
    }

    public void setPoints(String p){
        puntos = p;
    }

    public String getName(){
        return name;
    }

    public String getPoints(){
        return puntos;
    }    

}