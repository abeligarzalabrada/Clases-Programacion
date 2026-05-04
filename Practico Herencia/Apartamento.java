public class Apartamento extends InmuebleVivienda {
    protected double valorAdministracion;

    public Apartamento(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, double valorAdministracion) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorAdministracion = valorAdministracion;
    }
}