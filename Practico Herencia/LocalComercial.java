public class LocalComercial extends Local {
    protected String centroComercial;

    public LocalComercial(int idInmobiliario, int area, String direccion, Localizacion localizacion, String centroComercial) {
        super(idInmobiliario, area, direccion, localizacion);
        this.centroComercial = centroComercial;
    }
}