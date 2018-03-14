package datos.generales;

// autor Fernando

public class DatosGenerales {

    String nombre, apellido, ciudad,anios,carnet;
    
    public DatosGenerales(String nombre, String apellido, String anios, String ciudad, String carnet){
        this.anios=anios;
        this.apellido=apellido;
        this.carnet=carnet;
        this.ciudad=ciudad;
        this.nombre=nombre;
    }
    public void mostrar(){
        System.out.println("Nombre:"+nombre+ " Apellido: "+apellido +" Anios: "+anios +" Ciudad: "+ciudad+" Carnet: "+carnet);
    }
    
}
