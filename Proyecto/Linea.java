import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.*;
import java.io.*;
/**
 * Write a description of class Linea here.
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
    /**
     * Constructor for objects of class Linea
     */
    public Linea(String archivo, boolean genera)
    {
        archivo1 = new File(archivo);
        cont = 0;
        toca = genera;
        this.openFile();
    }
    public void act(){
        if(cont == 0){
        cont = this.readStrings();
      }
        if( toca != false){
          while(cont != 0){
             Instruccion2 i = new Instruccion2();
             Greenfoot.delay(3);
             cont--;
            }
          toca = false;
          }
      else{
          while(cont != 0){
              Greenfoot.delay(4);
              cont--;
            }
            toca = true;
        }
    }
    public void openFile(){
      try{
          entrada = new Scanner(archivo1);
          archivoOk = true;
        }
        catch(Exception e){
          System.out.println(e.getMessage());
        }
    }
   public int readStrings(){
       Integer temp = 0;
      if(archivoOk){
         if(entrada.hasNext()){
             String cadena = entrada.next();
             Integer x = Integer.parseInt(cadena);
             temp = x;
             // TODO here you can make whatever you want with the variable cadena that has saved the number in string
             //Remember to use Integer if you want a int 
            }
        }
        return temp;
    }
    private void addInstruction(){
      Instruccion2 i = new Instruccion2();
    }
}
