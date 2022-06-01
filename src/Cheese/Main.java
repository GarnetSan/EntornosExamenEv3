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
         Producto prod1 = new Producto("001", "Entera", 1, 1.2);
         
         String cod2 = "";
         Producto prod2 = null;
         
         Producto prodAux;
         
         ListaProductos miListaProductos = new ListaProductos();
         
         miListaProductos.addProducto(prod1);
         prodAux = miListaProductos.buscarProducto(cod1);
         prodAux.imprime_etiqueta();
         prodAux = miListaProductos.eliminarProducto(cod1);
         prodAux.imprime_etiqueta();
         miListaProductos.addProducto(prod2);
         miListaProductos.buscarProducto(cod2);
         miListaProductos.eliminarProducto(cod2);
         
         
         
    }
}
