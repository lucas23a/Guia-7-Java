/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07.errores;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Cristian
 */
public class G07Errores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      HashMap<Integer, String> personas = new HashMap<>();
String n1 = "Albus";
String n2 = "Severus";
personas.put(1, n1);
personas.put(2, n2);

ArrayList<String> bebidas= new ArrayList();
bebidas.add("café");
bebidas.add("té");
Iterator<String> it =bebidas.iterator();
while (it.hasNext()){
if (it.next().equals("café")){
it.remove();

}

    }
        System.out.println(bebidas);
        
       ArrayList<String> libros= new ArrayList(); 
        libros.add("el arte de la guerra");
libros.add("las 48 leyes del poder");
libros.add("el club de la pelea");
libros.add("rebelion en la granja");

for (String aux: libros){
    System.out.println(aux);
}
        
        
        
}
    
  
    
    
    
}