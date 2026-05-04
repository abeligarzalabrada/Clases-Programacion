public class Local extends Inmueble {
    protected Localizacion localizacion;

    public Local(int idInmobiliario, int area, String direccion, Localizacion localizacion) {
        super(idInmobiliario, area, direccion);
        this.localizacion = localizacion;
    }
}