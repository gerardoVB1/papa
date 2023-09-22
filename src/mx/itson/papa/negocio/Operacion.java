/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.papa.negocio;

/**
 *
 * @author Gerardo Valdez
 */
public class Operacion {
    
        public static boolean palindromo (String oracion){
       
        // Se convierte la oración en minúsculas, y limpiamos la cadena.
        oracion = oracion.toLowerCase().replace(" ","").replace("á","a").replace("ó","o").replace("í", "i").replace(",","").replace("!","").replace("¡","");
       
        // Se convierte la oración en un arreglo de caracteres.
        char [] letras = oracion.toCharArray();
        
        // Se invierte la cadena para verificar si es un palíndromo.
        String invertida = "";
        for (int a = letras.length-1;a>=0;a--){
            invertida += letras[a];
        }
      return oracion.equals(invertida);
   
      }
    
    }

