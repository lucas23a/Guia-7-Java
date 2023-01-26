/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlumnoService;

import Alumno.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Servicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> lista = new ArrayList();
    private String n;

    public Alumno crearAlumno() {
        Alumno a1 = new Alumno();
        int cantNotas = 3;
        System.out.println("Nombre del alumno");
        a1.setNombre(leer.next().toUpperCase());
        for (int i = 0; i < cantNotas; i++) {
            System.out.println("Nota" + (i + 1) + ":");
            a1.setNotas(leer.nextInt());
        }
        return a1;
    }

    public void agregarAlumno() {
        boolean x = false;
        do {
            lista.add(crearAlumno());
            System.out.println("Desea agregar otro alumno? Si/No");
        } while (leer.next().equalsIgnoreCase("si"));
        System.out.println("");
        System.out.println("De que alumno quiere calcular la nota final");
        String res = leer.next().toUpperCase();
        for (int i = 0; i < lista.size(); i++) {
            if (res.equals(lista.get(i).getNombre())) {
                x = true;
                n = lista.get(i).getNombre();
                notaFinal();
            }
        }
        if (x == false) {
            System.out.println("No se encuentra el alumno");
        }
    }

    public void notaFinal() {
        int suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (n.equals(lista.get(i).getNombre())) {
                for (Integer e : lista.get(i).getNotas()) {
                    suma = suma + e;
                }
            }
        }
        double prom = suma / 3;
        System.out.println("El promedio de " + n + " es de: " + prom);
    }
}
