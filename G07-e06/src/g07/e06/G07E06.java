/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g07.e06;

import ProductosAdd.Productos;
import Service.ProdService;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class G07E06 {

    /**
     * Se necesita una aplicación para una tienda en la cual queremos almacenar
     * los distintos productos que venderemos y el precio que tendrán. Además,
     * se necesita que la aplicación cuente con las funciones básicas. Estas las
     * realizaremos en el servicio. Como, introducir un elemento, modificar su
     * precio, eliminar un producto y mostrar los productos que tenemos con su
     * precio (Utilizar Hashmap). El HashMap tendrá de llave el nombre del
     * producto y de valor el precio. Realizar un menú para lograr todas las
     * acciones previamente mencionadas.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ProdService ps = new ProdService();
        Productos p1 = new Productos();
        int opc = 0;
        do {
            System.out.println("Elija una opcion:");
            System.out.println("1- Agregar productos");
            System.out.println("2- Modificar precio");
            System.out.println("3- Ver lista de productos");
            System.out.println("4- Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    ps.lista(p1);
                    break;
                case 2:
                    ps.cambiarPrecio();
                    break;
                case 3:
                    ps.verProductos();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opc != 4);

    }

}
