import java.util.ArrayList;

public abstract class Aeropuerto {
    protected String nombre;
    protected String ciudad;
    protected ArrayList<Avion> aviones;
    
    public Aeropuerto(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.aviones = new ArrayList<>();
    }
    
    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }
    
    public String getInfoAviones() {
        StringBuilder info = new StringBuilder();
        info.append("Aviones en ").append(nombre).append(":\n");
        for (Avion a : aviones) {
            info.append(a.getInfoCompleta()).append("\n\n");
        }
        return info.toString();
    }
    
    public Avion buscarAvionConPasajero(String dni) {
        for (Avion a : aviones) {
            if (a instanceof AvionPasajeros) {
                AvionPasajeros ap = (AvionPasajeros) a;
                if (ap.buscarPasajero(dni) != null) {
                    return a;
                }
            } else if (a instanceof Avioneta) {
                Avioneta av = (Avioneta) a;
                if (av.buscarPasajero(dni) != null) {
                    return a;
                }
            }
        }
        return null;
    }
    
    // Getters
    public String getNombre() { return nombre; }
    public String getCiudad() { return ciudad; }
    public ArrayList<Avion> getAviones() { return aviones; }
}