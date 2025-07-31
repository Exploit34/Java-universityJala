package examenes;

/*
Ejercicio 1. El laboratorio de mezclas
En la clase de química avanzada de la Universidad de JALA, los estudiantes experimentan con
tres sustancias reactivas. Cada una tiene un valor numérico que representa su nivel de energía.

Para que la mezcla sea segura y estable, deben cumplirse tres condiciones:
    1. Ninguna sustancia puede tener un valor negativo.
    2. La suma total de las tres sustancias debe ser divisible entre 3.
    3. Ninguna sustancia puede tener un valor mayor al doble de la suma de las otras dos. (Esto evita que una sustancia domine la mezcla)

Tu misión:

Escribe un programa que reciba los niveles de energía de tres sustancias y determine si
la mezcla es aprobada o rechazada, aplicando las tres reglas.

Entrada:

Tres números enteros positivos que representan los niveles de energía de las sustancias A, B y C.

Salida:

Si se cumplen las tres condiciones:
 "Mezcla Aprobada"
En cualquier otro caso:
 "Mezcla Rechazada"

Ejemplos de Entrada y Salida:

Entrada 1:

3 3 3

Salida 1:

Mezcla Aprobada

Explicación:

• Todos los valores son positivos
• Suma = 9 → divisible entre 3
• Cada valor (3) es menor o igual que el doble de la suma de los otros dos.

Entrada 2:

3 6 3

Salida 2:

Mezcla Aprobada

Explicación:

• Todos positivo
• Suma = 12 → divisible entre 3
• Comprobamos condición 3:

3 ≤ (2 × (6+3)) → 3 ≤ 18
6 ≤ (2 × (3+3)) → 6 ≤ 12
3 ≤ (2 × (3+6)) → 3 ≤ 18
Entrada 3:

10 0 -2

Salida 3:

Mezcla Rechazada

Explicación:

• Hay un valor negativo
• Aunque suma = 8, no importa, ya está rechazada por la primera condición.
*/

public class primerExamen {
    public static void quimica(int num1, int num2, int num3) {

        // se verifica si el los numeros cumplen
        if (num1 % 2 == 1 && num2 % 2 == 1 && num3 % 2 == 1) {
            System.out.println("Mezcla Aprobada");
        } else {
            System.out.println("Mezcla Rechazada");
        }
    }

    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Se necesitan los tres numeros enteros");
        }

        try {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);

            if (num1 < 0 || num2 < 0 || num3 < 0) {
                System.out.println("no se permiten numeros negativos");
            } else {
                quimica(num1, num2, num3);
            }
        } catch (NumberFormatException e) {
            System.out.println("Solo se permiten numeros");
        }
    }
}
