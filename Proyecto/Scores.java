
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
/**
 * Esta clase representa a un mundo dentro de Greenfoot, aqui tenemos la capacidad de abrir el archivo de Records.txt mediante
 * la instancia de la Clase Records que se declara, una vez hecho esto, podemos escribir el archivo que hemos leido en pantalla y 
 * tambien poder regresar al menu.
 * 
 * @author (EsauBz & Lilia) 
 * @version (Mayo 2016)
 */
public class Scores extends World 
{
    Records actuales;
    /**
     * Manda llamar al contructor de la super clase para construir un mundo de 600x400, seguido utiliza el metodo prepare para
     * agregar un boton que nos permita regresar al menu e inicializa la variable actuales como new Records.
     */
    public Scores()
    {
        super(600, 400, 1);
        prepare();
        actuales = new Records();
    }
    /*
    act - Dentro de este metodo se manda llamar al metodo escribeRecords que leera el archivo y escribira los nombres y puntuaciones
    de manera ordenada
    */
    public void act(){
      this.escribeRecords();
    }
    /*
    * Dentro del este metodo el for each manda llamar a esribeTabla de records, este metodo retorna un usuario que podremos 
    utilizar los metodos getName para acceder al nombre y getPoints para la puntuacion, la variable y sirve para saber la posicion
    en donde se escribira y no empalmar los nombres dentro de la pantalla.
    */
    public void escribeRecords(){
        int y1 = 170;
           for(Usuario aux : actuales.escribeTabla())
            {
                showText(aux.getName(),200,y1);
                showText(aux.getPoints()+"",400,y1);
                y1 = y1 + 30;
            }
    }
    /*
    * El metodo prepare agrega una instancia de la clase BMainMenu para tener la capacidad de regresar al Menu principa.
    */
    public void prepare()
    {
        BMainMenu main_menu = new BMainMenu();
        addObject(main_menu,23,383);
    }
}
