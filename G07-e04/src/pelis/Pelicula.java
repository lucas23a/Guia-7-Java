/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pelis;

import java.util.Comparator;

/**
 * public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula
 * p2) -> p2.getTitulo().compareTo(p1.getTitulo());
 *
 * @author Cristian
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "Titulo=" + titulo + ", Director=" + director + ", Duracion=" + duracion + '}';
    }

    public static Comparator<Pelicula> compararDuracionMayor = (Pelicula p1, Pelicula p2)
            -> Double.compare(p2.getDuracion(), p1.getDuracion());

    public static Comparator<Pelicula> compararDuracionMenor = (Pelicula p1, Pelicula p2)
            -> Double.compare(p1.getDuracion(), p2.getDuracion());

    public static Comparator<Pelicula> compararTitulo = (Pelicula p1, Pelicula p2)
            -> p1.getTitulo().compareTo(p2.getTitulo());

    public static Comparator<Pelicula> compararDirector = (Pelicula p1, Pelicula p2)
            -> p1.getDirector().compareTo(p2.getDirector());

}
