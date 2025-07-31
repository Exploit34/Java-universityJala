package examenes;

/*
Ejercicio 2. Seguimiento de Vacunas COVID-19

Una organización de salud está rastreando la distribución de vacunas COVID-19 en varias ciudades.
Necesitan un programa que calcule el porcentaje de personas vacunadas en cada ciudad y determine
cuál ciudad tiene la mayor tasa de vacunación.

Instrucciones:

El programa debe leer un número entero n que representa el número de ciudades.
Leer n pares de datos: el nombre de la ciudad, el número de personas vacunadas y la población total.
Calcular el porcentaje de personas vacunadas en cada ciudad.
Determinar y mostrar el nombre de la ciudad con la mayor tasa de vacunación.
Ejemplo:

Entrada:
3
CiudadA 5000 10000
CiudadB 3000 6000
CiudadC 7000 14000

Salida:
Ciudad con mayor tasa de vacunación: CiudadC con 50.0%
*/

public class segundo {

    public static String calcularPorcentaje(String[] args, int n) {
        String ciudadMayor = "";
        double mayorPorcentaje = 0.0;

        for (int i = 0; i < n; i++) {
            int index = 1 + i * 3;
            String nombre = args[index];
            int vacunados = Integer.parseInt(args[index + 1]);
            int poblacion = Integer.parseInt(args[index + 2]);

            double porcentaje = (vacunados * 100.0) / poblacion;

            if (porcentaje > mayorPorcentaje) {
                mayorPorcentaje = porcentaje;
                ciudadMayor = nombre;
            }
        }

        return "Ciudad con mayor tasa de vacunación: " + ciudadMayor + " con " + mayorPorcentaje + "%";
    }

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("ingresa el numero de ciudades seguido de los datos de cada ciudad.");
            return;
        }

        try {
            int n = Integer.parseInt(args[0]);

            if (args.length != 1 + n * 3) {
                System.out.println("Error: argumentos incorrecta. Debe ser: n cantidad seguido a los grupos de (nombre vacunados poblacion).");
                return;
            }

            String resultado = calcularPorcentaje(args, n);

            // se llama para que retorne el mesaje de la funcion
            System.out.println(resultado);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

