/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07.manos.a.la.obra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 *
 * @author Cristian
 */
public class G07ManosALaObra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Integer> listado = new ArrayList();
        int n1 = 8;
        int n2 = 23;
        listado.add(n2);
        listado.add(n1);
        listado.add(n2);
        listado.add(n1);
        listado.add(n1);

        listado.remove(2);

        TreeSet<String> nombres = new TreeSet();
        nombres.add("lucas");
        nombres.add("ale");
        nombres.add("mora");
        nombres.add("fara");
        nombres.add("sol");

        nombres.remove("fara");

        HashMap<Integer, String> personas = new HashMap();

        personas.put(1, "hola mundo");
        personas.put(2, "hello world");
        personas.put(3, "salut monde");
        personas.put(4, "hi there");
        personas.put(5, "buen dia");
        
        personas.remove(3);
        
   
       

    }

}
