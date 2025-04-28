public class Main {
    public static void main(String[] args) {
        Biberia biberia = new Biberia();
        
        // Obtener los aeropuertos
        AeropuertoMilitar militar = (AeropuertoMilitar) biberia.getAeropuerto(0);
        AeropuertoComercial barajas = (AeropuertoComercial) biberia.getAeropuerto(1);
        AeropuertoComercial elPrat = (AeropuertoComercial) biberia.getAeropuerto(2);
        
        // Crear aviones
        AvionPasajeros avion1 = new AvionPasajeros("Boeing 747", "BI-1234", 12000, 300);
        AvionCarga avion2 = new AvionCarga("Airbus A400M", "BI-5678", 8000, 37000);
        Avioneta avion3 = new Avioneta("Cessna 172", "BI-9012", 1200, 4);
        
        // Agregar pasajeros
        avion1.agregarPasajero(new Pasajero("Juan Pérez", "12345678A", 35));
        avion1.agregarPasajero(new Pasajero("María García", "87654321B", 28));
        avion3.agregarPasajero(new Pasajero("Carlos López", "11223344C", 42));
        
        // Asignar aviones a aeropuertos
        militar.agregarAvion(avion2);
        barajas.agregarAvion(avion1);
        elPrat.agregarAvion(avion3);
        
        // Mostrar información
        System.out.println(biberia.getInfoAeropuertos());
        
        // Buscar pasajero
        System.out.println(biberia.buscarPasajero("87654321B"));
    }
}