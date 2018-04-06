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
public class Administrador {
    private String usuario, contrasenia, nombre, apellido;
    
    public Administrador(){}
    
    public Administrador(String usu, String contra, String nom, String apell){
    this.usuario=usu;
    this.contrasenia=contra;
    this.nombre=nom;
    this.apellido=apell;
    }
    
    //GETTERS
    public String getUsuario(){
        return usuario;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    
    
    //SETTERS
    public void setUsuario(String usu){
        this.usuario=usu;
    }
    public void setContrasenia(String contra){
        this.contrasenia=contra;
    }
    public void setNombre(String nom){
        this.nombre=nom;
    }
    public void seApellido(String apell){
        this.apellido=apell;
    }
}
