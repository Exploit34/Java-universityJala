package semana3;

public class Ejercicio1 {
    public static float calculadora(String pais, int ingresos) {

        switch (pais) {
            case "brasil":
                return ingresos * 0.16f;
            case "usa":
                return ingresos * 0.12f;
            case "india":
                return ingresos * 0.10f;
            case "mexico":
                return ingresos * 0.14f;
            case "españa":
                return ingresos * 0.50f;
            default:
                System.out.println("País no válido. Solo se permiten: Brasil, USA, India, Mexico, España.");
                return 0f;
        }
    }

    public static void main(String[] args) {
        if (args.length >= 2) {
            String nombrePais = args[0];

            try {
                int ingresosNetos = Integer.parseInt(args[1]);

                if (ingresosNetos < 0 ) {
                    System.out.println("Los ingresos no pueden ser negativos.");
                    return;
                }

                float subTotal = calculadora(nombrePais, ingresosNetos);

                float total = ingresosNetos - subTotal;

                System.out.println("El impuesto que se debe pagar por residir en '" + nombrePais + "' es " + subTotal);
                System.out.println("El monto restante después de pagar impuestos es: " + total);
            } catch (NumberFormatException e) {
                System.out.println("El segundo argumento debe ser un número entero.");
            }
        } else {
            System.out.println("Debes pasar dos argumentos: nombre e ingresos");
        }
    }
}
