public class AeropuertoComercial extends Aeropuerto {
    private int numTerminales;
    
    public AeropuertoComercial(String nombre, String ciudad, int numTerminales) {
        super(nombre, ciudad);
        this.numTerminales = numTerminales;
    }
    
    @Override
    public String getInfoAviones() {
        return "Aeropuerto Comercial " + nombre + "\n" +
               "Ubicación: " + ciudad + "\n" +
               "Terminales: " + numTerminales + "\n\n" +
               super.getInfoAviones();
    }
    
    // Getter adicional
    public int getNumTerminales() { return numTerminales; }
}