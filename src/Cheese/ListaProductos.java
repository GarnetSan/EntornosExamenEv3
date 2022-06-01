/*
 * Examen Entornos de desarrollo - Enunciado
 */

package Cheese;
/**
 * Imports del paquete
 */

import java.util.ArrayList;
import java.util.HashMap;


public class ListaProductos {

    /**
     * Estructura HashMap para almacenar los productos de la lista de productos
     * @see "HashMap java doc"
     */
    private HashMap<String, Producto> listaP = new HashMap();
    
    /**
     * Cuenta calculada con el número de productos contenidos en la lista
     */
    private static int n = 0;


    /**
     * Devuelve el número de productos dentro de la lista
     * @return Numero de productos listados
     */
    private int getN() {
        return n;
    }

    /**
     * Cambia el número de productos en la lista
     * @param n Nuevo número de productos
     */
    private void setN(int n) {
        this.n = n;
    }
    /**
     * Comprueba si la cadena pasada es valida ( no está vacía)
     * @param campo cadena a analizar
     * @return True: Cadena vacía, False: Cadena correcta
     */
    private boolean check_null(String campo){
    
        if (campo.replace(" ","") == "")  return true; else return false;
    }

    /**
     * Añade un nuevo producto al HashMap de productos (en el caso de que no 
     * esté en ella).
     * @param prod Objeto de tipo Producto a añadir en el HashMap
     * @return Devuelve el producto insertado (mismo que el parametro de 
     * entrada) o "null" en el caso de que ya estuviese en el HashMap
     */
    public Producto addProducto(Producto prod) {
        
        if(check_null(prod.getcode())){
            System.out.println("Producto no inicializado");
            return null;
        }
        
        if (listaP.containsKey(prod.getcode())) {
            // System.out.println("Producto con código duplicado");
            return null;
        }
        n++;
        this.setN(n);
        listaP.put(prod.getcode(), prod);
        return prod;
    }

    /**
     * Elimina un producto de la lista a partir de su código de control en el HashMap (si está)
     * @param codigo Código identificador del producto a eliminar
     * @return Devuelve el producto eliminado, o "null" si no estaba en el HashMap
     */
    public Producto eliminarProducto(String codigo) { 
        
        if(check_null(codigo)){
            System.out.println("Codigo no válido");
            return null;
        }
        
        Producto prod = buscarProducto(codigo);
        if (prod != null) {
        listaP.remove(codigo);
        n--;
        this.setN(n);
        }
        return prod;
    }

    /**
     * Busca un producto en el HashMap a partir de un código identificador
     * @param codigo Código de idenificación del producto
     * @return Devuelve el producto si se encuentra el producto en el HashMap o 
     * null en el caso de que el código no esté en él
     */
    public Producto buscarProducto(String codigo) { 
        Producto prod = null;
        
        if(check_null(codigo)){
            System.out.println("Codigo no válido");
            return null;
        }
        
        if (!listaP.containsKey(codigo)) {
            return prod;
        }
        else{
            return listaP.get(codigo);
        }
    }

    /**
     * Exporta una lista dinámica de todos los productos contenidos en el HashMap
     * @return ArrayList de los productos en la lista
     */
    public ArrayList<Producto> getProductos() {
        ArrayList<Producto> prodsList = new ArrayList<>();
        prodsList.addAll(listaP.values());
        return prodsList;
    }
    
    /**
     * Hace llamada al método getN para conseguir el número de productos en la lista
     * @return Numero de productos listados
     */
    public int totalProductos(){
            return this.getN();
    }
}
