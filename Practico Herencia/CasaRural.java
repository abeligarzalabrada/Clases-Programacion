public class CasaRural extends Casa {
    protected double distanciaCabecera;
    protected double altitud;

    public CasaRural(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int cantidadPisos, double distanciaCabecera, double altitud) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, cantidadPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
    }
}