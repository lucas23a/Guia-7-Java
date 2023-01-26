/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosAdd;

import java.util.Objects;


/**
 *
 * @author Cristian
 */
public class Productos {
    private String prod;
    private int precio;
   

    public Productos() {
    }

    public Productos(String prod, int precio) {
        this.prod = prod;
        this.precio = precio;
    }

    public String getProd() {
        return prod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setProd(String prod) {
        this.prod = prod;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.prod);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
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
        final Productos other = (Productos) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        if (!Objects.equals(this.prod, other.prod)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Productos{" + "prod=" + prod + ", precio=" + precio + '}';
    }

    public void setProd(int precio) {
       this.precio=precio;
    }
     
    
            
            
}
