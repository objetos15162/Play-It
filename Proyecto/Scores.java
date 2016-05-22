import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
/**
 * Esta clase crea un archivo de texto si es que no existe con records del juego.
     si existen ya los lee, tambien los sobreescribira.
 * 
 * @author (EsauBz & Lilia) 
 * @version (Mayo 2016)
 */
public class Scores extends World 
{
    Records actuales;
    /**
     * Inicializa las variables nesesarias
     */
    public Scores()
    {
        super(600, 400, 1);
        actuales = new Records();
    }
    public void act(){
      this.escribeRecords();
    }
    public void escribeRecords(){
        int y1 = 170;
           for(Usuario aux : actuales.escribeTabla())
            {
                showText(aux.getName(),200,y1);
                showText(aux.getPoints()+"",400,y1);
                y1 = y1 + 30;
            }
    }
}
