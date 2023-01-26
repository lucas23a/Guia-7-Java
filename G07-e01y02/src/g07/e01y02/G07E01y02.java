/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07.e01y02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class G07E01y02 {

    /**
     * Diseñar un programa que lea y guarde razas de perros en un ArrayList de
     * tipo String. El programa pedirá una raza de perro en un bucle, el mismo
     * se guardará en la lista y después se le preguntará al usuario si quiere
     * guardar otro perro o si quiere salir. Si decide salir, se mostrará todos
     * los perros guardados en el ArrayList.
     * 2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<String> razas = new ArrayList();
        String resp;
        boolean x = true;
        do {
            System.out.println("Agregue una raza de perro");
            razas.add(leer.next());
            System.out.println("Desea agregar otra raza? S/N");
            resp = leer.next();
            if (resp.equalsIgnoreCase("s")) {
                continue;
            } else if (resp.equalsIgnoreCase("n")) {
                x = false;
            } else {
                System.out.println("Respuesta no valida");
            }

        } while (x == true);

        System.out.println(" ");
        for (String aux : razas) {
            System.out.println("[" +aux+"]");
        }
        System.out.println(" ");
        System.out.println("Que raza quiere eliminar?");
        resp= leer.next();
        
        boolean j = false;
        for (int i = 0; i < razas.size(); i++) {
            
            if (resp.equalsIgnoreCase(razas.get(i))){
                razas.remove(i);
            j= true;
            }
        }
        if (j==false){
            System.out.println("No se encuentra en la lista");
        }
        
        
        System.out.println(" ");
        Collections.sort(razas);
          for (String aux : razas) {
            System.out.println("[" +aux+"]");
        
        
        
    }
    }
}
