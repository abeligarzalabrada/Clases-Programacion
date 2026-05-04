public class Main {
    public static void main(String[] args) {
        
        CasaRural c1 = new CasaRural(12345, 120, "Vereda El Sol", 3, 2, 2, 15, 2000);
        System.out.println("Dir: " + c1.direccion + " - ID: " + c1.idInmobiliario);
        
        Apartaestudio apto = new Apartaestudio(54321, 40, "Calle 100 # 15-20", 1, 150000);
        System.out.println("Apto en " + apto.direccion + " tiene " + apto.numeroHabitaciones + " habitacion");
        
        Oficina ofi = new Oficina(98765, 80, "Edificio Central", Localizacion.INTERNO, true);
        System.out.println("Oficina del gobierno: " + ofi.esGobierno);
    }
}
