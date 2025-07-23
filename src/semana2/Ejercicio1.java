package semana2;

public class Ejercicio1 {
    public static void persona(String nombre) {
        System.out.println("Hola, soy yo " + nombre);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String nombre = args[0];
            persona(nombre);
        }
    }
}