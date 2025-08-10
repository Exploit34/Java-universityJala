package ejemplosClase;

public class matriz {

    public static void imprimirMatrices(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " | ");
                System.out.print("-");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    // for each
    public static int sumaMatriz(int[][] num) {
        int suma = 0;
        for (int[] i : num) {
            for (int j : i) {
                suma += j;
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        imprimirMatrices(matriz);

        int suma = sumaMatriz(matriz);
        System.out.print("la suma es: " + suma);
    }
}
