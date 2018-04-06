
package productos;

/**
 *
 * @author thesecond
 */
public class Productos {
    private String producto;
    private int costo;
    private int cantidad;
    
    public Productos(){}
    
    public Productos(String prod, int cost, int cant){
        this.producto=prod;
        this.costo=cost;
        this.cantidad=cant;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getProducto() {
        return producto;
    }
    
    public int getCosto() {
        return costo;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    //SETTERS
    public void setProducto(String producto) {
        this.producto=producto;
    }

    public void setCosto(int costo) {
        this.costo=costo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
