import java.util.ArrayList;

public class Biberia {
    private ArrayList<Aeropuerto> aeropuertos;
    
    public Biberia() {
        this.aeropuertos = new ArrayList<>();
        // Inicializar los 3 aeropuertos (1 militar y 2 comerciales)
        aeropuertos.add(new AeropuertoMilitar("Base Aérea Madrid", "Madrid", "Águila Real"));
        aeropuertos.add(new AeropuertoComercial("Barajas", "Madrid", 4));
        aeropuertos.add(new AeropuertoComercial("El Prat", "Barcelona", 3));
    }
    
    public String buscarPasajero(String dni) {
        for (Aeropuerto a : aeropuertos) {
            Avion avion = a.buscarAvionConPasajero(dni);
            if (avion != null) {
                Pasajero p = null;
                if (avion instanceof AvionPasajeros) {
                    p = ((AvionPasajeros) avion).buscarPasajero(dni);
                } else if (avion instanceof Avioneta) {
                    p = ((Avioneta) avion).buscarPasajero(dni);
                }
                
                return "Pasajero encontrado:\n" + p.getInfo() + "\n" +
                       "Avión: " + avion.getNombre() + " (" + avion.getMatricula() + ")\n" +
                       "Aeropuerto: " + a.getNombre() + " en " + a.getCiudad();
            }
        }
        return "Pasajero con DNI " + dni + " no encontrado en ningún avión.";
    }
    
    public String getInfoAeropuertos() {
        StringBuilder info = new StringBuilder();
        info.append("Red de Aeropuertos de Biberia:\n\n");
        for (Aeropuerto a : aeropuertos) {
            info.append(a.getInfoAviones()).append("\n");
        }
        return info.toString();
    }
    
    // Métodos para acceder a los aeropuertos
    public Aeropuerto getAeropuerto(int index) {
        if (index >= 0 && index < aeropuertos.size()) {
            return aeropuertos.get(index);
        }
        return null;
    }
}