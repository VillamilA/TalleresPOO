class Departamento extends Inmobiliaria {
    private int numPiso;

    public Departamento(String direccion, double tamano, int numHabitaciones, double precio, int numPiso) {
        super(direccion, tamano, numHabitaciones, precio);
        this.numPiso = numPiso;
    }
public int getnumPiso() {
    return numPiso;
}
@Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    System.out.println("Numero de piso: " + getnumPiso());
    }
}
