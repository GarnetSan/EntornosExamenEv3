/*
*	grupo  : GDAM1-1
*	alumno : Miguel Rubio Tardieu
*	n.exp. : 7244
*	fecha  : 01/06/2022
 */
package Cheese;

/**
 *
 * @author ___
 */
public class Main {
    
     public static void main(String[] args) {
    
         System.out.println("1º Gdam: Entornos de desarrollo");
         String cod1 = "001";
         Producto prod1 = new Producto(cod1, "Entera", 1, 1.2);
         
         String cod2 = "002";
         Producto prod2 = new Producto(cod2, "Semi", 3, 1.1);
         
         
         ListaProductos miListaProductos = new ListaProductos();
         
         miListaProductos.addProducto(prod1);
         miListaProductos.buscarProducto(cod1).imprime_etiqueta();
         miListaProductos.addProducto(prod2);
         miListaProductos.buscarProducto(cod2).imprime_etiqueta();
         
    }
}
