public class MainInmobiliaria {
        public static void main(String[] args) {
            Departamento departamento = new Departamento("Quitro-Cumbaya", 80.5, 2, 120000, 5);
            CasaIndividual casa = new CasaIndividual("Guayaquil Guasmo Sur", 155.6, 4, 250000, 300.0);
            Suite suite = new Suite("Tumbaco", 60.0, 1, 80000, false);

            System.out.println("Información del Departamento:");
            departamento.mostrarInformacion();

            System.out.println("\nInformacion de la Casa Individual:");
            casa.mostrarInformacion();

            System.out.println("\nInformacion de la Suite:");
            suite.mostrarInformacion();
        }
    }
