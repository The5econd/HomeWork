/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

/**
 *
 * @author thesecond
 */
public class Proveedor {
    private String nombre;
    private int telefono;
    private int email;
    private int NIT;
    private String productoProporcionado;
    
    public Proveedor(){}
    
    public Proveedor(String nom, int tel, int email, int nit, String prodProp){
        this.nombre=nom;
        this.telefono=tel;
        this.email=email;
        this.NIT=nit;
        this.productoProporcionado=prodProp;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getNombre() {
        return nombre;
    }
    
    public int getTelefono() {
        return telefono;
    }
    
    public int getEmail() {
        return email;
    }
    public int getNit(){
        return NIT;
    }
    public String getProductoProp(){
        return productoProporcionado;
    }
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono=telefono;
    }

    public void setEmail(int email) {
        this.email=email;
    }
    public void setNit(int NIT){
        this.NIT=NIT;
    }
    public void setProductoProp(String productoProporcionado){
        this.productoProporcionado=productoProporcionado;
    }
    
}
