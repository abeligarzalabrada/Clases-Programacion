public class CasaConjuntoCerrado extends CasaUrbana {
    protected double valorAdministracion;
    protected boolean incluyeAreasComunes;

    public CasaConjuntoCerrado(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int cantidadPisos, double valorAdministracion, boolean incluyeAreasComunes) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, cantidadPisos);
        this.valorAdministracion = valorAdministracion;
        this.incluyeAreasComunes = incluyeAreasComunes;
    }
}