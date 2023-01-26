/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeliService;

import java.util.ArrayList;

import java.util.Scanner;
import pelis.Pelicula;

/**
 *
 *
 * @author Cristian
 */
public class ServicioPeli {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> pelis = new ArrayList();

    public Pelicula crearPeli() {
        Pelicula p = new Pelicula();
        System.out.println("Titulo");
        p.setTitulo(leer.next());
        System.out.println("Director");
        p.setDirector(leer.next());
        System.out.println("Duracion (en horas , minutos)");
        p.setDuracion(leer.nextDouble());
        return p;
    }

    public void agregarPelis() {
        System.out.println("AGREGAR PELICULA");
        do {
            pelis.add(crearPeli());
            System.out.println("Desea agregar otra pelicula? Si/No");
        } while (leer.next().equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("----Lista de peliculas----");
        mostrarPelis();
    }

    public void mostrarPelis() {
        for (Pelicula aux : pelis) {
            System.out.println(aux);
        }
    }

    public void ordenarMayorAMenor() {
        System.out.println(" ");
        System.out.println("----Ordenar por duracion de mayor a menor----");
        pelis.sort(Pelicula.compararDuracionMayor);
        mostrarPelis();
    }

    public void ordenarMenor() {
        System.out.println(" ");
        System.out.println("----Ordenar por duracion de menor a mayor----");
        pelis.sort(Pelicula.compararDuracionMenor);
        mostrarPelis();
    }

    public void ordenarTiulo() {
        System.out.println(" ");
        System.out.println("----Ordenar alfabeticamente por titulo----");
        pelis.sort(Pelicula.compararTitulo);
        mostrarPelis();
    }

    public void ordenarDirector() {
        System.out.println(" ");
        System.out.println("----Ordenar alfabeticamente por director----");
        pelis.sort(Pelicula.compararDirector);
        mostrarPelis();
    }

}

//  public void mayoe1H(){
//crearPeli();
//  for (int i = 0; i < pelis.size(); i++) {
//    if (1 > pelis.get(i).getDuracion())
//}

