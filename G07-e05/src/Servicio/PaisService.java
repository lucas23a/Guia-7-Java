/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import PaisesAdd.Pais;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Cristian
 */
public class PaisService {

    Scanner leer = new Scanner(System.in);
    Set<Pais> paises = new HashSet();

    public Pais crearPais() {
        Pais p = new Pais();
        System.out.println("Ingrese un pais");
        p.setNombre(String.valueOf(leer.next().toUpperCase()));
        return p;

    }

    public void agregarPais() {
        do {
            paises.add(crearPais());
            System.out.println("Desea agregar otro pais");
        } while (leer.next().equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("----Lista de Paises----");
        mostrarPaises();
    }

    public void mostrarPaises() {
        for (Pais aux : paises) {
            System.out.println("[" + aux + "]");
            System.out.println("");
        }
    }

    public void ordenar() {
        System.out.println("----Ordenar Alfabeticamente---");
       
        mostrarPaises();
        System.out.println(" ");
    }

    public void eliminarPais() {
        int a= paises.size();
        System.out.println("---Que pais quiere eliminar?----");
          Pais borrar = new Pais();
          borrar.setNombre(leer.next().toUpperCase());
             paises.remove(borrar);
          int b= paises.size();
        
        if (a==b) {
            System.out.println("El pais no se encuentra en el conjunto");
        }
        System.out.println("La lista queda asi:");
        mostrarPaises();
    }
}
