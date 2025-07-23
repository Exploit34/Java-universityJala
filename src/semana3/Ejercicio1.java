package semana3;

public class Ejercicio1 {
    public static float calculadora(String pais, int ingresos) {

        switch (pais) {
            case "brasil":
                float porcetajeBrasil = 16f / 100;
                return porcetajeBrasil * ingresos;

            case "usa":
                float porcetajeUsa = 12f / 100;
                return porcetajeUsa * ingresos;

            case "india":
                float porcentajeIndia = 10f / 100;
                return porcentajeIndia * ingresos;

            case "mexico":
                float porcentajeMexico = 14f / 100;
                return porcentajeMexico * ingresos;

            case "españa":
                float porcentajeEspana = 50f / 100;
                return porcentajeEspana * ingresos;

            default:
                System.out.print("País no válido. Solo se permiten: Brasil, USA, India, Mexico, España.");
                return 0f;
        }
    }

    public static void main(String[] args) {
        if (args.length >= 2) {
            String nombrePais = args[0];

            try {
                int ingresosNetos = Integer.parseInt(args[1]);
                float subTotal = calculadora(nombrePais, ingresosNetos);

                float total = ingresosNetos - subTotal;

                System.out.println("El impuesto que se debe pagar por residir en " + nombrePais + " es " + subTotal);
                System.out.println("El monto restante después de pagar impuestos es: " + total);
            } catch (NumberFormatException e) {
                System.out.println("El segundo argumento debe ser un número entero.");
            }
        } else {
            System.out.println("Debes pasar dos argumentos: nombre e ingresos");
        }
    }
}
