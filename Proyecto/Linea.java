import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.*;
import java.io.*;
/**
 * Clase que contiene la línea por la que se transporta la instruccion
 * controla la generación de instrucciones por medio de los archivos que lee 
 * gracias a la clase Lectura
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
public class Linea  extends Actor
{
    int cont;
    boolean toca;
    private Scanner entrada; // Esta variable se encarga de leer linea por linea 
    private boolean archivoOk; // Verificar si el archivo existe
    private File archivo1;// Archivo que se intentara abrir
    private int linea;
    private SimpleTimer clock;
    private boolean bandera;
    /**
     * Constructor for objects of class Linea
     */
    public Linea(String archivo, boolean genera, int lin)
    {
        archivo1 = new File(archivo);
        cont = 0;
        toca = genera;
        linea = lin;
        clock = new SimpleTimer();
        bandera = true;
        this.openFile();
    }
    public void act(){
        if(cont == 0){
        cont = this.readStrings();
      }
     else{
        if(bandera){
         clock.mark();
         bandera = false;
         }
         else{
          if(clock.millisElapsed() >= 999){
           if( toca != false){
               this.addInstruction();
               cont--;
              if(cont == 0){
                toca = false;
             }
            }
           else{
              cont--;
             if(cont == 0){
              toca = true;
             }
           }
             bandera = true;
         }
        }
    }
}
/**
 * metodo que intenta abrir el archivo
 */
    private void openFile(){
      try{
          entrada = new Scanner(archivo1);
          archivoOk = true;
        }
        catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
    /**
    * metodo que lee las cadenas y las regresa como enteros
    */
   public int readStrings(){
       Integer entero = 0;
      if(archivoOk){
         if(entrada.hasNext()){
             String cadena = entrada.next();
             return  entero = Integer.parseInt(cadena);
            }
        }else if(!entrada.hasNext()){
            entero=0;
        }
        return entero;
    }
    /**
 * metodo que añade la instruccion a la línea
 */
    private void addInstruction(){
      Instruccion2 ins = new Instruccion2();
      World mundo = getWorld();
      Ensamble miMundo = (Ensamble)mundo;
      switch(linea){
        case 1:
        miMundo.addObject(ins,599,31);
        break;
        case 2:
        miMundo.addObject(ins,599,77);
        break;
        case 3:
        miMundo.addObject(ins,599,124);
        break;
        case 4:
        miMundo.addObject(ins,599,183);
        break;
      }
    }
}
