/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olc_p1;


import java.io.CharArrayReader;
import UI.UI_0001;
import java.io.FileInputStream;
import analizadores.*;
import java.io.StringReader;
import java_cup.runtime.Symbol;
import jdk.nashorn.internal.parser.Token;
/**
 *
 * @author R0GV3_00
 */




public class lectura_de_datos {   
    
    
    
    
    
    public  static void analizar_000(String var3){
      analizadores.Sintactico pars;
        try {
            pars=new analizadores.Sintactico(new analizadores.Lexico(new CharArrayReader(var3.toCharArray()) ));
            pars.parse();        
        } catch (Exception ex) {
            //System.out.println("Error fatal en compilación de entrada.");
            System.out.println("Causa: "+ex.getCause());           
        } 
        
    }
    
    public static void imprimir_cadenas(String var3) {
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
