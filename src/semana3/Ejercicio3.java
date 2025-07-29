package semana3;

public class Ejercicio3 {
    public static void numerosPromedio() {
        int suma = 0;
        int cantidad = 0;
        double promedio = 0;

        while (promedio <= 50 || cantidad <= 5) {
            int numero = (int)(Math.random() * 101);
            suma += numero;
            cantidad++;
            promedio = (double)suma / cantidad;
            System.out.println("Número generado: " + numero + ", promedio actual: " + promedio);
        }

        System.out.println("Se generaron " + cantidad + " números y el promedio final es: " + promedio);
    }

    public static int menosUno(int[] numeros) {
        int suma = 0;

        for (int numero : numeros) {
            if (numero == -1) {
                break;
            }
            suma += numero;
        }

        return suma;
    }

    public static void mayorMenor(int[] numeros) {
        if (numeros.length == 0) {
            System.out.println("No se ingresaron números.");
            return;
        }

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

    public static void main(String[] args) {
        int[] numeros = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }

        //promedio
        numerosPromedio();

        //Sumar
        int suma = menosUno(numeros);
        System.out.println("La suma es: " + suma);

        //MayorMenor
        mayorMenor(numeros);
    }
}
