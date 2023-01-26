/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Alumno {

    private String nombre;
    private List<Integer> notas = new ArrayList<>();

    public Alumno() {
    }

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // public List<Integer> getNotas() {
    //   return notas;
    //}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public Iterator<Integer> getNota() {
        return notas.iterator();
    }

   public void setNotas(int notas) {
       this.notas.add(notas);

   }
   

    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }

}
