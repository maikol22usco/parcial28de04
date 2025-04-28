public class AeropuertoMilitar extends Aeropuerto {
    private String nombreClave;
    
    public AeropuertoMilitar(String nombre, String ciudad, String nombreClave) {
        super(nombre, ciudad);
        this.nombreClave = nombreClave;
    }
    
    @Override
    public String getInfoAviones() {
        return "Aeropuerto Militar " + nombre + " (" + nombreClave + ")\n" + 
               "Ubicación: " + ciudad + "\n\n" + 
               super.getInfoAviones();
    }
    
    // Getter adicional
    public String getNombreClave() { return nombreClave; }
}