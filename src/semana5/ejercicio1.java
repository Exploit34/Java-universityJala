package semana5;

public class ejercicio1 {
    // se creó la función que retorna int
    public static int sumaElementosMatriz(int[][] numSuma) {
        //la variable suma
        int suma = 0;

        // el for que recorre la matriz en la primera diagonal
        for(int i = 0; i < numSuma.length; i++) {
            suma += numSuma[i][i];

            // la segunda diagonal
            if  (i != numSuma.length - 1 - i ) {
                suma += numSuma[i][numSuma.length - 1 - i];
            }
        }

        // return suma
        return suma;
    }

    // se creo el main
    public static void main(String[] args) {

        //la matriz que va en la función sumaElementosMatriz
        int[][] matrizSuma = {
                {1, 2, 4},
                {4, 5, 5},
                {7, 9, 6}
        };

        // Verificar que sea cuadrada
        if (matrizSuma.length != matrizSuma[0].length) {
            System.out.println("No se permite que la matriz sea diferente de cuadrada");
        } else if (matrizSuma.length < 2 || matrizSuma[0].length < 2) { // verifica que sea 2x2
            System.out.println("No se permite que la matriz sea menor a 2x2");
        } else {
            // se creo un int para que se retorne la suma
            int suma = sumaElementosMatriz(matrizSuma);

            //resultado del valor retornado por la función sumaElementosMatriz
            System.out.print("la suma de las diagonales es: " + suma);
        }
    }
}