package ejemplosClase;

public class returnString {
    public static int[] arrayEntero(String cadena) {
        String[] numerosEnteros = cadena.split("\\.");
        int[] numeros = new int[numerosEnteros.length];

        for (int i=0; i < numerosEnteros.length; i++) {
            numeros[i] = Integer.parseInt(numerosEnteros[i]);
        }

        return numeros;
    }

    public static void main(String[] args) {
        String cadenaNumeros = args[0];

        int[] numeros = arrayEntero(cadenaNumeros);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
