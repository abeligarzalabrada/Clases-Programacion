public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBaños;

    public InmuebleVivienda(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(idInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }
}