public class Inmobiliaria {
    String direccion;
    double tamano;
    int numHabitaciones;
    double precio;

    public Inmobiliaria(String direccion, double tamano, int numHabitaciones, double precio) {
        this.direccion = direccion;
        this.tamano = tamano;
        this.numHabitaciones = numHabitaciones;
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getTamano() {
        return tamano;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarInformacion(){
        System.out.println("Se encuentra en "+direccion+" tiene un tamaño de "+tamano+"m^2 con un numero de "+numHabitaciones+" habitaciones, a tan solo $"+precio+" dólares ");
    }
}
