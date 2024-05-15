package PrimeraClaseEjercicio;

public class Main {
    public static void main(String[] args) {
        Ave Canario = new Ave("Canario", "Azul", "Granos");
        Ave Carpintero = new Ave("Carpintero", "Rojo con negro", "Insectos");
        Ave Pinguino = new Ave("Pinguino", "Negro con blanco", "Pescado");
        Ave Garza = new Ave("Garza", "Blanco con Azul", "Crustaceos");
        Ave Gavilan = new Ave("Gavilan", "Cafe oscuro", "Aves");

        Canario.datos(Canario);
        Carpintero.datos(Carpintero);
        Pinguino.datos(Pinguino);
        Garza.datos(Garza);
        Gavilan.datos(Gavilan);
        System.out.println("___________________________________________________");
        Canario.volar(Canario);
        Carpintero.volar(Carpintero);
        Pinguino.volar(Pinguino);
        Garza.volar(Garza);
        Gavilan.volar(Gavilan);
        System.out.println("___________________________________________________");
        Canario.alimentacion(Canario);
        Carpintero.alimentacion(Carpintero);
        Pinguino.alimentacion(Pinguino);
        Garza.alimentacion(Garza);
        Gavilan.alimentacion(Gavilan);
    }
}
