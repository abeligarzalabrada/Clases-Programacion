public class Oficina extends Local {
    protected boolean esGobierno;

    public Oficina(int idInmobiliario, int area, String direccion, Localizacion localizacion, boolean esGobierno) {
        super(idInmobiliario, area, direccion, localizacion);
        this.esGobierno = esGobierno;
    }
}