/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaisesAdd;

import java.util.Comparator;
import java.util.Objects;

/**
 *
 * @author Cristian
 */
public class Pais implements Comparable<Pais> {
    private String nombre;

    @Override
    public String toString() {
        return  nombre ;
    }

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }
   @Override
    public int compareTo(Pais t) {
      return this.nombre.compareToIgnoreCase(t.getNombre());
    }
    
   //public static Comparator<Pais> ordenarAlf = (Pais p1, Pais p2)
     //      -> p1.getNombre().compareTo(p2.getNombre());
    
}
