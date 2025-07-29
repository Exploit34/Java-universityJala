public class array {

    public static void guardarNumeros(int[] num, int cantidad) {
        for (int i = 0; i < Math.min(cantidad, num.length); i++) {
            num[i] = i;
        }
    }

    public static void matriz(int m, int n) {
        int numero = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
    }

    public static void matrizLados(int m, int n){
        final int numeroS = 1;
        final int numeroCero = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 || i == m - 1 || j == 0 || j == n - 1) {
                    System.out.print(numeroS + " ");
                } else {
                    System.out.print(numeroCero + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        /*
        final int cantidad = 4;
        int[] myArray = new int[cantidad];

        if (args.length == cantidad) {
            try {
                for (int i = 0; i < cantidad; i++) {
                    myArray[i] = Integer.parseInt(args[i]);
                }

                System.out.println("Array contents:");
                for (int num : myArray) {
                    System.out.print(num + " ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: All arguments must be valid integers.");
            }
        } else {
            System.out.println("Error: Exactly " + cantidad + " arguments are required.");
            guardarNumeros(myArray, cantidad);

            System.out.println("Default array contents:");
            for (int num : myArray) {
                System.out.print(num + " ");
            }
        }*/

        /*
        if (args.length != 2) {
            System.out.println("Uso: la matriz recive dos parametros <m> <n>");
            return;
        }

        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            matriz(m, n);
        } catch (NumberFormatException e) {
            System.out.println("Los argumentos deben ser números enteros.");
        }
         */

        if (args.length != 2) {
            System.out.println("Uso: la matriz recive dos parametros <m> <n>");
            return;
        }

        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);

            matrizLados(m, n);
        } catch (NumberFormatException e) {
            System.out.println("Los argumentos deben ser números enteros.");
        }
    }
}
