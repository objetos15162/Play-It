import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.io.*;
/**
 * Esta clase crea un archivo de texto si es que no existe con records del juego.
     si el archivo existe leera lo que tenga dentro de el linea por linea, tambien tiene la capacidad de sobreescribirlo.
 * 
 * 
 * @author (EsauBz) 
 * @version (Mayo 2016)
 */
//file      Variable que contiene el archivo que se va a leer o escribir.
//escritor  Variable que escribe en el archivo.
//bufer
//salida    
//records   Variable que guarda la informacion tomada del archivo.
public class Records extends Actor
{
    private File file;
    private FileWriter escritor;
    private BufferedWriter bufer;
    private PrintWriter salida;
    private LinkedList<Usuario>  records;
   /**
     * Constructor: Aqui se inicializa una LinkedList que se usara para recuperar los datos del archivo y usarla mientras el juego este
     * en ejecucion una vez se termine esta lista se escribira en el archivo. La variable File que contiene al archivo Records, si
     * es que este archivo no existe, intentara crearlo.
     */
    public Records()
    {
        records = new LinkedList<Usuario>();
        file = new File ("Records.txt");
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException ex){}
        }
        else {
            this.leeRecords();
        }
    }
   /**
   * Metodo que toma a la LinkedList y avanza dentro de sus campos de usuario, recupera el nombre y puntuacion de los jugadores y 
   * escribe su nombre y puntuacion en lineas separadas respectivamente.
   */
    public void escribeRecords(){
        PrintWriter escritor;
        String num;
        BufferedWriter bw;
        PrintWriter s;
        try{
            escritor = new PrintWriter(file);
            bw = new BufferedWriter(escritor);
            s = new PrintWriter(bw);
            for(Usuario i : records)
            {
                s.println(i.getName());
                s.println(i.getPoints()+"");
            }
            s.close();
            bw.close();
        }catch(IOException e){}

    }
   /**
   * Metodo que lee el archivo, se crea una instancia de Usuario para ahi guardar el nombre y puntuacion que se han leido, una vez 
   * terminado el proceso de recuperacion del n usuario este se agrega a la LinkedList.
   */
    private void leeRecords(){
        
        Usuario usuario;
        String nombre = "";
        int puntos = 0;
        String texto = "";
        FileReader lector = null;
        String linea = "";
        try {
            lector = new FileReader(file);
            BufferedReader bl = new BufferedReader(lector);
            while ((linea = bl.readLine()) != null) {
                usuario = new Usuario();
                texto = linea;
                usuario.setName(texto);
                //System.out.println(texto);
                if((linea = bl.readLine()) != null){
                    texto = linea;
                    puntos = Integer.parseInt(texto);
                    usuario.setPoints(puntos);
                    //System.out.println(puntos);
                }
                records.add(usuario);
            }   

        } catch (IOException e) {

        } finally {
            if (lector != null) {
                try {
                    lector.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
   /**
     * Metodo que agrega un usuario a la LinkedList, esta una vez agregado el usuario acomoda los nombres con respecto a las puntuaciones
     * y si el tamaño de la lista sobrepasa a 4 esta borra al ultimo usuario.
     * @param Usuario que se quiere agregar a la lista.
     */
    public void addUsuario(Usuario us){        
        records.add(us);
        this.acomodaRecords();
        if(records.size()>4){
            records.remove(0);      
        }
        this.escribeRecords();
    }
   /**
   * Metodo que retorna la variable de records, que es una LinkedList
   */
    public LinkedList<Usuario> escribeTabla(){
        return records;
    }
    /*
    *Metodo privado, acomoda a los usuarios dentro de la lista de acuerdo a sus puntuaciones, o la variable puntos de la clase Usuario
    */
   private void acomodaRecords(){
        Usuario aux;
        int n = records.size();
        for(int c=0;c<n-1;c++){
            for(int c2=0;c2<n-1;c2++){
                if((records.get(c2).getPoints()) > (records.get(c2+1).getPoints())){
                    aux = records.get(c2);
                    records.add(c2,records.get(c2+1));
                    records.remove(c2+2);                    
                }
            }
        }

    }
}
