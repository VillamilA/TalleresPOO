class Suite extends Inmobiliaria {
    private boolean tieneJacuzzi;

    public Suite(String direccion, double tamano, int numHabitaciones, double precio, boolean tieneJacuzzi) {
        super(direccion, tamano, numHabitaciones, precio);
        this.tieneJacuzzi = tieneJacuzzi;
    }

    public boolean isTieneJacuzzi() {
        return tieneJacuzzi;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene jacuzzi: " + (isTieneJacuzzi() ? "Si" : "No"));
    }
}
