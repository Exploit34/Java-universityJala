package examenes;
/*
Ejercicio 3. El Puente de las Secuencias Perfectas
En la región oculta de Numeria, hay un misterioso puente que solo puede cruzarse resolviendo un desafío matemático.
Este puente conecta la Casa con la gran Numeria. La leyenda dice que el puente solo permite el paso de
aquellos que logran identificar una "Secuencia Perfecta": una secuencia de números enteros consecutivos cuya suma sea
igual a un número específico N. El guardián del puente necesita tu ayuda para programar un algoritmo que determine si
una secuencia perfecta existe para un N dado. Tu misión es escribir un programa que permita identificar si el número N
puede expresarse como la suma de dos o más números consecutivos. Si es posible, el puente se abrirá y los secretos de
la biblioteca estarán al alcance de los estudiantes. Dado un número entero positivo N, determina si existe al menos una
secuencia de dos o más números consecutivos cuya suma sea igual a NNN. Si es posible, imprime "Puente Abierto",
de lo contrario imprime "Puente Cerrado

Entrada:

El programa recibe un número entero positivo N, donde 1≤N≤10^9

Salida:

El programa debe imprimir:
● "Puente Abierto" si existe al menos una secuencia perfecta.
● "Puente Cerrado" si no existe ninguna secuencia perfecta.

Ejemplos de Entrada y Salida:

Entrada 1:

15

Salida 1:

Puente Abierto

Explicación:

La secuencia perfecta es: 1 + 2 + 3 + 4 + 5 = 15.

Entrada 2:

10

Salida 2:

Puente Abierto

Explicación:

La secuencia perfecta es: 1 + 2 + 3 + 4 = 10

Entrada 3:

8

Salida 3:

Puente Cerrado

Explicación:

No existe una secuencia consecutiva de números que sume 8.
*/

public class tercero {

    public static boolean puenteCasa(int N) {

        for (int i = 2; i * (i + 1) / 2 <= N; i++) {
            int numerador = N - i * (i - 1) / 2;
            if (numerador <= 0) {
                continue;
            }
            if (numerador % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Debes de comple el argumento ejemplo: 6");
            return;
        }

        try {
            int N = Integer.parseInt(args[0]);
            boolean puente = puenteCasa(N);

            if (puente) {
                System.out.println("Puente Abierto");
            } else {
                System.out.println("Puente Cerrado");
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor ingrese un numero valido.");
        }
    }
}
