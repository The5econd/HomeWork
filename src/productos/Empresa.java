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
public class Empresa {
    private String nombre, fechaFundacion, NIT;
    
    public Empresa(){}
    
    public Empresa(String nom, String fechFun, String nit){
        this.nombre=nom;
        this.fechaFundacion=fechFun;
        this.NIT=nit;
    }
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getFecha(){
        return fechaFundacion;
    }
    public String getNit(){
        return NIT;
    }
    
    //SETTERS
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void setFecha(String fechFun){
        this.fechaFundacion=fechFun;
    }
    public void setNit(String nit){
        this.NIT=nit;
    }
    
}
