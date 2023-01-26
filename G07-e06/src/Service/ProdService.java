/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import ProductosAdd.Productos;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ProdService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Productos p1 = new Productos();
    HashMap<String, Integer> lista = new HashMap();

    public HashMap<String, Integer> lista(Productos prod) {
        do {
            // Productos p1 = new Productos();
            System.out.println("Nombre del producto");
            //  p1.setProd(leer.next());
            String prod1 = leer.next();
            System.out.println("Precio");
            int precio = leer.nextInt();
            //lista.put();      
            p1.setProd(precio);
            lista.put(prod1, precio);
            System.out.println("Desea agregar otro producto");
            //prod= leer.next();
        } while (leer.next().equalsIgnoreCase("si"));

        return lista;
    }

    public void verProductos() {
        System.out.println("");
        for (Map.Entry<String, Integer> entry : lista.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();            
            System.out.println("Producto: [" + key + "] Precio: [" + value + "]");
            
        }
        System.out.println("");
    }

    public void cambiarPrecio() {
        System.out.println("");
        System.out.println("Ingrese el producto que desea modificar el precio");
        String cambiar = leer.next();
        if (lista.containsKey(cambiar)) {
            System.out.println("Precio nuevo");
            lista.replace(cambiar, leer.nextInt());
            System.out.println("");
        }

    }

}
