public class CasaIndividual extends Inmobiliaria {
    private double tamanoTerreno;

    public CasaIndividual(String direccion, double tamano, int numHabitaciones, double precio, double tamanoTerreno) {
        super(direccion, tamano, numHabitaciones, precio);
        this.tamanoTerreno = tamanoTerreno;
    }
    public double getTamanoTerreno() {
        return tamanoTerreno;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println(" Tamaño terreno " + getTamanoTerreno());
    }
}
