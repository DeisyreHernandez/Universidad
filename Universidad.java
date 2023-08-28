

public class Universidad {
    String nombre;
    String ubicacion;
    int añoInicio;
    int codigoU;
    

    public Universidad(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public Universidad(int añoInicio, int codigoU) {
        this.añoInicio = añoInicio;
        this.codigoU = codigoU;
    }

    Universidad(String sergio_Arboleda, String bogota, int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void tipodeU(){
                System.out.println("\nSomos la universidad:"+nombre+"\nEstamos ubicados en es: "+ubicacion+"\n Nuestro Inicio fueron en el año: "
               +añoInicio+"\nNuestro código ante el MDE es: "+codigoU);
    }
     
    public void tipodeU(String uni){
        System.out.println("\nNuestra universidad es: "+uni);
    }
    

    public int getAñoInicio() {
        return añoInicio;
    }

    public void setAñoInicio(int añoInicio) {
        this.añoInicio = añoInicio;
    }

    public int getcodigoU() {
        return codigoU;
    }

    public void setCodigoU(int codigoU) {
        this.codigoU = codigoU;
    }
    
    

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}




