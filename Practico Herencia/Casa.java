public class Casa extends InmuebleVivienda {
    protected int cantidadPisos;

    public Casa(int idInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int cantidadPisos) {
        super(idInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
        this.cantidadPisos = cantidadPisos;
    }
}