public class AvionCarga extends Avion {
    private double cargaMaximaKg;
    
    public AvionCarga(String nombre, String matricula, int autonomiaKm, double cargaMaximaKg) {
        super(nombre, matricula, autonomiaKm);
        this.cargaMaximaKg = cargaMaximaKg;
    }
    
    @Override
    public String getInfoCompleta() {
        return "Avión de Carga: " + nombre + "\n" +
               "Matrícula: " + matricula + "\n" +
               "Autonomía: " + autonomiaKm + " km\n" +
               "Carga máxima: " + cargaMaximaKg + " kg";
    }
    
    // Getter adicional
    public double getCargaMaximaKg() { return cargaMaximaKg; }
}