
package OLC_P1;

import java.io.FileInputStream;

/**
 * Clase principal de la aplicación
 * @author Erick
 */
public class Main {

    /**
     * @param args argumentos de la linea de comando
     */
    public static void main(String[] args) {
        interpretar("entrada.txt");
    }
    /**
     * Método que interpreta el contenido del archivo que se encuentra en el path
     * que recibe como parámentro
     * @param path ruta del archivo a interpretar
     */
    private static void interpretar(String path) {
        analizadores.Sintactico pars;
        try {
            pars=new analizadores.Sintactico(new analizadores.Lexico(new FileInputStream(path)));
            pars.parse();        
        } catch (Exception ex) {
            System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex.getCause());
        } 
    }
    
}